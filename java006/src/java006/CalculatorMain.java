package java006;

class Calculator{
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
	class subCalculator extends Calculator {    //calculator 상속자가 subcalculator->기능을 그대로 갖고옴 설계하지 않아도 기능구현 ㄱㄴ
		public void substract() {
			System.out.println(this.left-this.right);
		}
	}
}
public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		//c1.substract();
	}

}
