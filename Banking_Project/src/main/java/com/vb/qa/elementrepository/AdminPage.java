package com.vb.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
		@FindBy(xpath="//button[text()='Login as Admin']")
		private WebElement adminlink;
		
		@FindBy(xpath="//span[text()='User Management']")
		private WebElement usermgmntlink;
		
		@FindBy(xpath="//input[@data-testid='input-search-users']")
		private WebElement searchtextfield;

		public WebElement getAdminlink() {
			return adminlink;
		}

		public WebElement getUsermgmntlink() {
			return usermgmntlink;
		}

		public WebElement getSearchtextfield() {
			return searchtextfield;
		}
}
