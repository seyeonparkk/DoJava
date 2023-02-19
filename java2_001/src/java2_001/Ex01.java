package java2_001;

abstract class A{    //추상클래스 A  어떤 일을 하겠다고 말함
	public abstract int b();
	public void d() {
		System.out.println("world");
	}
}
class B extends A{    //B클래스는 A의 상속자
	public int b() {return 1;}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
				System.out.println(obj.b());
	}

}
