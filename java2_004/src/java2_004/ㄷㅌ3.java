package java2_004;

public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=5;
		b=0;
		int ar[]= {1,2,3,4,5};
				
		try{
			c=a/b;
			System.out.println(c);
			ar[5]=100;
		}catch(java.lang.ArithmeticException e) {
			System.out.println("0���� ������ ���� �߻�");
		}catch( java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ������ �Ѿ����ϴ� ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {    //������ ������ �ȴ�
			System.out.println("finally");
		}
		
		System.out.println("���α׷� ���� �Ϸ�");
	}

}
