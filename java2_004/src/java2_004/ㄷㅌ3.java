package java2_004;

public class ㄷㅌ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=5;
		b=0;
		int ar[]= {1,2,3,4,5};
				
		try{
			c=a/b;
			System.out.println(c);
			ar[5]=100;
		}catch(java.lang.ArithmeticException e) {
			System.out.println("0으로 나누기 예외 발생");
		}catch( java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위를 넘었습니다 ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {    //무조건 실행이 된다
			System.out.println("finally");
		}
		
		System.out.println("프로그램 실행 완료");
	}

}
