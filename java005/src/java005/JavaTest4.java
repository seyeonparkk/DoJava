package java005;
class Time{
	boolean AM;
	int h,m,s;
	
	 void clock() {      //public은 공용이기 때문에, 쓰는것이 좋다.
		if(AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		System.out.println(h+"시"+m+"분"+s+"초");
	}
	
}

public class JavaTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time=new Time();
		time.AM=true;
		time.h=12;
		time.m=34;
		time.s=56; 
		
		time.clock();
		
	}

}
