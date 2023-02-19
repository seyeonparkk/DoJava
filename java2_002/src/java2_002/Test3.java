package java2_002;

class Animal{
	void move() {
		System.out.println("¿Ô´Ù¸® °¬´Ù¸®");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("¸Û¸Û¸Û");
	}
}
class Dove extends Animal{
	void fly() {
		System.out.println("ÆÛµæ ÆÛµæ");
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog happy=new Dog();
		testAnimal(happy);
		
		Dove dove=new Dove();
		testAnimall(dove);
		
	}
		
		static void testAnimal(Animal animal) {
			Dog mydog=(Dog)animal;
			mydog.move();
			mydog.bark();
		}
		
		static void testAnimall(Animal animal) {
			Dove mydog=(Dove)animal;
			mydog.move();
			mydog.fly();
		}
		
			
	}


