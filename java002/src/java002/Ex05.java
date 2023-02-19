//홀수 짝수 구분
package java002;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("좋아하는 숫자는? : ");
		int num=scan.nextInt();
		if(num%2==1) {
			System.out.println("홀수입니다");
		}else {
			System.out.println("짝수입니다");
		}
	}

}
