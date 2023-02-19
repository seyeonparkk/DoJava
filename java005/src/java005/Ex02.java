package java005;
class Ex{    //클래스=>설계도
	int left,right;
	
	public void setOprands(int left,int right) {      //메서드 생성
		this.left=left;      //Ex안에서만 사용할 수 있는 변수 재선언
		this.right=right;   
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex e1=new Ex();       //Ex의 자료를 갖고온다 ex=>인스턴스==제품
		e1.setOprands(10,20);
		e1.sum();
		e1.avg();
	}

}
