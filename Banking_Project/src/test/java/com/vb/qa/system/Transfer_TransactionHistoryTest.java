package com.vb.qa.system;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.vb.qa.basetest.BaseClass;
import com.vb.qa.elementrepository.HistoryPage;
import com.vb.qa.elementrepository.HomePage;
import com.vb.qa.elementrepository.TransferPage;
import com.vb.qa.genericUtility.ExcelUtility;

public class Transfer_TransactionHistoryTest extends BaseClass{

	@Test
	public void transferMoney() throws EncryptedDocumentException, IOException, InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.getTransferlink().click();
		TransferPage tp=new TransferPage(driver);
		ExcelUtility eu=new ExcelUtility();
		String recipient =eu.readExcelFile("Sheet1", 1, 0);
		String transferAmount=eu.readExcelFile("Sheet1", 1, 1);
		String descriptionpt =eu.readExcelFile("Sheet1", 1, 2);
		tp.getRecipienttextfield().sendKeys(recipient);
		tp.getAmounttextfield().sendKeys(transferAmount);
		tp.getDescriptiontextfield().sendKeys(descriptionpt);
		tp.getTransfermoneybutton().click();
		System.out.println("transferred");
		hp.getDashboardlink().click();

		
		Thread.sleep(2000);
		System.out.println("getting transaction history");
		hp.getHistorylink().click();
		HistoryPage hisp=new HistoryPage(driver);
		hisp.getIncomefilter().click();
		
		
	  // WebDriverUtility wdu = new WebDriverUtility();
		//HistoryPage hisp=new HistoryPage(driver);
		//wdu.scrollToElement(driver, hisp.getIncomefilter());

		//hisp.getIncomefilter().click();
	
		
		
		String actual="//div[@class='table-body']/descendant::span[text()='Transfer In' or text()='Deposit']";		
		String expected="Deposit";
		if(actual.contains(expected)) System.out.println("verified===========");
		
	}
	
}
