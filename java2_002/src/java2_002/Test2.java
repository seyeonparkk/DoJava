package java2_002;
class Animal{
	void move() {System.out.println("�Դٸ����ٸ�");}
}
class Dog extends Animal{
	void bark() {System.out.println("�۸۸�");}
}
class Dove extends Animal{
	void fly() {System.out.println("�۵��۵�");}
	
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
