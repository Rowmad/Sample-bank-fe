package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.DepositPage;
import com.wipro.tutorial.at.pages.HomePage;
import com.wipro.tutorial.at.pages.LoginPage;
import com.wipro.tutorial.at.pages.WithdrawPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WithdrawSteps extends AbstractSteps {

	@Autowired
	private WithdrawPage withdrawPage;


	@Given("User is on the withdraw page")
	public void userGoesDepositPage() {

		withdrawPage.clickWithdrawPg();
	}


	@When("User select the number $account, put $value and click and withdraw button")
	public void userWithdraw(	@Named("account") String account,
							  @Named("ammount") String ammount) {
		withdrawPage.account(account)
				.ammount(ammount)
				.clickWithdrawButton();
	}

	@Then("The return message for withdraw ammount is $message")
	public void assertUserIsWithdrawSucess(@Named("message") String message) {
		Assert.assertEquals(message, withdrawPage.getMessage());
	}


}
