package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;

public class LoginSteps {
	
	WebDriver driver = null;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside Step - User is on Login Page");
	    String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",  projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.navigate().to("https://example.testproject.io/web/");
	    
	}

	@When("User enters user1 and Password123")
	public void user_enters_credentials() {
	    
	    System.out.println("Putting Username and Password");
	    driver.findElement(By.id("name")).sendKeys("user1");
	    driver.findElement(By.id("password")).sendKeys("12345");
	}

	@And("Clicks Login Button")
	public void clicks_login_button() {
	    System.out.println("Click Login");
	    driver.findElement(By.id("login")).click();
	}

	@Then("User is Navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	    System.out.println("Validate Homepage");
	    driver.findElement(By.id("logout")).isDisplayed();
	}

}
