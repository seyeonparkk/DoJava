package java003;
//��� �Է��� �ϴٰ� 0�� ������ �׶������� �Է��� ����, �հ�,��� ���ϱ�
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count=0;
		int total=0;
		while(true) {
			System.out.println("�����Է� : ");
			int num=scan.nextInt();
			if(num==0) {
				break;
			}
				total+=num;
				count++;
		}
				System.out.println("�Է��� ���� : "+count);
				System.out.println("�հ� : "+total);
				System.out.printf("��� : %.2f",total/(double)count);
			
		}
	}


