package java2_004;

/*1.e.printStackTrace()
->���ϰ��� ����
�޼��� ȣ���� �ϸ� ���������� ���ܰ�� ȭ�鿡 ����Ѵ� 
���� �ڼ��� ���� ������ ����

2 e.getMessage()
���� �⺻���� ������ ���->������ �ʴ�

3 e.toString()
������ ����� �������� ���ܻ�Ȳ�� �ǹ�*/


class Calculator{
	int left,right;
	public void setOprands(int left,int right) {
		this.left=left;
		this.right=right;
		
	}
	public void divide() {
		try {
			System.out.println("������� ");
			System.out.println(this.left/this.right);
			System.out.println( "  �Դϴ�");
		}catch(Exception e) {
			System.out.println("������ �߻��߽��ϴ� : "+e.getMessage());
		}
	}
}
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
		
		Calculator c2=new Calculator();
		c2.setOprands(10, 5);
		c2.divide();
	}

}
