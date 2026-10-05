package com.vb.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryPage {


	public HistoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@data-testid='filter-btn-income']")
	private WebElement incomebutton;

	@FindBy(xpath="//button[text()='Expense']")
	private WebElement expensebutton;
	
	//@FindAll({@FindBy(xpath="//div[@class='table-body']/descendant::span[text()='Transfer In']"),@FindBy(xpath="//div[@class='table-body']/descendant::span[text()='Deposit']")})
	
	public WebElement getIncomefilter() {
		return incomebutton;
	}

	public WebElement getExpensefilter() {
		return expensebutton;
	}
	
}
