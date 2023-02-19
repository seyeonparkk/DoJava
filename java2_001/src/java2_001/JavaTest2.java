package java2_001;

abstract class Unit{
	public abstract void move();
	public abstract void attack();
}
class Marine extends Unit{
	public void move() {
		System.out.println("¾ÆÀå¾ÆÀå");
	}
	public void attack() {
		System.out.println("µÎµÎµÎµÎ¤ÇŠP");
	}
}
class Zealot extends Unit{
	public void move() {
		System.out.println("µÚ¶×¶Ù¶×"); 
	}
	public void attack() {
		System.out.println("¿ì°¼¿ì°¼Ã¬Ã¬");
	}
}
class Mutal extends Unit{
	public void move() {
		System.out.println("ÆÛµæÆÛ¤Çµæ");
	}
	public void attack() {
		System.out.println("»ïÁöÃ¢ È×È×");
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
