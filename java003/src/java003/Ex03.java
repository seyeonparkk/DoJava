package java003;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * while(조건문) { 
		 * 반복 실행할 문장;
		 *  }
		 */
		
		/*일단은 실행은 무조건 한번 한 뒤에 참,거짓에 따라 나뉨
		 * do {
		 *  반복실행할 문장
		 *   }while(조건문) true->무한반복{
		 * 
		 * }
		 */
		
	/*	int i=1;
		
		
		//while->for문 분해라고 생각
		while(i<=10) {
			System.out.println(i);
			i++;*/
		
		int num=1;
		int sum=0;
		
		while(num<=10) {
			sum+=num;
			num++;
		}
		System.out.println("1부터 10까지의 합="+sum);
		}
	}


