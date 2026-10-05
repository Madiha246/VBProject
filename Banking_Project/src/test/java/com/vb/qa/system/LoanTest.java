package com.vb.qa.system;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vb.qa.basetest.BaseClass;
import com.vb.qa.elementrepository.HomePage;
import com.vb.qa.elementrepository.LoanPage;
import com.vb.qa.genericUtility.ExcelUtility;

public class LoanTest extends BaseClass {
     String expctd="Loan application submitted successfully!";
	
	@Test
	public void loan() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getLoanslink().click();
		LoanPage lp = new LoanPage(driver);
		lp.getPersonalloanbutton().click();
		lp.getNextbutton().click();
		ExcelUtility eu=new ExcelUtility();
		String loanamount=eu.readExcelFile("Sheet1", 1, 11);
		String loanterm=eu.readExcelFile("Sheet1", 1, 12);
		lp.getLoanamounttextfield().sendKeys(loanamount);
		lp.getLoantermtextfield().sendKeys(loanterm);
		lp.getLoannextbutton().click();
		lp.getSubmitapplicationbutton().click();
		String actmsg=lp.getLoanconfirmmsg();
		Assert.assertEquals(expctd, actmsg);
		System.out.println("loan application submit");
		
		

	}

}