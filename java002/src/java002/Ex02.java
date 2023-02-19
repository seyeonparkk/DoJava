package java002;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*boolean a=true;
		String b="false";
		boolean c=10>5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}*/
		/*
		 * int num1=10; int num2=20; int result; //저장공간을 담을수는 있지만 값이 들어있지 않음 그렇기 떄문에
		 * 무엇이든 담을 수 있음 int result=NULL,result=0;
		 * 
		 * num1--; System.out.println(num1);
		 * 
		 * num1--; System.out.println(num1); //차례대로 진행되기 때문에 10이 됨->위에서 값에서 계산
		 * 
		 * result=num2++; System.out.println(result);
		 * 
		 * result=++num2; //증감연산자가 머넞 발생되고 대입연산자가 실행 System.out.println(result);
		 */
		int num1=15;
		int num2=12;
		int result;
		result=num1+num2;//num1+=num2
		System.out.println(result);
		
		result=num1-num2;     
		System.out.println(result);
		
		result=num1*num2;     
		System.out.println(result);
		
		result=num1/num2;     
		System.out.println(result);
		
		result=num1%num2;     
		System.out.println(result);
		
	}
}
