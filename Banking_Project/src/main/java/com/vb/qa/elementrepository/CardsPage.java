package com.vb.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardsPage {
	
	
	public CardsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
		@FindBy(xpath="//button[@data-testid='btn-show-pin']//*[name()='svg']")
		private WebElement pinlink;
		
		@FindBy(xpath="//div[@data-testid='pin-display']")
		private WebElement expctdpin;

		@FindBy(xpath="//button[@data-testid='btn-close-modal']")
		private WebElement closepincard;
		
		public WebElement getClosepincard() {
			return closepincard;
		}


		public String getExpctdpin() {
			return expctdpin.getText();
		}


		public WebElement getPinlink() {
			return pinlink;
		}
	
	
}
