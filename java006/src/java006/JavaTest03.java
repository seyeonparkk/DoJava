package java006;

class Human{
	int age;
	String name;
	
	Human(int age,String name){
		this.age=age;
		this.name=name;
	}
	void intro() {
		System.out.println("안녕"+age+"살"+name+"입니다");
	}
}

class Student extends Human{
	int stnum;
	String major;
	
	Student(int age,String name,int stnum,String major){
		super(stnum, major);   //기존에 갖고있던 값을 그대로 가져옴(human)
		this.stnum=stnum;
		this.major=major;
		
		
	}
	void study() {
		System.out.println("하늘천");
	}
}
public class JavaTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human kim=new Human(29,"김상현");
		kim.intro();
		Student lee=new Student(42,"이승우",9312345,"경엉");
		lee.intro();
		lee.study();
	}

}
