package java2_001;

abstract class Vehicle{
	protected int speed;
	public void setSpeed(int s) {
		speed=5;
		System.out.println("�ӵ���"+speed+"���� �����߽��ϴ�");
	}
	abstract void show();
}

class Car extends Vehicle{
	private int num;
	private double gas;
	public Car(int n,double g) {
		num=n;
		gas=g;
		System.out.println("������ȣ"+num+"�����"+gas+"�� ���� ����������ϴ�");
	}
	public void show() {
		System.out.println("������ȣ"+num);
		System.out.println("���� ��"+gas);
		System.out.println("�ӵ�"+speed);
	}
}

class Plane extends Vehicle{
	private int flight;
	public Plane(int f) {
		flight=f;
		System.out.println("������ȣ"+flight+"�� ����Ⱑ ����������ϴ�");
	}
	public void show() {
		System.out.println("����� ��ȣ"+flight);
		System.out.println("�ӵ�"+speed);
	}
}

public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1[]=new Vehicle[2];
		v1[0]=new Car(1234,20.5);
		v1[0].setSpeed(60);
		
		v1[1]=new Plane(232);
		v1[1].setSpeed(500);
		
		for(int i=0; i<v1.length; i++) {
			v1[i].show();
		}
	}

}
