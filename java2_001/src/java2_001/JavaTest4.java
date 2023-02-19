package java2_001;
//interface����� ������public 
//�������̽��� ����� �����ϴ�
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
		System.out.println("���� ����");
	}
	public void attack() {
		System.out.println("���� ����");
	}
	public void hide() {
		System.out.println("�Ⱥ�������");
	}
}
class Medic implements Unit{
	public void move() {
		System.out.println("�̷� �̷�");
	}
	public void attack() {
		System.out.println("ġ������");
	}
	public void hide() {
		System.out.println("������ �Ϸ�� ");
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
