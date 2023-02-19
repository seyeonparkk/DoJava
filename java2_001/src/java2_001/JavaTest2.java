package java2_001;

abstract class Unit{
	public abstract void move();
	public abstract void attack();
}
class Marine extends Unit{
	public void move() {
		System.out.println("�������");
	}
	public void attack() {
		System.out.println("�εεεΤǊP");
	}
}
class Zealot extends Unit{
	public void move() {
		System.out.println("�ڶ׶ٶ�"); 
	}
	public void attack() {
		System.out.println("�찼�찼ìì");
	}
}
class Mutal extends Unit{
	public void move() {
		System.out.println("�۵��ۤǵ�");
	}
	public void attack() {
		System.out.println("����â ����");
	}
}
public class JavaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit arUnit[]= {new Marine(),new Zealot(),new Mutal()};
		for(Unit u:arUnit) {
			u.move();
			u.attack();
		}
	}

}
