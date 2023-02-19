package java002;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("현재는 몇 월 입니까?");
		int a=scan.nextInt();    //.-?>참조
		/*
		 * if(a==1 || a==2 || a==3) { System.out.println("봄입니다"); }else if(a==4 || a==5
		 * || a==6) { System.out.println("여름입니다"); }else if(a==7 || a==8 || a==9) {
		 * System.out.println("가을입니다"); }else { System.out.println("겨울입니다"); }
		 */
		if(a>=9&&a<=11) {
			System.out.println("가을");
		}else if(a>=6&&a<=8) {
			System.out.println("여름");
		}else if(a>=3&&a<=5) {
			System.out.println("여름");
	}else {
		System.out.println("겨울");
	}

	}
}
