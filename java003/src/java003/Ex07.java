package java003;
//1. �Է� 2.��� 3.���� 4.������ 
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num;
		do {
			System.out.println("1. �Է��ϱ�");
			System.out.println("2. ����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. ������");
			num=scan.nextInt();
			if(num==1) {
				System.out.println("�Է�");break;
			}else if(num==2) {
		System.out.println("���");break;
			}
			
		}while(num!=4) ;
			System.out.println("���α׷� ����");
			
			
		}
	
}
		
		
		
	


