package java2_001;

abstract class Vehicle{
	protected int speed;
	public void setSpeed(int s) {
		speed=5;
		System.out.println("속도를"+speed+"으로 변경했습니다");
	}
	abstract void show();
}

class Car extends Vehicle{
	private int num;
	private double gas;
	public Car(int n,double g) {
		num=n;
		gas=g;
		System.out.println("차량번호"+num+"연료양"+gas+"인 차가 만들어졌습니다");
	}
	public void show() {
		System.out.println("차량번호"+num);
		System.out.println("연료 양"+gas);
		System.out.println("속도"+speed);
	}
}

class Plane extends Vehicle{
	private int flight;
	public Plane(int f) {
		flight=f;
		System.out.println("비행기번호"+flight+"인 비행기가 만들어졌습니다");
	}
	public void show() {
		System.out.println("비행기 번호"+flight);
		System.out.println("속도"+speed);
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
