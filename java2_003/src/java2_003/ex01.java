package java2_003;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str=new String("�Ƹ��ٿ�"); System.out.println(str);
		 * 
		 * String str2=new String("�츮����"); System.out.println(str2);
		 * 
		 * char ar[]= {'k','o','r','e','a'}; String str3=new String(ar);
		 * System.out.println(str3);
		 * 
		 * System.out.println("���ѹα�".length());
		 */
		
		String str1="korea";
		String str2="KOREA";
		
		System.out.println(str1.equals(str2)?"����":"�ٸ���");
		System.out.println(str1.equalsIgnoreCase(str2)?"����":"�ٸ���");   //��ҹ��ڱ���
		
		String apple="Apple";
		String orange="Orange";
		
		int result=apple.compareTo(orange);
		if(result==0) {
			System.out.println("����");
			
		}else if(result<0) {
			System.out.println("apple�� �� ����");
		}else {
			System.out.println("apple�� �� ����");
		}
	}

}
