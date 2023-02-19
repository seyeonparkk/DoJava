package java2_006;
class Human{
	int age;
	Name name;
	
	class Name{  //중첩 클래스
		String first,family;
		Name(String first,String family){
			this.first=first;
			this.family=family;
		}
		void outAge() {
			System.out.println("저는"+age+"살 입니다");
		}
	}
	Human(int age,String first,String family){
		this.age=age;
		this.name=new Name(first,family);
	}
	void intro() {
		System.out.println(age+"살"+name.family+name.first+"입니다");
	}
}
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human kim=new Human(29,"상형","김");
		kim.intro();
		kim.name.outAge();
	}

}
