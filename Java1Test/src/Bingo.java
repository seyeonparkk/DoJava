import java.util.*;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("빙고판 크기 지정 : ");
		int num=scan.nextInt();
		int[ ] array=new int[num*num];
		
		for(int i=0; i<array.length; i++) {
			array[i]=(int)(Math.random()*array.length)+1;
			
			for(int j=0; j<i; j++) {
				
				if(array[i]==array[j]) {
					i--;
					break;
				}
			}
		}
			int bingo[][]=new int[num][num];
			int index=0;
			System.out.println("====빙고게임 시작====");
			
			//빙고판 출력
			System.out.println(bingo[num][num]);
			
			//입력한 숫자와 만나면 0	
			for(int i = 0 ; i <num  ; i++) {
			    for(int j = 0 ; j < num ; j++) {
			        if(bingo[i][j] == index) {
			            bingo[i][j] = 0;
			            break ;
			        }
			    }
			}
			
		

}
}
