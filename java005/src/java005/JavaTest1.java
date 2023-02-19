package java005;
//1~10까지의 합의 기능을 가진  메서드 
//15~100의 합의 기능을 가진 메서드
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
