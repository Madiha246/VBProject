package com.vb.qa.integration;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.vb.qa.basetest.BaseClassAdmin;
import com.vb.qa.elementrepository.AdminPage;
import com.vb.qa.genericUtility.ExcelUtility;

public class AdminTest extends BaseClassAdmin{
	
	@Test(groups= {"Smoke","Regression"})
	public void adminuser() throws EncryptedDocumentException, IOException, InterruptedException {
		
		AdminPage ap=new AdminPage(driver);
		
		ap.getUsermgmntlink().click();
		ExcelUtility eu=new ExcelUtility();
		String searchtextfield= eu.readExcelFile("Sheet1", 1,10 );
		ap.getSearchtextfield().sendKeys(searchtextfield);
	}
}
