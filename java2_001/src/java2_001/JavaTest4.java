package java2_001;
//interface멤버는 무조건public 
//인터페이스도 상속이 가능하단
interface Unit{
	void move();
	void attack();
	void hide();
}
interface Hideable extends Unit{
	void hide();
}
interface Healing extends Unit{
	void heal();
}

class DarkTemlper implements Unit{
	public void move() {
		System.out.println("스믈 스믈");
	}
	public void attack() {
		System.out.println("슉슉 낫질");
	}
	public void hide() {
		System.out.println("안보이지롱");
	}
}
class Medic implements Unit{
	public void move() {
		System.out.println("쫄래 쫄래");
	}
	public void attack() {
		System.out.println("치지지직");
	}
	public void hide() {
		System.out.println("마린씨 일루와 ");
	}
}
public class JavaTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit arUnit[]= {new  DarkTemlper(),new Medic()};
		for(Unit u:arUnit) {
			u.hide();
		}
	}

}
