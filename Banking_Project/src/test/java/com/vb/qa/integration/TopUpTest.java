package com.vb.qa.integration;

import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.vb.qa.basetest.BaseClass;
import com.vb.qa.elementrepository.HomePage;
import com.vb.qa.elementrepository.TopUpPage;
import com.vb.qa.genericUtility.ExcelUtility;

public class TopUpTest extends BaseClass{

	@Test
	public void topUp() throws EncryptedDocumentException, IOException, InterruptedException, ParseException {
		System.out.println("top up started");
		HomePage hp=new HomePage(driver);
		hp.getTopUplink().click();
		ExcelUtility eu=new ExcelUtility();
		String topupamount= eu.readExcelFile("Sheet1", 1, 3);
		TopUpPage tp=new TopUpPage(driver);
		tp.getTopupamounttextfield().sendKeys(topupamount);
		//tp.getProceedtopaymentbutton().click();
		//tp.securepay();
		tp.getQuickselectbutton().click();
		tp.getProceedtopaymentbutton().click();
		
		String cardno=eu.readExcelFile("Sheet1", 1, 4);
		String cardholdername=eu.readExcelFile("Sheet1", 1, 5);
		String expirydate=eu.readExcelFileDate("Sheet1", 1, 6);
		String cvv=eu.readExcelFile("Sheet1", 1, 7);
		tp.getCardnotextfield().sendKeys(cardno);
		tp.getCardholdernametextfield().sendKeys(cardholdername);

		tp.getExpirydatetextfield().sendKeys(expirydate);
		Thread.sleep(2000);
		
		
	//	Alert ref=driver.switchTo().alert();
		//ref.accept();
		tp.getCvvtextfield().sendKeys(cvv);
		Thread.sleep(2000);
		tp.getPaycardbutton().click();
		
		System.out.println("Expiry Date: " + expirydate);
		System.out.println("top up done");
		
   
		
		
	}
}
