package sampleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.uhaul.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement trailorsTowing = driver.findElement(By.xpath("//*[@id=\"mainHeaderMenu\"]/li[6]/a[1]"));
		
		action.moveToElement(trailorsTowing).build().perform();
	
	
	
	}

}
