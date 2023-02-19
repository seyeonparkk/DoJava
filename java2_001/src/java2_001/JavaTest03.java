package java2_001;
//abstract->extends
//interface->implements    인터페이스가 좀 더 큰 범위를 나타냄

interface Unit{
	void move();
	void attack();
}
class SuperMan implements Unit{
	public void move() {
		System.out.println("슈우우웅");
	}
	public void attack() {
		System.out.println("빠직빠직");
	}
}
class Firebat implements Unit{
	public void move() {
		System.out.println("회르르르르르");
	}
	public void attack() {
		System.out.println("빠직빠직");
	}
}
class Marine implements Unit{
	public void move() {
		System.out.println("아장아장");
	}
	public void attack() {
		System.out.println("두두두두ㅗ둗");
	}
}
class Zealot  implements Unit{
	public void move() {
		System.out.println("뒤뚱뛰뚱"); 
	}
	public void attack() {
		System.out.println("우갸우갸챙챙");
	}
}
class Mutal  implements Unit{
	public void move() {
		System.out.println("퍼득퍼ㅗ득");
	}
	public void attack() {
		System.out.println("삼지창 휙휙");
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
