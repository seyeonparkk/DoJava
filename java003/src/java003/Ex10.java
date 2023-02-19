package java003;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iarr1[]=new int[10];
		int iarr2[]=new int[10];
		
		for(int i=0; i<iarr1.length; i++) {
			iarr1[i]=i+1;   //1~10의 숫자까지 순서대로 배열에 넣는다
		}
		
		for(int i=0; i<iarr2.length; i++) {
			iarr2[i]=(int)(Math.random()*10)+1;   //1~10의 숫자까지 순서대로 배열에 넣는다
		}
		
		for(int i=0;i<iarr1.length; i++) {
			System.out.println(iarr1[i]);
		}
		
		for(int i=0;i<iarr2.length; i++) {
			System.out.println(iarr2[i]);
		}
		
	}

}
