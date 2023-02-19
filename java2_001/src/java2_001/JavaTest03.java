package java2_001;
//abstract->extends
//interface->implements    �������̽��� �� �� ū ������ ��Ÿ��

interface Unit{
	void move();
	void attack();
}
class SuperMan implements Unit{
	public void move() {
		System.out.println("������");
	}
	public void attack() {
		System.out.println("��������");
	}
}
class Firebat implements Unit{
	public void move() {
		System.out.println("ȸ����������");
	}
	public void attack() {
		System.out.println("��������");
	}
}
class Marine implements Unit{
	public void move() {
		System.out.println("�������");
	}
	public void attack() {
		System.out.println("�εεεΤǊP");
	}
}
class Zealot  implements Unit{
	public void move() {
		System.out.println("�ڶ׶ٶ�"); 
	}
	public void attack() {
		System.out.println("�찼�찼ìì");
	}
}
class Mutal  implements Unit{
	public void move() {
		System.out.println("�۵��ۤǵ�");
	}
	public void attack() {
		System.out.println("����â ����");
	}
}
public class JavaTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit arUnit[]= {new Marine(),new Zealot(),new Mutal(),new SuperMan(),new Firebat()};
		for(Unit u:arUnit) {
			u.move();
			u.attack();
		}
	}

}
