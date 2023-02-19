package java2_006;
enum jy{
	SHORT("짧은 정수형",2),INT(" 정수형",4),DOUBLE("실수형",8);
	final private  String typename;
	final private int length;
	jy(String name,int bytenum){
		typename=name;
		length=bytenum;
	}
	String getname(){return typename;}
	int getlength(){return length;}
}
public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jy Type;
		Type=jy.INT;
		System.out.println(Type+Type.getname()+Type.getlength());
	}

}
