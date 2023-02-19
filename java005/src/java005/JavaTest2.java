package java005;

public class JavaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~10 = "+calcsum(1,10));
		
	}
	static int calcsum(int form,int to) {
		int sum=0;
		for(int i=form; i<=to; i++) {
			sum+=i;
		}
		return sum;
	}

}
