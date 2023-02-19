package java2_003;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str=new String("아름다운"); System.out.println(str);
		 * 
		 * String str2=new String("우리나라"); System.out.println(str2);
		 * 
		 * char ar[]= {'k','o','r','e','a'}; String str3=new String(ar);
		 * System.out.println(str3);
		 * 
		 * System.out.println("대한민국".length());
		 */
		
		String str1="korea";
		String str2="KOREA";
		
		System.out.println(str1.equals(str2)?"같다":"다르다");
		System.out.println(str1.equalsIgnoreCase(str2)?"같다":"다르다");   //대소문자구별
		
		String apple="Apple";
		String orange="Orange";
		
		int result=apple.compareTo(orange);
		if(result==0) {
			System.out.println("같다");
			
		}else if(result<0) {
			System.out.println("apple이 더 앞쪽");
		}else {
			System.out.println("apple이 더 뒤쪽");
		}
	}

}
