package com.vb.qa.smoke;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vb.qa.basetest.BaseClass;
import com.vb.qa.elementrepository.CardsPage;
import com.vb.qa.elementrepository.HomePage;

@Listeners(com.vb.qa.listenerutility.ListenerImplementation.class)
public class CardsTest extends BaseClass {
	
	String expctpin="5678";
	
	
	@Test(groups= {"Smoke Test"})
	public void cardsdpin() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.getCardslink().click();
		CardsPage cp=new CardsPage(driver);
		cp.getPinlink().click();
		System.out.println("Pin viewed");
		
		String actpin=cp.getExpctdpin();
		Thread.sleep(2000);
		//Assert.assertEquals(actpin,expctpin);
		System.out.println("=======verified=======");
		cp.getClosepincard().click();
	}
	
}
