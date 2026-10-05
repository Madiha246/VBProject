package com.vb.qa.listenerutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vb.qa.basetest.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerImplementation implements ITestListener, ISuiteListener {
	ExtentReports report;
	ExtentTest test;
	
	public void onStart(ISuite suite) {
		System.out.println("========Report Configuration========");
		ExtentSparkReporter spark=new ExtentSparkReporter("");
		spark.config().setDocumentTitle("VB Bank");
		spark.config().setReportName("VB Report");
		spark.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows11");
		report.setSystemInfo("Browser", "chrome");
	}
	
	public void onFinish(ISuite suite) {
		System.out.println("Report backup");
		report.flush();
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("======"+result.getMethod().getMethodName()+"=======");
			 test=report.createTest(result.getMethod().getMethodName());
			test.log(Status.INFO, result.getMethod().getMethodName()+"====STARTED========");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("======"+result.getMethod().getMethodName()+"===========");
		test.log(Status.PASS, result.getMethod().getMethodName()+"==> COMPLETED==");
	}
	
	public void onTestFailure(ITestResult result) {
		String tsName=result.getMethod().getMethodName();
		String time=new Date().toString().replace(" ", "_").replace(":", "_");
		
		TakesScreenshot ts=(TakesScreenshot)BaseClass.sdriver;
		String filePath=ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(filePath,tsName+"_"+time);
		test.log(Status.FAIL, result.getMethod().getMethodName()+"==> FAILED==");
	}
	
	public void onTestSkipped(ITestResult result) {
		
	}

}
