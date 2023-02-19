package java004;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum,total=0;   //sum=행의 총 합계 total=열의 총 합계
		int a[][]=new int[3][3];
		
		for(int i=0; i<a.length; i++) {
			System.out.print(i+1+"번째 학생의 점수 : ");
		
		for(int j=0; j<a[i].length; j++) {
			a[i][j]=scan.nextInt();
			total+=a[i][j];
		}
		}
		System.out.println("     국어   영어  수학  총점");
		for(int i=0; i<a.length; i++) {
			System.out.println(i+1+"번"+" ");   //길이 출력해야 하기 때문에 index
			for(int j=0; j<a[i].length; j++) {
				
			}
		}
	}

}
