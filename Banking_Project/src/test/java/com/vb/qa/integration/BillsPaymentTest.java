package com.vb.qa.integration;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.vb.qa.basetest.BaseClass;
import com.vb.qa.elementrepository.BillsPayment;
import com.vb.qa.elementrepository.HomePage;
import com.vb.qa.genericUtility.ExcelUtility;

public class BillsPaymentTest extends BaseClass{
	
	@Test(groups= {"Regression"})
	public void billspayment() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getBillspaymentlink().click();
		
		BillsPayment bp=new BillsPayment(driver);
		bp.getUtilitydropdown();
		ExcelUtility eu=new ExcelUtility();
		String billamount= eu.readExcelFile("Sheet1", 1, 8);
		String billdesciption=eu.readExcelFile("Sheet1", 1, 9);
		bp.getBillsamounttextfield().sendKeys(billamount);
		bp.getBillsdescriptiontextfield().sendKeys(billdesciption);
		bp.getPayfromaccountradiobutton().click();
		bp.getPaybillbutton().click();
		
		
		
		
		
	}
	
	

}
