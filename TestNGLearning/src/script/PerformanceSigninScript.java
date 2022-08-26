package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PerformanceSigninScript extends BaseClass{
//	WebDriver driver;
//	
//	@BeforeTest
//	public void initialization() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//	}
	
	@Test(priority = 4)
	public void performanceGlitchUserLogin() {
//		driver.navigate().back();
		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
		userNameTextbox.sendKeys("performance_glitch_user");
		
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	
	@AfterTest
	public void closeBrowser() {
//		driver.close();
	}
	
//	@BeforeMethod
//	public void refreshPage() {
//		driver.get("https://www.saucedemo.com/");
//	}
}
