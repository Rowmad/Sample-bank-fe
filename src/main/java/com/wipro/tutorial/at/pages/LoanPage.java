package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Value;

@PageObject
public class LoanPage extends AbstractPage {


	@FindBy(xpath = "//*[contains(text(),'Loans')]")
	private WebElement loanPg;
	@FindBy(xpath = "//a[@href='loan']")
	private WebElement makeLoanPg;

	@FindBy(className = "sb-button")
	private WebElement loanBtn;

	@FindBy(id = "targetAccount")
	private WebElement account;

	@FindBy(id = "ammount")
	private WebElement ammount;

	@FindBy(id = "sb-return-message")
	private WebElement message;

	public LoanPage clickLoanButton() {
		loanBtn.click();
		LOG.info("Clicked on Login button.");
		return this;
	}

	public LoanPage clickLoanPg() {
		loanPg.click();
		LOG.info("Clicked on loan aba");
		return this;
	}
	public LoanPage clickMakeLoanPg() {
		makeLoanPg.click();
		LOG.info("Clicked on Makeloan aba");
		return this;
	}

	public LoanPage account (String accountNum) {
		LOG.info("Account: " + accountNum);
		Select drpAccount = new Select(account);
		drpAccount.selectByVisibleText(accountNum);

		return this;
	}
	public LoanPage ammount (String amountValue) {
		LOG.info("Amount value: " + amountValue);
		ammount.sendKeys(amountValue);

		return this;
	}

	public String getMessage() {
		LOG.info("Message: -----> "+message.getText());
		return message.getText();
	}
}
