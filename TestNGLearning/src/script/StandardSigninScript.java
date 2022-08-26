package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class StandardSigninScript extends BaseClass{
	
//	WebDriver driver;
	
//	@BeforeTest(alwaysRun = true)
//	public void initialization() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
////		driver.manage().window().maximize();
//	}
	
	@Test(priority = 1, groups = {"sanity", "smoke", "regression"})
	public void standardUserLogin() {
		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
		userNameTextbox.sendKeys("standard_user");
		
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		//Assert.assertEquals("actualString", "expectedString");
		//Assert.assertTrue(isDisplayed);
		//Assert.assertFalse(isNotDisplayed);
		WebElement header = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
		String actualHeader = header.getText();
		String expectedHeader = "PRODUCTS";
		
		Assert.assertTrue(header.isDisplayed());
		Assert.assertEquals(actualHeader, expectedHeader);
		
//		if(actualHeader.equals(expectedHeader)) {
//			System.out.println("test passed");
//		}else {
//			System.out.println("test failed");
//		}
	}
	
//	@Test(priority = 2, groups = {"sanity", "regression"})
//	public void lockedOutUserLogin() {
////		driver.navigate().back();
//		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
//		userNameTextbox.sendKeys("locked_out_user");
//		
//		WebElement passwordTextbox = driver.findElement(By.id("password"));
//		passwordTextbox.sendKeys("secret_sauce");
//		
//		WebElement loginButton = driver.findElement(By.id("login-button"));
//		loginButton.click();
//	}
	
//	@Test(priority = 3, groups = {"smoke", "regression"})
//	public void problemUserLogin() {
//		
//		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
//		userNameTextbox.sendKeys("problem_user");
//		
//		WebElement passwordTextbox = driver.findElement(By.id("password"));
//		passwordTextbox.sendKeys("secret_sauce");
//		
//		WebElement loginButton = driver.findElement(By.id("login-button"));
//		loginButton.click();
//	}
	
//	@Test(priority = 4, groups = "regression")
//	public void performanceGlitchUserLogin() {
////		driver.navigate().back();
//		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
//		userNameTextbox.sendKeys("performance_glitch_user");
//		
//		WebElement passwordTextbox = driver.findElement(By.id("password"));
//		passwordTextbox.sendKeys("secret_sauce");
//		
//		WebElement loginButton = driver.findElement(By.id("login-button"));
//		loginButton.click();
//	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
//	@BeforeMethod(alwaysRun = true)
//	public void refreshPage() {
//		driver.get("https://www.saucedemo.com/");
//	}
	

	
	
	
	
	
	
	
	

}
