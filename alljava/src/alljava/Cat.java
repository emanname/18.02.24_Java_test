package alljava;

public class Cat extends Animal{
	
	public Cat() {
		
		//cat do nothing
		
	}
//25:30
	
	
	public String makeSound() {
		
		return "Myaaau";
		
	}
	
	public static void main(String[] args) {
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("doggy says " + doggy.makeSound() + " and kitty says " + kitty.makeSound() );
		//test of speak animal
		speakAnimal(doggy);

	}
}
