package java005;
//1~10������ ���� ����� ����  �޼��� 
//15~100�� ���� ����� ���� �޼���
class He{
	int sum;
	int i;
	
	public void num(int i,int sum){
		this.sum=sum;
		this.i=i;
	}
	public void sum() {
		System.out.println(this.sum+=this.i);
	}
}
public class JavaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		He e1=new He();
		e1.num(10, 40);
		e1.sum();
			
		
	}

}
