package java2_002;
//다형성
//많은 기능들 중 내가 하고자 하는 기능만 가져다가 씀->다형성
//공통부모를 클래스를 만들고, 메인에 호출
class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";}
	public String y() {return "y";}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new B();   //실제는 B이지만, A를 갖고있는 것처럼 ->실직적인 동작은 B
		System.out.println(obj.x());
	}

}
