package java005;
class Car{
	String name;
	boolean Gasoline;
	
	
	public void run() {
		if(Gasoline) {
			System.out.println("부릉부릉");
		}else {
			System.out.println("덜컹덜컹");
		}
	}
	
	public void stop() {
		System.out.println("끼이익");
	}
}

public class JavaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Korando=new Car();  
		Korando.name="코란도";   //자동차 이름을 코란도로 정의 
		Korando.Gasoline=false;     //코란도는 가솔린을 쓰지 않음->boolean으로 선언
		System.out.print(Korando.name+" : ");
		
		Korando.stop();
		Korando.run();
		
		System.out.println();
		
		Car Equus=new Car();   
		Equus.name="에쿠스";    //자동차 이름을 에쿠스로 정의 
		Equus.Gasoline=true;   //에쿠스는 가솔린을 씀->boolean ->true
		System.out.print(Equus.name+" : ");
		
		Equus.stop();
		Equus.run();
	}

}
