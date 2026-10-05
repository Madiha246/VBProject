package com.vb.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanPage {
	public LoanPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
		@FindBy(xpath="//p[text()='Quick approval for personal expenses']")
		private WebElement personalloanbutton;
		
		
		@FindBy(xpath="//button[text()='Next']")
		private WebElement nextbutton;
		
		@FindBy(xpath="//input[@id='amount']")
		private WebElement loanamounttextfield;
		
		@FindBy(xpath="//input[@id='term']")
		private WebElement loantermtextfield;
		
		@FindBy(xpath="//button[text()='Next']")
		private WebElement loannextbutton;
		
		@FindBy(xpath="//button[text()='Submit Application']")
		private WebElement submitapplicationbutton;
		
		public WebElement getSubmitapplicationbutton() {
			return submitapplicationbutton;
		}


		@FindBy(xpath="//span[text()='Loan application submitted successfully!']")
		private WebElement loanconfirmmsg;

		public WebElement getPersonalloanbutton() {
			return personalloanbutton;
		}

		public WebElement getNextbutton() {
			return nextbutton;
		}

		public WebElement getLoanamounttextfield() {
			return loanamounttextfield;
		}

		public WebElement getLoantermtextfield() {
			return loantermtextfield;
		}

		public WebElement getLoannextbutton() {
			return loannextbutton;
		}

		public String getLoanconfirmmsg() {
			return loanconfirmmsg.getText();
		}
		
		
}
