package oopConcept;

public class Human extends Animal {
	
	public void eat() {
		System.out.println("Eat Coocked Food");
	}
	
	public void calling() {
		super.eat();
		this.eat();
	}
	
	public void sleep() {
		System.out.println("Sleep in bed");
	}
	
	public void walk () {
		System.out.println("walking");
	}
	
	public void work() {
		System.out.println("work");
	}
	
	public void work(String workType) {
		System.out.println(workType);
	}
	
	public void work(String workType, String jobPlace) {
		System.out.println(workType + " working at " + jobPlace);
	}
	
	public void work (int hour) {
		System.out.println(hour);
	}

}
