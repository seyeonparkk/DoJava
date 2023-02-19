package java002;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=10;
		String f="20";
		boolean result;
		result=a>b;
		System.out.println(result);
		
		result=a<b;
		System.out.println(result);
		
		result=a<=b;
		System.out.println(result);
		
		result=a>b;          //다른 자료형은 서로 비교 안됨
		System.out.println(result);
		
		result=a!=b;
		System.out.println(result);
	}

}
