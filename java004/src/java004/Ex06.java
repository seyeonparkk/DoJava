//0�̸� 5 �̻��� ���� ���α׷� ���� 
//������ 2���� �迭 5�� 5�� ����� �Է¹ް� �ش���ǥ x��ȯ�� 2���� �迭�� ��� ����ؼ� �ݺ�����ǵ��� ���� 
package java004;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[][]=new char[5][5];
		while(true) {
			Scanner scan=new Scanner(System.in);
			
			System.out.print("�� �ε��� �Է� >>");
			int row=scan.nextInt();    //��
			
			System.out.print("�� �ε��� �Է� >>");
			int col=scan.nextInt();    //��
			
			if(row<0  || row>=5 || col<0 || row>=5) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			a[row][col]='X';
			
			System.out.println("  0  1  2  3  4");
			for(int i=0; i<a.length; i++) {
				System.out.println(i+" ");   //���� ����ؾ� �ϱ� ������ index
				
				for(int j=0; j<a[i].length; j++) {
					System.out.print(a[i][j]+  " ");
					
				}
				System.out.println();
			}
		}
	}

}
