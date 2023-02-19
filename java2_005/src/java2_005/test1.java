package java2_005;
class ABox <T>{
	T value;
	ABox(T value){this.value=value;}
	T get() {return value;}
	void set(T value) {this.value=value;}
}

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box raw=new Box(1234);
		Box<Integer> para= new Box<Integer>(5678);
		para=raw;
		int value=(int)para.get();
		System.out.println(value);
	}

}
