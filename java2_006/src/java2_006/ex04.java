package java2_006;
class multi extends Thread{
	public multi(String threadname) {
		this.setName(threadname);
	}
	public void run() {
		for(int i=0; i<1000; i++) {  //�ð� ������Ű�� ����
			int x=100;x+=i;
			for(int j=0; j<10000; j++) {
				x+=j;
			}
		}
		System.out.println(this.getName()+"thread start");
	}
}
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0; i<=5; i++) {
	Thread th=new multi("[thread "+i+"]");    //������ ����
	if(i==5)
		th.setPriority(Thread.MAX_PRIORITY);  //���� ���� ����
	else
		th.setPriority(Thread.MIN_PRIORITY);
	th.start();
}
	}

}
