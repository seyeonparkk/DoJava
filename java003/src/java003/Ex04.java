//������ �Է¹޾� �հ�,���հ�
//0 || 100 break
//80�� �̻��̸� �հ�
//80�� �ȵȴٸ� ���հ�

package java003;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	         
	        while(true) {          //������ ����
	        	 Scanner scan = new Scanner(System.in);
	 	        System.out.print("������ �Է��ϼ��� : ");
	 	        int num = scan.nextInt(); 
	 	        
			if(num<0 || num>100) {
				break;
			}else if(num>=80){
				System.out.println("�հ��Դϴ�");
			}else {
				System.out.println("���հ��Դϴ�");
			}
		}
	}

}
