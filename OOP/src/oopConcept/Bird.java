package oopConcept;

public class Bird implements SampleInterface, AnotherInterface{
	
	public void fly() {
		System.out.println("Flying");
	}

	public void eat() {
		System.out.println("eat");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}

	@Override
	public void doSomeWork() {
		// TODO Auto-generated method stub
		
	}
}
