package basicsOfTestNG;

import org.testng.annotations.Test;

public class LearningTestng {
	
	@Test(groups = {"sanity", "smoke"})
	public void functionC() {
		System.out.println("This is function C");
	}
	@Test(groups = "smoke")
	public void functionA() {
		System.out.println("This is function A");
	}
	@Test(groups = "sanity")
	public void functionB() {
		System.out.println("This is function B");
	}
	
	
	
}
