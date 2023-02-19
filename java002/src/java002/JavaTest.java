package java002;

public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days;
		int month=5;
		
		switch(month) {
		case 2:
			days=28;break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;break;
			default:
				days=31;break;
		}
		System.out.println(month+"월은"+days+"일까지 있습니다");
	}

}
