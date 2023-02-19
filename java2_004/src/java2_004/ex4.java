package java2_004;

public class ex4 {

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
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				System.out.println("e.printStackTrace()");
				e.printStackTrace();
			}finally {
				System.out.println("finally");
			}
		}
	}
	public class ex04 {

		public void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator c1=new Calculator();
			c1.setOprands(10, 0);
			c1.divide();
		
		}

	}
}