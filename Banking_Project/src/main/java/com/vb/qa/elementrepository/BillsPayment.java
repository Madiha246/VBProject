package com.vb.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillsPayment {

	public BillsPayment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getUtilitydropdown() {
		Select sel=new Select(utilitydropdown);
		sel.selectByValue("provider_004");
		//return utilitydropdown;
	}

	public WebElement getBillsamounttextfield() {
		return billsamounttextfield;
	}

	public WebElement getBillsdescriptiontextfield() {
		return billsdescriptiontextfield;
	}

	public WebElement getPaybillbutton() {
		return paybillbutton;
	}

	public WebElement getPayfromaccountradiobutton() {
		return payfromaccountradiobutton;
	}

	@FindBy(xpath="//select[@id='provider']")
	private WebElement utilitydropdown;
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement billsamounttextfield;
	
	@FindBy(xpath="//input[@id='description']")
	private WebElement billsdescriptiontextfield;
	
	@FindBy(xpath="//input[@name='paymentMethod' and @value='account']")
	private WebElement payfromaccountradiobutton;
	
	@FindBy(xpath="//button[text()='Pay Bill']")
	private WebElement paybillbutton;
}
