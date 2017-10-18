package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.DepositPage;
import com.wipro.tutorial.at.pages.HomePage;
import com.wipro.tutorial.at.pages.LoanPage;
import com.wipro.tutorial.at.pages.LoginPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanSteps extends AbstractSteps {


	@Autowired
	private LoanPage loanPage;
	@Autowired
	private HomePage homePage;

	@Given("User is on the Loan aba")
	public void userGoesLoanPage() throws InterruptedException {
		loanPage.clickLoanPg();

	}

	@When("User is on the MakeLoan page")
	public void userGoesMakeLoanPage() throws InterruptedException {
		Thread.sleep(2000);
		loanPage.clickMakeLoanPg();

	}

	@When("User select the number $account, put $value and click and loan button")
	public void userLoan(	@Named("account") String account,
							  @Named("ammount") String ammount) {
		loanPage.account(account)
				.ammount(ammount)
				.clickLoanButton();
	}

	@Then("The return message for loan an ammount Account is $message")
	public void assertUserIsLoanSucess(@Named("message") String message) {
		Assert.assertEquals(message, loanPage.getMessage());
	}


}
