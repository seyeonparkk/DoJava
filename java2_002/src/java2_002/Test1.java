package java2_002;

class HandPhone{
	void call() {System.out.println("��ȭ�� �Ǵ�");}
	void receive() {System.out.println("��ȭ�� �޴´�");}
}
interface Camera{
	void takepicture();
}
class HandPhoneCamera extends HandPhone implements Camera{
	public void takepicture() {System.out.println("��Ĭ ������ ��´�");}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandPhoneCamera myphone=new HandPhoneCamera();
		myphone.call();
		myphone.takepicture();
	}

}
