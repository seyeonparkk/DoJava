package java004;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=50;   //�� 2500���� �����ϴ� ���� ����
		int array[][]=new int[N][N];
		
		for(int i=0; i<N;i++) {
			for(int j=0; j<N; j++) {
				array[i][j]=(int)(Math.random()*10);
			}
		}
		//����ϴ� for��
		for(int i=0; i<N; i++) {    //��
			for(int j=0; j<N; j++) {    //��
				System.out.println(array[i][j]);
			}
			System.out.println();
		}
	}

}
