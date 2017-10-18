package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Value;

@PageObject
public class WithdrawPage extends AbstractPage {

	@FindBy(id = "targetAccount")
	private WebElement account;

	@FindBy(id = "ammount")
	private WebElement ammount;

	@FindBy(id = "sb-return-message")
	private WebElement message;

	@FindBy(xpath = "//a[@href='withdraw']")
	private WebElement withdrawPg;

	@FindBy(className = "sb-button")
	private WebElement withdrawBtn;
	
	public WithdrawPage clickWithdrawButton() {
		withdrawBtn.click();
		LOG.info("Clicked on withdraw button.");
		return this;
	}
	public WithdrawPage clickWithdrawPg() {
		withdrawPg.click();
		LOG.info("Clicked on withdraw aba");
		return this;
	}

	public WithdrawPage account (String accountNum) {
		LOG.info("Account: " + accountNum);
		Select drpAccount = new Select(account);
		drpAccount.selectByVisibleText(accountNum);
		//account.sendKeys(accountNum);

		return this;
	}
	public WithdrawPage ammount (String amountValue) {
		LOG.info("Amount value: " + amountValue);
		ammount.sendKeys(amountValue);

		return this;
	}

	public String getMessage() {
		//message.getText();
		LOG.info("Message: -----> "+message.getText());
		return message.getText();
	}
}
