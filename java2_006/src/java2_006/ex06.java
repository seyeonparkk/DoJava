package java2_006;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread worker=new PrintThread();
		worker.setDaemon(true);   //ÂüÁ¶¿ë
		worker.start();
		
		for(int i=0; i<20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {;}
	}

}
}
class PrintThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("save");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {;}
		}
	}
}
