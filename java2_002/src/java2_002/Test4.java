package java2_002;


class Human{
	String name;
	int age;
	Human(int age,String name){
		this.age=age;
		this.name=name;
	}
	void hi(){
		System.out.println("�ȳ�"+age+"��"+name+"�Դϴ�");
	}
}

class Soldier extends Human{
int num;
	Soldier(int age, String name,int num) {
		super(age, name);
		// TODO Auto-generated constructor stub
		this.num=num;
	}
	void hi() {
		System.out.println("�漺 ����"+num+"�Դϴ�");
	}
}

class Thief extends Human{
int rich;
int crime;
	Thief(int age, String name,int rich,int crime) {
		super(age, name);
		// TODO Auto-generated constructor stub
		this.rich=rich;
		this.crime=crime;
	}
	void hi() {
		System.out.println(age+"��"+name+rich+"�������̹�����"+crime+"���Դϴ�");
	}
}

class Student extends Human{
	int stage;
	String major;
	

	Student(int age, String name,int stage,String major) {
		super(age,name);
		// TODO Auto-generated constructor stub
		this.stage=stage;
		this.major=major;
	}
	void hi() {
		System.out.println(major+"�а�"+stage+name+"�Դϴ�");
	}

}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human arHuman[]= {new Human(29,"�����"),new Student(42,"�̽¿�",9312345,"�濵�а�"),new Thief(29,"�ڶ˲�",13,14),new Soldier(20,"��������",234234)};
		
		dumpGroup(arHuman);
	}
		
		static void dumpGroup(Human[]group) {
		for(Human h:group) {
			h.hi();
		}
	
		
	
}
	}
