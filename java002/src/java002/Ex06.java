//신장,몸무게,이름 입력 후 평균 몸무게와 얼마나 쪄야 하는지 혹은 얼마나 빼야 하는지 %.2f
package java002;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("당신의 키는?");
		int height=scan.nextInt();
		
		System.out.println("당신의 몸무게는?");
		double weight=scan.nextDouble();
		
		System.out.println("당신의 이름은? ");
		String name=scan.next();
		
		
		  final double WEIGHT=(height-100)*0.9;
		  
		  if(weight>WEIGHT) { //비만
		  //System.out.println(name+" 님의 평균 몸무게는"+WEIGHT+"이고 "+(weight-WEIGHT)
		  //+"만큼 빼야합니다");
		  System.out.printf("%s님의 평균 몸무게는 %.2f이고 %.2f만큼 뺴야합니다",name,WEIGHT,(weight-
		  WEIGHT)); }else{ //마름
		  //System.out.println(name+" 님의 평균 몸무게는"+WEIGHT+"이고 "+(WEIGHT-weight)
		  //+"만큼 쪄야합니다");
		  System.out.printf("%s님의 평균 몸무게는 %.2f이고 %.2f만큼 쪄야합니다",name,WEIGHT,(WEIGHT-
		  weight));
		  
		  }
		 
		/*
		 * double result=(height-100)*0.9; double total=result=weight;
		 * 
		 * if(result<=weight) {
		 * 
		 * }
		 */
	}
}


