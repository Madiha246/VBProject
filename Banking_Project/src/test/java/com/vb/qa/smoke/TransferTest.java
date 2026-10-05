package com.vb.qa.smoke;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.vb.qa.basetest.BaseClass;
import com.vb.qa.elementrepository.HomePage;
import com.vb.qa.elementrepository.TransferPage;

public class TransferTest extends BaseClass {
	
	@Test(groups= {"Smoke Test"})
	public void transferMoney() throws EncryptedDocumentException, IOException {
		
		HomePage hp=new HomePage(driver);
		hp.getTransferlink().click();
		TransferPage tp=new TransferPage(driver);
		tp.transferMoney();
		
	}
	

}
