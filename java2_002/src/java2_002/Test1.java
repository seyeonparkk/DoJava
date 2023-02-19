package java2_002;

class HandPhone{
	void call() {System.out.println("전화를 건다");}
	void receive() {System.out.println("전화를 받는다");}
}
interface Camera{
	void takepicture();
}
class HandPhoneCamera extends HandPhone implements Camera{
	public void takepicture() {System.out.println("찰칵 사진을 찍는다");}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandPhoneCamera myphone=new HandPhoneCamera();
		myphone.call();
		myphone.takepicture();
	}

}
