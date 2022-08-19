package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	
	@Given("user is in the login page")
	public void user_is_in_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@When("user insert user name in the user name textbox")
	public void user_insert_user_name_in_the_user_name_textbox() {
		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
		userNameTextbox.sendKeys("standard_user");
	}

	@When("user insert password in the password textbox")
	public void user_insert_password_in_the_password_textbox() {
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	    
	}
	
	@When("user insert user name standard user in the user name textbox")
	public void user_insert_user_name_standard_user_in_the_user_name_textbox() {
		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
		userNameTextbox.sendKeys("standard_user");
	}

	@When("user insert user name lockedout user in the user name textbox")
	public void user_insert_user_name_lockedout_user_in_the_user_name_textbox() {
		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
		userNameTextbox.sendKeys("locked_out_user");
	}
	
	@When("user insert user name in user name textbox")
	public void user_insert_user_name_in_user_name_textbox() {
		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
		userNameTextbox.sendKeys("standard_user");
	}

	@When("user insert password in password textbox")
	public void user_insert_password_in_password_textbox() {
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("secret_sauce");
	}

	@When("click on sign in button")
	public void click_on_sign_in_button() {
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
	}
	
	@When("user insert {string} in user name textbox")
	public void user_insert_in_user_name_textbox(String username) {
		WebElement userNameTextbox = driver.findElement(By.id("user-name"));
		userNameTextbox.sendKeys(username);
	}
	
	@When("user insert {string} in password textbox")
	public void user_insert_in_password_textbox(String pwd) {
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.sendKeys(pwd);
	}
}
