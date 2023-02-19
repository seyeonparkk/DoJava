package java003;
//계속 입력을 하다가 0을 만나면 그때까지의 입력한 개수, 합계,평균 구하기
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count=0;
		int total=0;
		while(true) {
			System.out.println("숫자입력 : ");
			int num=scan.nextInt();
			if(num==0) {
				break;
			}
				total+=num;
				count++;
		}
				System.out.println("입력한 개수 : "+count);
				System.out.println("합계 : "+total);
				System.out.printf("평균 : %.2f",total/(double)count);
			
		}
	}


