package java2_004;

/*1.e.printStackTrace()
->리턴값이 없다
메서드 호출을 하면 내부적으로 예외결과 화면에 출력한다 
가장 자세한 예외 정보를 제공

2 e.getMessage()
가장 기본적인 내용을 출력->상세하지 않다

3 e.toString()
수학적 계싼의 과정에서 예외상황을 의미*/


class Calculator{
	int left,right;
	public void setOprands(int left,int right) {
		this.left=left;
		this.right=right;
		
	}
	public void divide() {
		try {
			System.out.println("계산결과는 ");
			System.out.println(this.left/this.right);
			System.out.println( "  입니다");
		}catch(Exception e) {
			System.out.println("오류가 발생했습니다 : "+e.getMessage());
		}
	}
}
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
		
		Calculator c2=new Calculator();
		c2.setOprands(10, 5);
		c2.divide();
	}

}
