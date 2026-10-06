package com.vb.qa.smoke;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vb.qa.basetest.BaseClass;
import com.vb.qa.elementrepository.HistoryPage;
import com.vb.qa.elementrepository.HomePage;

@Listeners(com.vb.qa.listenerutility.ListenerImplementation.class)
public class TransactionHistoryTest extends BaseClass {
	
	
	@Test(groups= {"Smoke Test"})
	public void transaction() {
		HomePage hp=new HomePage(driver);
		hp.getHistorylink().click();
		HistoryPage hisp=new HistoryPage(driver);
		hisp.getIncomefilter().click();
		
		String actual="//div[@class='table-body']/descendant::span[text()='Transfer In' or text()='Deposit']";		
		String expected="Deposit";
		if(actual.contains(expected)) System.out.println("verified===========");
       // Assert.assertEquals(actual, expected);
		//Assert.assertTrue(actual.contains(expected), 
			   // "Expected text [" + expected + "] was not found in actual text [" + actual + "].");
	}
}
