package java006;

class Human{
	int age;
	String name;
	
	Human(int age,String name){
		this.age=age;
		this.name=name;
	}
	void intro() {
		System.out.println("�ȳ�"+age+"��"+name+"�Դϴ�");
	}
}

class Student extends Human{
	int stnum;
	String major;
	
	Student(int age,String name,int stnum,String major){
		super(stnum, major);   //������ �����ִ� ���� �״�� ������(human)
		this.stnum=stnum;
		this.major=major;
		
		
	}
	void study() {
		System.out.println("�ϴ�õ");
	}
}
public class JavaTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human kim=new Human(29,"�����");
		kim.intro();
		Student lee=new Student(42,"�̽¿�",9312345,"���");
		lee.intro();
		lee.study();
	}

}
