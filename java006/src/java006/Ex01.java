package java006;

class Human{
	int age;          //Ŭ���� �ȿ� ����ִ� ����->�������
	String name;
	void intro() {
	System.out.println("�ȳ�"+age+"��"+name+"�Դϴ�");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human Kim=new Human();
		Kim.age=29;
		Kim.name="�����";
		Kim.intro();
	}

}
