package java003;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * while(���ǹ�) { 
		 * �ݺ� ������ ����;
		 *  }
		 */
		
		/*�ϴ��� ������ ������ �ѹ� �� �ڿ� ��,������ ���� ����
		 * do {
		 *  �ݺ������� ����
		 *   }while(���ǹ�) true->���ѹݺ�{
		 * 
		 * }
		 */
		
	/*	int i=1;
		
		
		//while->for�� ���ض�� ����
		while(i<=10) {
			System.out.println(i);
			i++;*/
		
		int num=1;
		int sum=0;
		
		while(num<=10) {
			sum+=num;
			num++;
		}
		System.out.println("1���� 10������ ��="+sum);
		}
	}


