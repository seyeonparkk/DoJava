package java006;
	
	

public class JavaTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3,5="+getMax(3,5));
		System.out.println("3.4,5.6="+getMax(3.4,5.6));
	}
	 static  int getMax(int left,int right) {
			if(left>right) {
				System.out.println(left);
			}else {
				System.out.println(right);
			}
			return right;
	 }
			
			static  double getMax(double left,double right) {
				if(left>right) {
					System.out.println(left);
				}else {
					System.out.println(right);
				}
				return right;
			}
}
