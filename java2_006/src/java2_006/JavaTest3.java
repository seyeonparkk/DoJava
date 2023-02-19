package java2_006;

public class JavaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread1 a=new PrintThread1();
		PrintThread2 b=new PrintThread2();
		a.start();
		b.setPriority(Thread.MAX_PRIORITY);
		b.start();
	}

}
class PrintThread1 extends Thread{
	public void run() {
		double sum=0;
		for(int i=0; i<10000000; i++) {
			sum+=Math.cos(i);
		}
		System.out.println("cos = "+sum);
	}
}
class PrintThread2 extends Thread{
	public void run() {
		double sum=0;
		for(int i=0; i<10000000; i++) {
			sum+=Math.sin(i);
		}
		System.out.println("sin = "+sum);
	}
}