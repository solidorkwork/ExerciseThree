package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CalculatorObject;
import utilities.Hooks;

public class CalculateSteps {
	
	AndroidDriver<WebElement> additionDriver = Hooks.getDriver();
	CalculatorObject elements = Hooks.getElements();
	String calculatedResult;
	
	@When("^I calculate ([0-9]+.?[0-9]*|.[0-9]+[\\+\\*-\\\\][0-9]+.?[0-9]*|.[0-9]+)$")
	public void calculate(String expression) {
		System.out.println("In calculate method");
		char[] expressionArray = expression.toCharArray();
		
		Boolean isInteger = true;
		
		for(char symbol : expressionArray) {
			System.out.println("Clicking "+symbol);
			elements.clickByChar(symbol);
		}
		elements.clickEquals();
	}
	
	@Then("^The (([0-9]+.?[0-9]*|.[0-9]+)) is displayed$")
	public void checkCalc(String result) {
		String actualResult = elements.getResults();
		assertEquals(result, actualResult);
		if(result.equals(actualResult)) {
			System.out.println("Test Passed");
		}
			else
				System.out.println("Test Failed");
	}
}
