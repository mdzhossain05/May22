package oopConcept;

public class Dog extends Animal{
	
	// access modifiers - public, private, protected, default
	private void run() {
		System.out.println("run");
	}

	@Override
	public void sleep() {
		run();
		
	}
	
}
