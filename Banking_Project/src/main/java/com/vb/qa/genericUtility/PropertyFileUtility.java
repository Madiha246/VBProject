package com.vb.qa.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	FileInputStream fis;

	public String readPropertyFile(String key) throws IOException {

		fis = new FileInputStream("D:\\Selenium-ms\\Banking_Project\\src\\test\\resources\\commonData.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}
