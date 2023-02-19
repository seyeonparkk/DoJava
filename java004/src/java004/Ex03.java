//3행 3열의 배열 두개를 선언하고 입력받아 두 배열의 합을 구하여 출력하는 프로그램 작성
package java004;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	int a[][]=new int[3][3];
	for(int i=0; i<a.length; i++) {    //세로
		System.out.printf("첫 번째 배열"+a[i]+"행",i+1);
		for(int j=0; j<a[i].length; i++) {
			 a[i][j]=scan.nextInt(); 
		}
	}
	int b[][]=new int[3][3];
	for(int i=0; i<b.length; i++) {
		for(int j=0; j<b[i].length; i++) {
			b[i][j]=i+1;   
			System.out.println("첫 번째 배열"+b[i][j]+"행");
			 a[i][j]=scan.nextInt();
			 
		}
	}
	
	int sum[][]=new int[3][3];   //더하는 배열
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			sum[i][j]=a[i][j]+b[i][j];
			System.out.println(sum[i][j]+" ");
		}
	}
	}

}
