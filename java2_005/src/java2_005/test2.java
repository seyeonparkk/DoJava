package java2_005;
import java.util.ArrayList;

class ex1{
	static <t>void method(ArrayList<t> ar){
		for(t a:ar) {
			System.out.println(a);
		}
	}
}
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> yoil=new ArrayList<String>();
		 yoil.add("¿œø‰¿œ");
		 ex1.<String> method(yoil);
		 
		 ArrayList<Integer> num=new ArrayList<Integer>();
		 num.add(98);
		 ex1.<Integer> method(num);
	}

}
