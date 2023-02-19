package java2_004;

public class ex5 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String name=null;
		printScore(name);
	}
	static void printScore(String name)throws Exception{
		if(name==null) {
			throw new Exception("이름이 무효합니다");
		}
		System.out.println(name.length());
	}
}
