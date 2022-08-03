package basicsOfTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTest {
	
	@BeforeTest
	public void setUp() {
		System.out.println("This is set up");
	}
	
	@Test
	public void testFunction() {
		System.out.println("This is test");
	}

	@AfterTest
	public void closing() {
		System.out.println("This is closing");
	}
}
