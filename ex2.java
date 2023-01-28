/*포켓몬이라는 추상 클래스를 만들고,구체적인 피캬츄,꼬부기 클래스를 구현하는 
예제*/
abstract class Pokemon{
	String name;
	abstract void attack();
	abstract void sound();
	public void getName() {
		this.name=name;
	}
}
class Pikachu extends Pokemon{
	Pikachu(){
		this.name="피캬츄";
		
	}
	void attack() {
		System.out.println("전기공격");
	}
	void sound() {
		System.out.println("피카피카!");
	}
	
}
class Turtle extends Pokemon {
	Turtle(){
		this.name="꼬부기";
		
	}
	void attack() {
		System.out.println("물 공격");
	}
	void sound() {
		System.out.println("꼬북꼬북!");
	}
}
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon po[]= {new Pikachu(),new Turtle()};
		for(Pokemon u:po) {
			u.sound();
			u.attack();
		}
	}

}
