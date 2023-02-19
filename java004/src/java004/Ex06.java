//0미만 5 이상의 수는 프로그램 종료 
//문자형 2차원 배열 5행 5열 행고열을 입력받고 해당좌표 x변환해 2차원 배열을 출력 계속해서 반복실행되도록 구현 
package java004;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[][]=new char[5][5];
		while(true) {
			Scanner scan=new Scanner(System.in);
			
			System.out.print("행 인덱스 입력 >>");
			int row=scan.nextInt();    //행
			
			System.out.print("열 인덱스 입력 >>");
			int col=scan.nextInt();    //열
			
			if(row<0  || row>=5 || col<0 || row>=5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			a[row][col]='X';
			
			System.out.println("  0  1  2  3  4");
			for(int i=0; i<a.length; i++) {
				System.out.println(i+" ");   //길이 출력해야 하기 때문에 index
				
				for(int j=0; j<a[i].length; j++) {
					System.out.print(a[i][j]+  " ");
					
				}
				System.out.println();
			}
		}
	}

}
