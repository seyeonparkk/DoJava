package java2_004;
class Do{
	public void connect() {
		System.out.println("����");
	}
	public void send() {
		System.out.println("����");
	}
	public void clear() {
		System.out.println("����");
	}
}
public class test1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Do d1=new Do();
		try {
			
			d1.connect();
			d1.send();
		}finally {
			d1.clear();
		}
	}

}
