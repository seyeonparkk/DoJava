package java005;
class Car{
	String name;
	boolean Gasoline;
	
	
	public void run() {
		if(Gasoline) {
			System.out.println("�θ��θ�");
		}else {
			System.out.println("���ȴ���");
		}
	}
	
	public void stop() {
		System.out.println("������");
	}
}

public class JavaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Korando=new Car();  
		Korando.name="�ڶ���";   //�ڵ��� �̸��� �ڶ����� ���� 
		Korando.Gasoline=false;     //�ڶ����� ���ָ��� ���� ����->boolean���� ����
		System.out.print(Korando.name+" : ");
		
		Korando.stop();
		Korando.run();
		
		System.out.println();
		
		Car Equus=new Car();   
		Equus.name="����";    //�ڵ��� �̸��� ������ ���� 
		Equus.Gasoline=true;   //������ ���ָ��� ��->boolean ->true
		System.out.print(Equus.name+" : ");
		
		Equus.stop();
		Equus.run();
	}

}
