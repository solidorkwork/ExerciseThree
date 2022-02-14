package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithdrawlSteps {

	@Given("^The account has ([0-9]*) dollars$")
	public void atm_check_balance(int balance) {
		System.out.println("The account has "+balance+" dollars");
	}
	@When("^The user withdraws ([0-9]*) dollars$")
	public void atm_request_withdrawl(int withdrawl) {
		System.out.println("The user takes "+withdrawl+" dollars");
	}
	@Then("^The user gets ([0-9]*) dollars in cash$")
	public void atm_dispense_cash(int cash) {
		System.out.println("The user gets "+cash+" dollars");
	}
	@And("^The account has ([0-9]*) dollars left$")
	public void atm_check_remaining_balance(int remainder) {
		System.out.println("The account still hass "+remainder+" dollars");
	}
}
