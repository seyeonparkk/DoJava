package java2_003;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str="String Search Method of String Class";
		 * System.out.println("菊率 t = "+str.indexOf('t'));
		 * System.out.println("第率 t = "+str.lastIndexOf('t'));
		 * System.out.println("菊率 string = "+str.indexOf("String"));
		 */
		String[] files= {
				"girl.jpg",
				"boy.png",
				"child.avi",
				"school.jpg",
				"book.gif"
				
		};
		for(String s:files) {
			if(s.endsWith(".jpg")) {
				System.out.println(s);
			}
		}
	}

}
