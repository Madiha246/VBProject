package com.vb.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboardlink;
	
	@FindBy(xpath="//span[text()='Transfer']")
	private WebElement transferlink;
	
	@FindBy(xpath="//span[text()='History']")
	private WebElement historylink;
	
	@FindBy(xpath="//span[text()='Bills Payment']")
	private WebElement billspaymentlink;
	
	@FindBy(xpath="//span[text()='Cards']")
	private WebElement cardslink;
	
	@FindBy(xpath="//span[text()='Loans']")
	private WebElement loanslink;
	
	@FindBy(xpath="//span[text()='Top Up']")
	private WebElement topUplink;
	
	@FindBy(xpath="//span[text()='Settings']")
	private WebElement settingslink;
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement logout;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDashboardlink() {
		return dashboardlink;
	}

	public WebElement getTransferlink() {
		return transferlink;
	}

	public WebElement getHistorylink() {
		return historylink;
	}

	public WebElement getBillspaymentlink() {
		return billspaymentlink;
	}

	public WebElement getCardslink() {
		return cardslink;
	}

	public WebElement getLoanslink() {
		return loanslink;
	}

	public WebElement getTopUplink() {
		return topUplink;
	}

	public WebElement getSettingslink() {
		return settingslink;
	}

	public WebElement getLogout() {
		return logout;
	}
}
