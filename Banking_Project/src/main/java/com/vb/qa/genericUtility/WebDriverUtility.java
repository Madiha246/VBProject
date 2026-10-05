package com.vb.qa.genericUtility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtility {
	
	public WebDriver driver;
	
	public WebDriver launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else {
			driver=new ChromeDriver();
		}
		return driver;
	}
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}

	public void scrollToElement(WebDriver driver, WebElement incomefilter) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript( "arguments[0].scrollIntoView({block:'center'});", incomefilter );
		
	}

}
