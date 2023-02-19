package java003;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranking=2;
		String medal=
				switch(ranking) {
				case 1->"금메달";          //란다표현식->switch문 조정 ㄱㄴ 버전에 따라 ㄱㄴ
				case 2->"금메달";
				case 3->"금메달";
				default->"참가상";
				}
		System.out.println(medal+"을 수여합니다");
	}

}
