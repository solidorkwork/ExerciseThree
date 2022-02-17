package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.CalculatorObject;
import utilities.Hooks;

public class AdditionSteps {

	AndroidDriver<WebElement> additionDriver = Hooks.getDriver();
	CalculatorObject elements = Hooks.getElements();
	String calculatedResult;
	
	@Given("Calculator is open")
	public void checkOpen() {
		System.out.println("Checking if Calculator is Open");
		if(elements.equalsDisplayed()) {
			System.out.println("Calculator is open.");
		}
	}
	
	@And("Results are cleared")
	public void checkCleared() {
		System.out.println("Ensuring previous activity is cleared");
		if(elements.getResults()!="") {
			if(elements.delDisplayed()) {
				while(elements.getResults()!="") {
					elements.clickDel();
				}
			}
			else {
				elements.findClear();
				elements.clickClr();
			}
		}
	
	
	}
	
	@When("^I add (([0-9]+.?[0-9]*|.[0-9]+)) and (([0-9]+.?[0-9]*|.[0-9]+))$")
	public void addNumbers(String number1, String number2) {
		
		char[] array1 = number1.toCharArray();
		char[] array2 = number2.toCharArray();
		Boolean isInteger = true;
		for(char digit : array1) {
			if(digit == '.')
				isInteger = false;
			System.out.println("Clicking "+digit);
			elements.clickByChar(digit);
		}
		
		System.out.println("Clicking plus");
		elements.clickPlus();
		
		for(char digit : array2) {
			if(digit == '.')
				isInteger = false;
			System.out.println("Clicking "+digit);
			elements.clickByChar(digit);
		}
		
		System.out.println("Clicking Equals");
		elements.clickEquals();

		
		if(isInteger) {
			int intNumber1 = Integer.parseInt(number1);
			int intNumber2 = Integer.parseInt(number2);
			calculatedResult = Integer.toString(intNumber2+intNumber1);
		}
		
		else {
		Double doubleNumber1 = Double.parseDouble(number1);
		Double doubleNumber2 = Double.parseDouble(number2);
		calculatedResult = Double.toString(doubleNumber1+doubleNumber2);
		}
	}
	
	@Then("^(([0-9]+.?[0-9]*|.[0-9]+)) is shown")
	public void getResult(String result) {
		String actualResult = elements.getResults();
		assertEquals(calculatedResult, result);
		assertEquals(result, actualResult);
		System.out.println("Expected "+result+" Got "+actualResult);
		if(result.equals(actualResult)) {
			System.out.println("Test Passed");
		}
			else
				System.out.println("Test Failed");
		}
	
	
}
