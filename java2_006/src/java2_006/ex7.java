package java2_006;
class Human{
	int age;
	Name name;
	
	class Name{  //��ø Ŭ����
		String first,family;
		Name(String first,String family){
			this.first=first;
			this.family=family;
		}
		void outAge() {
			System.out.println("����"+age+"�� �Դϴ�");
		}
	}
	Human(int age,String first,String family){
		this.age=age;
		this.name=new Name(first,family);
	}
	void intro() {
		System.out.println(age+"��"+name.family+name.first+"�Դϴ�");
	}
}
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human kim=new Human(29,"����","��");
		kim.intro();
		kim.name.outAge();
	}

}
