//3�� 3���� �迭 �ΰ��� �����ϰ� �Է¹޾� �� �迭�� ���� ���Ͽ� ����ϴ� ���α׷� �ۼ�
package java004;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	int a[][]=new int[3][3];
	for(int i=0; i<a.length; i++) {    //����
		System.out.printf("ù ��° �迭"+a[i]+"��",i+1);
		for(int j=0; j<a[i].length; i++) {
			 a[i][j]=scan.nextInt(); 
		}
	}
	int b[][]=new int[3][3];
	for(int i=0; i<b.length; i++) {
		for(int j=0; j<b[i].length; i++) {
			b[i][j]=i+1;   
			System.out.println("ù ��° �迭"+b[i][j]+"��");
			 a[i][j]=scan.nextInt();
			 
		}
	}
	
	int sum[][]=new int[3][3];   //���ϴ� �迭
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			sum[i][j]=a[i][j]+b[i][j];
			System.out.println(sum[i][j]+" ");
		}
	}
	}

}
