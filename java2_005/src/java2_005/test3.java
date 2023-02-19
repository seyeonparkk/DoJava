package java2_005;
class Human{
	void intro() {System.out.println("나 사랑");
}
	class Student extends Human{
		void intro() {System.out.println("나 학생");
	}
		class Box<t extends Human>{
			t value;
			Box(t value){this.value=value;}
			t get() {return value;}
			void set(t value) {this.value=value;}
			void intro() {
				value.intro();
			}
		}
	
public class test3 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Human h=new Human();
		Box<Human> bh=new Box<Human>(h);
		bh.intro();
		
		Student s=new Student();
		Box<Human> bs=new Box<Human>(s);
		bs.intro();
	
	}

}
	}
}
