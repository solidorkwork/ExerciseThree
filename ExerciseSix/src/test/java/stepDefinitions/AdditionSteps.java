package stepDefinitions;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CalculatorElements;
import utilities.Hooks;

public class AdditionSteps {

	AndroidDriver<WebElement> additionDriver = Hooks.getDriver();
	CalculatorElements elements = Hooks.getElements();
	
	@Given("Calculator is open")
	public void checkOpen() {
		System.out.println("Checking if Calculator is Open");
		if(elements.equals.isDisplayed()) {
			System.out.println("Calculator is open.");
		}
	}
	
	@And("Results are cleared")
	public void checkCleared() {
		System.out.println("Ensuring previous activity is cleared");
		if(elements.results.getText()!="") {
			if(elements.delete.isDisplayed()) {
				while(elements.results.getText()!="") {
					elements.delete.click();
				}
			}
			else if(elements.clear.isDisplayed()) {
				elements.clear.click();
			}
		}
	
	
	}
	
	@When("^I add (([0-9]+.?[0-9]*|.[0-9]+)) and (([0-9]+.?[0-9]*|.[0-9]+))$")
	public void addNumbers(String number1, String number2) {
		
		char[] array1 = number1.toCharArray();
		char[] array2 = number2.toCharArray();
		
		for(char digit : array1) {
			System.out.println("Clicking "+digit);
			elements.clickByChar(digit);
		}
		
		System.out.println("Clicking plus");
		elements.plus.click();
		
		for(char digit : array2) {
			System.out.println("Clicking "+digit);
			elements.clickByChar(digit);
		}
		
		elements.equals.click();
		System.out.println("Clicking Equals");
	}
	
	@Then("^(([0-9]+.?[0-9]*|.[0-9]+)) is shown")
	public void getResult(String result) {
		String actualResult = elements.results.getText();
		System.out.println("Expected "+result+" Got "+actualResult);
		if(result.equals(actualResult)) {
			System.out.println("Test Passed");
		}
			else
				System.out.println("Test Failed");
		}
	
	
}
