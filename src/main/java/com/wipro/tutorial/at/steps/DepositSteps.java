package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.DepositPage;
import com.wipro.tutorial.at.pages.HomePage;
import com.wipro.tutorial.at.pages.LoginPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

@Component
public class DepositSteps extends AbstractSteps {

	@Autowired
	private DepositPage depositPage;


	@Given("User is on the deposit page")
	public void userGoesDepositPage() {
		depositPage.clickDepositPg();
	}


	@When("User select the number $account, put $value and click and deposit button")
	public void userDeposit(	@Named("account") String account,
							  @Named("ammount") String ammount) {
		depositPage.account(account)
				.ammount(ammount)
				.clickDepositButton();
	}

	@Then("The return message for deposit in Account is $message")
	public void assertUserIsDepositSucess(@Named("message") String message) {
		Assert.assertEquals(message, depositPage.getMessage());

	}


}
