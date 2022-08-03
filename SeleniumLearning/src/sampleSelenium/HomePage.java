package sampleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver iDriver;
	
	public HomePage(WebDriver driver) {
		iDriver = driver;
	}
	
	public WebElement signInButton() {
		WebElement signButton = iDriver.findElement(By.xpath("//*[@class='login']"));
		return signButton;
	}
	
	
}
