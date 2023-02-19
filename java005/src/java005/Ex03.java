package java005;
class Calculator{
	static double PI=3.14;
	int left,right;
	static int base=0;
	
	public void setOprands(int left,int right) {
		this.left=left;
		this.right=right;
	}
	public void sum() {
		System.out.println(this.left+this.right+base);
	}
	
	public void avg() {
		System.out.println((this.left+this.right+base)/2);
	}
}
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		c1.setOprands(10,20);
		c1.sum();
		
		Calculator c2=new Calculator();
		c2.setOprands(40,10);
		c2.sum();
		
		Calculator.base=10;
		c1.sum();
		c2.sum();
	}

}
