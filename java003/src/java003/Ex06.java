package java003;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int num;
		int sum=0;
		do {
			System.out.print("���ڸ� �Է��ϼ��� (�������� 0�̶�� �Է�) : ");
			num=scan.nextInt();
			
			sum+=num;
		}while(num!=0) ;
		System.out.println("���հ� "+sum);
		scan.close();
		}
	}


