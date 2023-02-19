package java2_006;

class Box<T>{
	T value;
	Box(T value){this.value=value;}
	T get() {return value;}
	void set(T value ) {this.value=value;}
}
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box raw=new Box(1234);
		Box<Integer>para=new Box<Integer>(5678);
		para=raw;
		int value=para.get();
		System.out.println(value);
	}

}
