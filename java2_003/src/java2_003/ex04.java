package java2_003;

import java.util.*;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("���� : "+Math.floor(1.6));
		 * System.out.println("���� : "+Math.floor(-1.6));
		 * System.out.println("������ : "+Math.ceil(1.6)); //�ݿø�
		 * System.out.println("�ڸ� : "+(int)1.6);
		 * System.out.println("�ݿø� : "+Math.round(1.6));
		 */
		
	//Random r=new Random();
	/*
	 * GregorianCalendar today=new GregorianCalendar();
	 * System.out.println("%d�� %d�� %d�� %s %d�� %d�� %d��");
	 * 
	 * today.get(Calendar.YEAR), today.get(Calendar.MONTH)+1,
	 * today.get(Calendar.DATE), today.get(Calendar.AM_PM)==Calendar.AM?"����":"����",
	 * today.get(Calendar.HOUR), today.get(Calendar.MINUTE),
	 * today.get(Calendar.SECOND));
	 */
		 GregorianCalendar today=new GregorianCalendar();
		 System.out.printf("���� ��¥ : %d�� %d��\n",
		 today.get(Calendar.MONTH)+1,
		 today.get(Calendar.DATE));
		 
		 today.add(Calendar.DATE, 100);
		System.out.printf("100�� �Ĵ� %d�� %d�� �Դϴ�\n",
				 today.get(Calendar.MONTH)+1,
				 today.get(Calendar.DATE));
		
			}

}
