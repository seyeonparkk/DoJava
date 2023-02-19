//점수를 입력받아 합격,불합격
//0 || 100 break
//80점 이상이면 합격
//80점 안된다면 불합격

package java003;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	         
	        while(true) {          //무조건 실행
	        	 Scanner scan = new Scanner(System.in);
	 	        System.out.print("점수를 입력하세요 : ");
	 	        int num = scan.nextInt(); 
	 	        
			if(num<0 || num>100) {
				break;
			}else if(num>=80){
				System.out.println("합격입니다");
			}else {
				System.out.println("불합격입니다");
			}
		}
	}

}
