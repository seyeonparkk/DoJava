package java005;
class Time{
	boolean AM;
	int h,m,s;
	
	 void clock() {      //public�� �����̱� ������, ���°��� ����.
		if(AM) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		System.out.println(h+"��"+m+"��"+s+"��");
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
