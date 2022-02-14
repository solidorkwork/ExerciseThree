package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Hooks;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
	
	WebDriver loginDriver = Hooks.getDriver();

	
	@Given("User is on login page")
	public void user_is_on_login_page() throws MalformedURLException {
		
	    System.out.println("Inside Step - User is on Login Page");
	    
	    
	    loginDriver.navigate().to("https://example.testproject.io/web/");
	    
	}

	@When("User enters user1 and Password123")
	public void user_enters_credentials() {
	    
	    System.out.println("Putting Username and Password");
	    loginDriver.findElement(By.id("name")).sendKeys("user1");
	    loginDriver.findElement(By.id("password")).sendKeys("12345");
	}

	@And("Clicks Login Button")
	public void clicks_login_button() {
	    System.out.println("Click Login");
	    loginDriver.findElement(By.id("login")).click();
	}

	@Then("User is Navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	    System.out.println("Validate Homepage");
	    loginDriver.findElement(By.id("logout")).isDisplayed();
	}

}
