package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Value;

@PageObject
public class DepositPage extends AbstractPage {

	@FindBy(xpath = "//a[@href='deposit']")
	private WebElement depositPg;

	@FindBy(className = "sb-button")
	private WebElement depositBtn;

	@FindBy(id = "targetAccount")
	private WebElement account;

	@FindBy(id = "ammount")
	private WebElement ammount;

	@FindBy(id = "sb-return-message")
	private WebElement message;

	public DepositPage clickDepositButton() {
		depositBtn.click();
		LOG.info("Clicked on Login button.");
		return this;
	}

	public DepositPage clickDepositPg() {
		depositPg.click();
		LOG.info("Clicked on deposit aba");
		return this;
	}

	public DepositPage account (String accountNum) {
		LOG.info("Account: " + accountNum);
		Select drpAccount = new Select(account);
		drpAccount.selectByVisibleText(accountNum);
		//account.sendKeys(accountNum);

		return this;
	}
	public DepositPage ammount (String amountValue) {
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
