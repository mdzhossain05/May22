package basicsOfTestNG;

import org.testng.annotations.Test;

public class LearningTestng {
	
	@Test(dependsOnMethods = "functionA")
	public void functionC() {
		System.out.println("This is function C");
	}
	@Test(dependsOnMethods = "functionB")
	public void functionA() {
		System.out.println("Typing the user name");
	}
	@Test()
	public void functionB() {
		System.out.println("Checking the user name text box displayed");
	}
	
	
	
}
