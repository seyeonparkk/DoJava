package java2_002;
//������
//���� ��ɵ� �� ���� �ϰ��� �ϴ� ��ɸ� �����ٰ� ��->������
//����θ� Ŭ������ �����, ���ο� ȣ��
class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";}
	public String y() {return "y";}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B();   //������ B������, A�� �����ִ� ��ó�� ->�������� ������ B
		System.out.println(obj.x());
	}

}
