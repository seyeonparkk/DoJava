package java003;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]=new int[] {88,99,70,55,100,120};
		/*
		 * score[0]=88; score[1]=99; score[2]=70; score[3]=55; score[4]=100;
		 */
		
		for(int i=0; i<=score.length-1; i++) {     //.->"�����ϴ�"
			System.out.println((i+1)+"�� �л��� ����"+score[i]);
		}
		//���ʱ�ȭ
		score=new int[] {1,2,3,4,5,6,7,8};
		for(int i=0; i<=score.length-1; i++) {     //.->"�����ϴ�"
			System.out.println((i+1)+"�� �л��� ����"+score[i]);
		}
	}

}
