package java004;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum,total=0;   //sum=���� �� �հ� total=���� �� �հ�
		int a[][]=new int[3][3];
		
		for(int i=0; i<a.length; i++) {
			System.out.print(i+1+"��° �л��� ���� : ");
		
		for(int j=0; j<a[i].length; j++) {
			a[i][j]=scan.nextInt();
			total+=a[i][j];
		}
		}
		System.out.println("     ����   ����  ����  ����");
		for(int i=0; i<a.length; i++) {
			System.out.println(i+1+"��"+" ");   //���� ����ؾ� �ϱ� ������ index
			for(int j=0; j<a[i].length; j++) {
				
			}
		}
	}

}
