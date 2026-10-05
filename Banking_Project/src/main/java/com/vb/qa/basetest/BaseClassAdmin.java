package com.vb.qa.basetest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vb.qa.elementrepository.AdminPage;
import com.vb.qa.elementrepository.HomePage;
import com.vb.qa.genericUtility.JavaUtility;
import com.vb.qa.genericUtility.PropertyFileUtility;
import com.vb.qa.genericUtility.WebDriverUtility;

public class BaseClassAdmin {
	public WebDriver driver=null;
	public static WebDriver sdriver=null;
	
	PropertyFileUtility pf = new PropertyFileUtility();
	WebDriverUtility wu=new WebDriverUtility();
	JavaUtility ju=new JavaUtility();
	

	@BeforeSuite(groups= {"Smoke Test","Regression Test"})
	public void configBS() {
		System.out.println("====Connect to DB, Report config====");
		// db.getDbConnection();
	}
    
	//@Parameters("BROWSER")
	
	@BeforeClass(groups= {"Smoke Test","Regression Test"})
		//public void configBC(String browser) throws IOException {
		public void configBC() throws IOException {
		System.out.println("====Launch Browser====");
	//	String BROWSER=browser;
		String browser=pf.readPropertyFile("browser");
		driver=wu.launchBrowser(browser);
	
		sdriver=driver;
		//UtilityClassObject.setDriver(driver);
	}
	
	

	@BeforeMethod(groups= {"Smoke Test","Regression Test"})
	public void configBM() throws IOException {
		
		String URL=pf.readPropertyFile("url");
		wu.maximizeBrowser();
		wu.implicitwait();
		wu.getUrl(URL);
	
		AdminPage lp = new AdminPage(driver);
		lp.getAdminlink().click();
		System.out.println("Logged In to VB Bank as admin");
	}
	

	@AfterMethod(groups= {"Smoke Test","Regression Test"})
	public void configAM() {
		HomePage hp=new HomePage(driver);
		hp.getLogout().click();
		System.out.println("Logged out");
		
	}

	@AfterClass(groups= {"Smoke Test","Regression Test"})
	public void configAC() {
		driver.quit();
	}

	@AfterSuite(groups= {"Smoke Test","Regression Test"})
	public void configAS() {
		System.out.println("====Close DB, Report backup====");
	}

}
