package java2_001;

abstract class Calculator{
	int left,right;
	
	public void setOprands(int left,int right) {
		this.left=left;
		this.right=right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}

class Calculator2 extends Calculator{
	public void sum() {
		System.out.println("+sum:"+(this.left+this.right));
	}
	
	public void avg() {
		System.out.println("+sum:"+(this.left+this.right)/2);
	}
}

class CalculatorMinus extends Calculator{
	public void sum() {
		System.out.println("-sum:"+(this.left+this.right));
	}
	
	public void avg() {
		System.out.println("-sum:"+(this.left+this.right)/2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calculator2  c1=new  Calculator2 ();
		 c1.setOprands(10,20);
		 c1.run();
		 
		 CalculatorMinus  c2=new  CalculatorMinus ();
		 c2.setOprands(10,20);
		 c2.run();
	}

}
