package java003;
//1. 입력 2.출력 3.삭제 4.끝내기 
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num;
		do {
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			num=scan.nextInt();
			if(num==1) {
				System.out.println("입력");break;
			}else if(num==2) {
		System.out.println("출력");break;
			}
			
		}while(num!=4) ;
			System.out.println("프로그램 종료");
			
			
		}
	
}
		
		
		
	


