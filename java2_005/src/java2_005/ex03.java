package java2_005;
//�Ű������� ���׸�
class ex{
	static <t> void print(t a) {
		System.out.println(a);
	}
}
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex.<Integer>print(1234);
		ex.<String>print("���ڿ�");
	}

}
