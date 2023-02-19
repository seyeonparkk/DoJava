package java006;
//오버로딩을 활용하여 작성
class SubstractionableCalculator{
	int left,right;
	int third=0;     //오버로딩 하기 위한 변수 선언
	
	void setOprands(int left,int right) {
		this.left=left;  //this->자기자신->효용성이 크기 때문에 굳이 쓰지 않아도 됨
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
