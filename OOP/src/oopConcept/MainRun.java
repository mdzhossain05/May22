package oopConcept;

public class MainRun {

	public static void main(String[] args) {
		// OOP - 4 concepts
		// Abstruction - Restrict to create an object of any class
		// Polymorphism - RunTime Polymorphism & CompileTime Polymorphism
		//					Method Over Riding     -    Method Over Loading
		//				parent/child relationship  -  Within the same class
		// Inheritance - parent child relationship - 
		//				multiple inheritance and multilevel inheritance
		// Encapsulation - Hiding everything from outside
		
		
		Animal animal = new Dog();
		animal.eat();
		animal.sleep();
		animal.watch();
		
		Human human = new Human();
		human.walk();
		human.work();
		human.eat();
		human.sleep();
		
		Dog dog = new Dog();
//		dog.run();
		dog.sleep();
		
		Bird bird = new Bird();
		bird.eat();
		bird.fly();
		bird.sleep();
		
	}

}
