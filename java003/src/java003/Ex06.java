package java003;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int num;
		int sum=0;
		do {
			System.out.print("숫자를 입력하세요 (끝날때는 0이라고 입력) : ");
			num=scan.nextInt();
			
			sum+=num;
		}while(num!=0) ;
		System.out.println("총합계 "+sum);
		scan.close();
		}
	}


