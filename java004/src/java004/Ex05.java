package java004;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[6][6];
		a[1][1]=1;
		for(int i=2; i<a.length; i++) {
			for(int j=0; j<=i; j++) {
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}
		for(int i=1; i<a.length; i++) {
			for(int j=0; j<=i; j++) {
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}

}
