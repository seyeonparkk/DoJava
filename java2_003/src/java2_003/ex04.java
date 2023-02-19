package java2_003;

import java.util.*;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("왼쪽 : "+Math.floor(1.6));
		 * System.out.println("왼쪽 : "+Math.floor(-1.6));
		 * System.out.println("오른쪽 : "+Math.ceil(1.6)); //반올림
		 * System.out.println("자름 : "+(int)1.6);
		 * System.out.println("반올림 : "+Math.round(1.6));
		 */
		
	//Random r=new Random();
	/*
	 * GregorianCalendar today=new GregorianCalendar();
	 * System.out.println("%d년 %d월 %d일 %s %d시 %d분 %d초");
	 * 
	 * today.get(Calendar.YEAR), today.get(Calendar.MONTH)+1,
	 * today.get(Calendar.DATE), today.get(Calendar.AM_PM)==Calendar.AM?"오전":"오후",
	 * today.get(Calendar.HOUR), today.get(Calendar.MINUTE),
	 * today.get(Calendar.SECOND));
	 */
		 GregorianCalendar today=new GregorianCalendar();
		 System.out.printf("오늘 날짜 : %d월 %d일\n",
		 today.get(Calendar.MONTH)+1,
		 today.get(Calendar.DATE));
		 
		 today.add(Calendar.DATE, 100);
		System.out.printf("100일 후는 %d월 %d일 입니다\n",
				 today.get(Calendar.MONTH)+1,
				 today.get(Calendar.DATE));
		
			}

}
