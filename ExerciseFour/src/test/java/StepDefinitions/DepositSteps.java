package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DepositSteps {

	@Given("The user has authenticated their identity")
	public void atm_authentication() {
		System.out.println("The user has inserted their card and put in their pin");
	}
	@And("Selected deposit on the main screen")
	public void atm_select_deposit() {
		System.out.println("Deposit is selected.");
	}
	@When("The user inserts 20 into the machine")
	public void atm_insert_money() {
		System.out.println("$20 is inserted.");
	}
	@Then("The user balance goes up by 20")
	public void atm_adjust_balance() {
		System.out.println("Balance is increased by $20.");
	}
}
