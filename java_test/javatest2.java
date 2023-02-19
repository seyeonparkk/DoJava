package java_test;

import java.util.*;
public class javatest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {

                "다음 중 키워드가 아닌 것은?`2`final`True`if`public",

                "다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^",

                "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false`",

          };

         

          Scanner s = new Scanner(System.in);

          int score = 0;



          //shuffle(data); // 문제를 섞는다.


          for(int i=0;i < data.length;i++) {

                String[] tmp = data[i].split("`",3);

                String question = tmp[0];

                String answer = tmp[1];

                String[] choices = tmp[2].split("`");


                answer = choices[Integer.parseInt(answer)-1];


               // shuffle(choices); // 선택지를 섞는다.


                System.out.println("["+(i+1)+"] "+question);


                for(int x=0;x < choices.length;x++) { 

                	System.out.print(x+1 + "." + choices[x]+ " ");


                }



                System.out.println();

                System.out.print("[답]");

                String input = s.nextLine();

               

                if(input.equals(answer)) {

                      score++;

                }



                System.out.println();

                System.out.println();

          }


          System.out.println("정답개수/전체문항수 :"+score+"/"+data.length);

    } // main
	 public static void shuffle(String[] data) {

		 int randomIndex;
		 for(int i=0; i<data.length; i++) {​
			 randomIndex = (int)(Math.random()*data.length);
		 String temp=data[i];
		 data[i]=data[randomIndex];
		 data[randomIndex]=temp;
		 }
	 }

    
	}


