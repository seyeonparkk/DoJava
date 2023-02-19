package java2_004;
class Do{
	public void connect() {
		System.out.println("立加");
	}
	public void send() {
		System.out.println("傈价");
	}
	public void clear() {
		System.out.println("秦力");
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
