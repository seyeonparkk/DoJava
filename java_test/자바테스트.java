package java_test;

import java.util.*;
public class �ڹ��׽�Ʈ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]={ "CHANGE", "LOVE", "HOPE", "VIEW"};  //�ܾ� ����
		while(true) {
			 String answer=getAnswer(arr);
			 String question = getScrambledWord(answer);

             char[] hint = new char[answer.length()];

             for(int i=0;i < hint.length;i++) {

                 hint[i] = '_';

           }
             while (true) {
            	 Scanner scan = new Scanner(System.in); 
             
                 System.out.println("Question :" + question);
                 System.out.print("Your answer is : ");
                 String str = scan.next();
                 if (str.equalsIgnoreCase("q")) {
                	 System.exit(0);
                 }
             if(str.equalsIgnoreCase(answer)) {
            	 System.out.println("����");
             }else {
            	 System.out.println(str+"��/�� ������ �ƴմϴ�. �ٽ� �õ��غ�����");
            	 System.out.println("HINT : "+getHint(answer,hint));
             }
             }
		}
		
	}
	   public static String getAnswer(String[] strArr) {    

           int idx = (int)(Math.random()*strArr.length);

           return strArr[idx];

     }
	   public static String getScrambledWord(String str) {  
		   char chArr[]=str.toCharArray();
		   
		   for(int i=0; i<str.length()*2; i++) {
			   int idx = (int)(Math.random()*str.length());

               

               char tmp = chArr[0];

               chArr[0] = chArr[idx];

               chArr[idx] = tmp;

         }



         return new String(chArr);

   } 
	   public static String getHint(String answer, char[] hint) {

           int count = 0;



           for(int i=0;i < hint.length;i++) {

                 if(hint[i]=='_')

                       count++;

           }

          

           if(count > 2) {

                 while(true) {

                       int idx = (int)(Math.random()*answer.length());



                       if(hint[idx]=='_') {

                             hint[idx] = answer.charAt(idx);

                             break;                  

                       }

                 } 

           }



           return new String(hint);

     }

}
