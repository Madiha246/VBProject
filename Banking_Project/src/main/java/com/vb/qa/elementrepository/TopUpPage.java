package com.vb.qa.elementrepository;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vb.qa.genericUtility.ExcelUtility;

public class TopUpPage {

	public WebDriver driver;
	
	public TopUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(xpath="//input[@id='amount']")
		private WebElement topupamounttextfield;
		
		@FindBy(xpath="//button[text()='500']")
		private WebElement quickselectbutton;
		
		public WebElement getQuickselectbutton() {
			return quickselectbutton;
		}

		@FindBy(xpath="//button[text()='Proceed to Payment']")
		private WebElement proceedtopaymentbutton;
		
		@FindBy(xpath="//input[@id='cardNumber']")
		private WebElement cardnotextfield;	
		
		
		@FindBy(xpath="//input[@id='cardholderName']")
		private WebElement cardholdernametextfield;	
				
		@FindBy(xpath="//input[@id='expiry']")
		private WebElement expirydatetextfield;	
		
		@FindBy(xpath="//input[@id='cvv']")
		private WebElement cvvtextfield;	
		

		public WebElement getTopupamounttextfield() {
			return topupamounttextfield;
		}

		public WebElement getProceedtopaymentbutton() {
			return proceedtopaymentbutton;
		}

		@FindBy(xpath="//button[@data-testid='btn-pay']")
		private WebElement paycardbutton;

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getCardnotextfield() {
			return cardnotextfield;
		}

		public WebElement getCardholdernametextfield() {
			return cardholdernametextfield;
		}

		public WebElement getExpirydatetextfield() {
			return expirydatetextfield;
		}

		public WebElement getCvvtextfield() {
			return cvvtextfield;
		}

		public WebElement getPaycardbutton() {
			return paycardbutton;
		}	
		
		/*public void securepay() throws EncryptedDocumentException, IOException, InterruptedException {
			ExcelUtility eu=new ExcelUtility();
			String cardno=eu.readExcelFile("Sheet1", 1, 4);
			String cardholdername=eu.readExcelFile("Sheet1", 1, 5);
			String expirydate=eu.readExcelFile("Sheet1", 1, 6);
			String cvv=eu.readExcelFile("Sheet1", 1, 7);
			cardnotextfield.sendKeys(cardno);
			cardholdernametextfield.sendKeys(cardholdername);
			Thread.sleep(2000);
			Alert alert=driver.switchTo().alert();
			expirydatetextfield.sendKeys(expirydate);
			Thread.sleep(2000);
			cvvtextfield.sendKeys(cvv);
			paycardbutton.click();
			
		}*/
		
		
}
