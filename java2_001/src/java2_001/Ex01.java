package java2_001;

abstract class A{    //�߻�Ŭ���� A  � ���� �ϰڴٰ� ����
	public abstract int b();
	public void d() {
		System.out.println("world");
	}
}
class B extends A{    //BŬ������ A�� �����
	public int b() {return 1;}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
				System.out.println(obj.b());
	}

}
