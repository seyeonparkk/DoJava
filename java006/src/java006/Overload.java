package java006;
class ot{
	static String test() {
		String ot="HOOAI";
		System.out.println(ot);
		return ot;
	}
	static int test(int ot) {
		System.out.println(ot);
		return ot;

	}
	static int test(int ot,int ot1) {
		System.out.print(ot +" ");
		System.out.println(ot1);
		return ot;
		
	}
	static double test(double ot) {
		System.out.println(ot);
		return ot;
	}
}
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ttr;
		
		ot.test();
		ot.test(100);
		ot.test(89,90);
		ttr=ot.test(99.12);
		System.out.println("total test result : "+ttr);
	}
	
	
	
}
