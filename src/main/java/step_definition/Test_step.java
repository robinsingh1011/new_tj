package step_definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class Test_step {
	
	static public WebDriver driver;
	
	

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp/");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	   
	}

	@When("User Navigate to Login Page")
	public void user_Navigate_to_Login_Page() {
		 driver.findElement(By.linkText("SignIn")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys( password);
		driver.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
	WebElement a=driver.findElement(By.linkText("SignOut"));
		Assert.assertTrue(a.isDisplayed());
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}


}
