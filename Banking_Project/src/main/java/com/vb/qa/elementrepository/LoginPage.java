package com.vb.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vb.qa.genericUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Login as User']")
	private WebElement userLogin;
	
	@FindBy(xpath="//button[text()='Login as Admin']")
	private WebElement adminLogin;

	public WebElement getUserLogin() {
		return userLogin;
	}

	public WebElement getAdminLogin() {
		return adminLogin;
	}
	
	
}
