package basicsOfTestNG;

import org.testng.annotations.Test;

public class LearningTestng {
	
	@Test
	public void functionC() {
		System.out.println("This is function C");
	}
	
	@Test(enabled = false)
	public void functionA() {
		System.out.println("This is function A");
	}

	@Test(priority = 1)
	public void functionB() {
		System.out.println("This is function B");
	}
	
	
	
}
