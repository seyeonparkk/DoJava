package java2_001;
//abstract->extends
//interface->implements    ÀÎÅÍÆäÀÌ½º°¡ Á» ´õ Å« ¹üÀ§¸¦ ³ªÅ¸³¿

interface Unit{
	void move();
	void attack();
}
class SuperMan implements Unit{
	public void move() {
		System.out.println("½´¿ì¿ì¿õ");
	}
	public void attack() {
		System.out.println("ºüÁ÷ºüÁ÷");
	}
}
class Firebat implements Unit{
	public void move() {
		System.out.println("È¸¸£¸£¸£¸£¸£");
	}
	public void attack() {
		System.out.println("ºüÁ÷ºüÁ÷");
	}
}
class Marine implements Unit{
	public void move() {
		System.out.println("¾ÆÀå¾ÆÀå");
	}
	public void attack() {
		System.out.println("µÎµÎµÎµÎ¤ÇŠP");
	}
}
class Zealot  implements Unit{
	public void move() {
		System.out.println("µÚ¶×¶Ù¶×"); 
	}
	public void attack() {
		System.out.println("¿ì°¼¿ì°¼Ã¬Ã¬");
	}
}
class Mutal  implements Unit{
	public void move() {
		System.out.println("ÆÛµæÆÛ¤Çµæ");
	}
	public void attack() {
		System.out.println("»ïÁöÃ¢ È×È×");
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
