package com.vb.qa.elementrepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vb.qa.genericUtility.ExcelUtility;

public class TransferPage {
	
	public TransferPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='recipientAccount']")
	private WebElement recipienttextfield;
	
	public WebElement getRecipienttextfield() {
		return recipienttextfield;
	}

	public WebElement getAmounttextfield() {
		return amounttextfield;
	}

	public WebElement getDescriptiontextfield() {
		return descriptiontextfield;
	}

	public WebElement getTransfermoneybutton() {
		return transfermoneybutton;
	}

	@FindBy(xpath="//input[@name='amount']")
	private WebElement amounttextfield;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptiontextfield;
	

	@FindBy(xpath="//span[text()='Transfer Money']")
	private WebElement transfermoneybutton;
	
	public void transferMoney() throws EncryptedDocumentException, IOException {
		ExcelUtility eu=new ExcelUtility();
		String recipient =eu.readExcelFile("Sheet1", 1, 0);
		String transferAmount=eu.readExcelFile("Sheet1", 1, 1);
		String descriptionpt =eu.readExcelFile("Sheet1", 1, 2);
		recipienttextfield.sendKeys(recipient);
		amounttextfield.sendKeys(transferAmount);
		descriptiontextfield.sendKeys("descriptionopt");
		transfermoneybutton.click();
		System.out.println("transferred");
		
	}
}
