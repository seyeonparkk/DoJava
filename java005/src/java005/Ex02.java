package java005;
class Ex{    //Ŭ����=>���赵
	int left,right;
	
	public void setOprands(int left,int right) {      //�޼��� ����
		this.left=left;      //Ex�ȿ����� ����� �� �ִ� ���� �缱��
		this.right=right;   
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex e1=new Ex();       //Ex�� �ڷḦ ����´� ex=>�ν��Ͻ�==��ǰ
		e1.setOprands(10,20);
		e1.sum();
		e1.avg();
	}

}
