package sampleSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement signButton = driver.findElement(By.xpath("//*[@class='login']"));
		signButton.click();
		
		WebElement createEmailTextbox = driver.findElement(By.id("email_create"));
		createEmailTextbox.sendKeys("ajsgfkuskfha@gmail.com");
		
		WebElement createButton = driver.findElement(By.id("SubmitCreate"));
		createButton.click();
		
		//implicite wait
		
		//explicite wait
		
		
		WebElement title = driver.findElement(By.id("id_gender1"));
		title.click();
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("firstName");
		
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("lastName");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("1234567890");
		
		WebElement day = driver.findElement(By.id("days"));
		Select daySel = new Select(day);
		daySel.selectByValue("20");
		
		WebElement month = driver.findElement(By.id("months"));
		Select monSel = new Select (month);
		monSel.selectByValue("6");
		
		WebElement year = driver.findElement(By.id("years"));
		Select yearSel = new Select(year);
		yearSel.selectByValue("1990");
		
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("101 anything street");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Vienna");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select stateSel = new Select(state);
		stateSel.selectByVisibleText("Virginia");
		
		WebElement zip = driver.findElement(By.id("postcode"));
		zip.sendKeys("22222");
		
		WebElement phone = driver.findElement(By.id("phone_mobile"));
		phone.sendKeys("215421156");
		
//		WebElement registerButton = driver.findElement(By.xpath("//input[@value = 'Register']"));
//		registerButton.click();
		
//		WebElement header = driver.findElement(By.className("title"));
//		String headerText = header.getText();
//		System.out.println(headerText);
//		
//		WebElement message = driver.findElement(By.xpath("//div[@id = 'rightPanel']/p"));
//		String messageText = message.getText();
//		System.out.println(messageText);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
