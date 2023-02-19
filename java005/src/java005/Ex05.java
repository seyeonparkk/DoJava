package java005;
class Num{
	int num1,num2;
	
	public void num(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public int  calcsum() {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			if(num1>num2) {
				sum+=i;
				return sum;
		}else if(num2<0) {
			return 0;
		}
		}
		return sum;
}
public class Ex05 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Num e1=new Num();
		e1.num(1,10);
		e1.calcsum();
		
		Num e2=new Num();
		e2.num(15,-100);
		e2.calcsum();
		
		
	}

}
}
