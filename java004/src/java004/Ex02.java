package java004;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a=new int[][] {
			{5,8,10,6,4},
			{11,20,1,3,2},
			{7,9,14,22,3}
		};
		for(int i=0;i<a.length; i++) {
		 for(int j=0; j<a[i].length; j++) {
			 System.out.printf("%2d",a[i][j]);
		 }
		 System.out.println();    //열을 바꿀 수 있음
		}
	}

}
