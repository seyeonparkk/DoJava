package java2_002;
class Animal{
	void move() {System.out.println("ø‘¥Ÿ∏Æ∞¨¥Ÿ∏Æ");}
}
class Dog extends Animal{
	void bark() {System.out.println("∏€∏€∏€");}
}
class Dove extends Animal{
	void fly() {System.out.println("∆€µÊ∆€µÊ");}
	
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Dog happy=new Dog();
		testAnimal(happy);
		
	}
static void testAnimal(Animal animal) {
	Dog mydog=(Dog)animal;
	mydog.move();
	mydog.bark();
}
}
