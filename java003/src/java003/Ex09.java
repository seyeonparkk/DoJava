package java003;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]=new int[] {88,94,75,72,23};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
			
		}
		System.out.println("���� "+sum);
		System.out.println("��� "+(float)sum/score.length);
	}

}
