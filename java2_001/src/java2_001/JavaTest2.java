package java2_001;

abstract class Unit{
	public abstract void move();
	public abstract void attack();
}
class Marine extends Unit{
	public void move() {
		System.out.println("아장아장");
	}
	public void attack() {
		System.out.println("두두두두ㅗ둗");
	}
}
class Zealot extends Unit{
	public void move() {
		System.out.println("뒤뚱뛰뚱"); 
	}
	public void attack() {
		System.out.println("우갸우갸챙챙");
	}
}
class Mutal extends Unit{
	public void move() {
		System.out.println("퍼득퍼ㅗ득");
	}
	public void attack() {
		System.out.println("삼지창 휙휙");
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
