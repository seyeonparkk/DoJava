package java2_005;
//object,제네릭은 동시에 사용할 수 없다
class Box <T>{
	T value;
	Box(T value){this.value=value;}
	T get() {return value;}
	void set(T value) {this.value=value;}
}

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> bi=new Box<Integer>(1234);
		int biv=bi.get();
		System.out.println(biv);
		
		Box<Double> bd=new Box<Double>(56.78);
		double bdv=bd.get();
		System.out.println(bdv);
	}

}
