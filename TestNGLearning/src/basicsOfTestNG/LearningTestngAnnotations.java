package basicsOfTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningTestngAnnotations {
	@Test
	public void testFunction() {
		System.out.println("This is a Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("This is Before Groups");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("This is After Groups");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite");
	}
}
