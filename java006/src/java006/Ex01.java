package java006;

class Human{
	int age;          //클래스 안에 들어있는 변수->멤버변수
	String name;
	void intro() {
	System.out.println("안녕"+age+"살"+name+"입니다");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human Kim=new Human();
		Kim.age=29;
		Kim.name="김상형";
		Kim.intro();
	}

}
