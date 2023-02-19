package java2_002;


class Human{
	String name;
	int age;
	Human(int age,String name){
		this.age=age;
		this.name=name;
	}
	void hi(){
		System.out.println("안녕"+age+"살"+name+"입니다");
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
		System.out.println("충성 군번"+num+"입니다");
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
		System.out.println(age+"살"+name+rich+"전문털이범전과"+crime+"범입니다");
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
		System.out.println(major+"학과"+stage+name+"입니다");
	}

}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human arHuman[]= {new Human(29,"김상형"),new Student(42,"이승우",9312345,"경영학과"),new Thief(29,"박똥꾸",13,14),new Soldier(20,"ㅏㅂㅈ거",234234)};
		
		dumpGroup(arHuman);
	}
		
		static void dumpGroup(Human[]group) {
		for(Human h:group) {
			h.hi();
		}
	
		
	
}
	}
