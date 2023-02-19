package java2_001;

class Calculator3{
	static final double PI=3.14;
	int left,right;
	
	public void setOprands(int left,int right) {
		this.left=left;
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
		Calculator3 c1=new Calculator3();
				System.out.println(c1.PI);
	}

}
