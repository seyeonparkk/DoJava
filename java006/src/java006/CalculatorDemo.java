package java006;
//�����ε��� Ȱ���Ͽ� �ۼ�
class SubstractionableCalculator{
	int left,right;
	int third=0;     //�����ε� �ϱ� ���� ���� ����
	
	void setOprands(int left,int right) {
		this.left=left;  //this->�ڱ��ڽ�->ȿ�뼺�� ũ�� ������ ���� ���� �ʾƵ� ��
		this.right=right;
	}
	void setOprands(int left,int right,int third) {
		this.left=left;
		this.right=right;
		this.third=third;
	}
	void sum() {
		System.out.println(this.left+this.right+this.third);
	}
	void avg() {
		System.out.println((this.left+this.right+this.third)/2);
	}
	void substract() {
		System.out.println(this.left-this.right+this.third);
	}
	
}
public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionableCalculator c1=new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		
	}

}
