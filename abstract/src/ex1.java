/*도형 클래스를 생성하고 draw()메서드를 만들고,도형 클래스를 상속받는 사각형
원,선 class를 생성한다. 각 클래스에 맞게 draw()오버라이딩 하기*/
class shape{
	void draw() {
	System.out.println("도형을 그리다");
	}
}
class Rect extends shape {
	 void draw() {
		System.out.println("사각형을 그리다");
	}
}
class Circle extends shape{
	void draw() {
		System.out.println("원을 그리다");
	}
}
class Line extends shape{
	void draw() {
		System.out.println("선을 그리다");
	}
}
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열로 선언
		//부모의 객체배열 요소에 자식값 넣기->업캐스팅
		shape s1[]=new shape[3];
		s1 [0]=new Rect();
		s1[1]=new Circle();
		s1[2]=new Line();
		
		for(int i=0; i<s1.length; i++) {
			s1[i].draw();
		}
			
	}

}
