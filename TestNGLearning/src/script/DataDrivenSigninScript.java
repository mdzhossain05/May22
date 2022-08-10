package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenSigninScript {
	WebDriver driver;
	
	@BeforeTest
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Parameters({"uName", "pass"})
	@Test(priority = 3)
	public void userLogin(String userName, String password) {
		
		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
		userNameTextbox.sendKeys(userName);
		
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys(password);
		
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
