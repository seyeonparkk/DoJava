package java2_006;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread worker=new PrintThread();
		worker.start();
		
		for(int i=0; i<30; i++) {
			System.out.println("o");
			try {Thread.sleep(200);}catch (InterruptedException e) {;}
			if(i==5)worker.suspend();  //����ߴ�
			if(i==25)worker.resume();  //�ٽ� ����
			
		}
	}

}
class PrintThread extends Thread{
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.println("x");
			try {Thread.sleep(100);}catch (InterruptedException e) {;}
	}
}
}
