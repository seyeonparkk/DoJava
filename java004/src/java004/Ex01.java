package java004;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=50;   //총 2500개의 랜덤하는 방이 생김
		int array[][]=new int[N][N];
		
		for(int i=0; i<N;i++) {
			for(int j=0; j<N; j++) {
				array[i][j]=(int)(Math.random()*10);
			}
		}
		//출력하는 for문
		for(int i=0; i<N; i++) {    //행
			for(int j=0; j<N; j++) {    //열
				System.out.println(array[i][j]);
			}
			System.out.println();
		}
	}

}
