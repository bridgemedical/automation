package com.bridge.utilities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class IEDriver {

	public static WebDriver ieDriver;
	ExtentReports extent;
	ExtentTest test;
	String URL;
	/*
	 * public void callDriver(String URL) throws InterruptedException{
	 * 
	 * System.setProperty("webdriver.ie.driver",
	 * "C:/IEDriverServer_Win32_2.53.0/IEDriverServer.exe"); driver = new
	 * InternetExplorerDriver(); driver.navigate().to(URL); Thread.sleep(1000);
	 * driver.manage().window().maximize();
	 * 
	 * 
	 * 
	 * }
	 */

	public IEDriver() {

	}

	/*public IEDriver(String FilePath, String TestName) {

		extent = new ExtentReports(FilePath, false);
		test = extent.startTest(TestName);

	}

	public ExtentReports extent_Reports() {

		return extent;

	}

	public ExtentTest extent_Test() {

		// test = extent.startTest(TestName);
		return test;
	}

	public void close() {
		ieDriver.close();
	}

	public WebDriver getCurrentdriver() {
		return ieDriver;
	}*/

	public IEDriver(String URL) {

		this.URL = URL;
		ieDriver = iEDriver();

	}

	public WebDriver iEDriver() {

		System.setProperty("webdriver.ie.driver", "C:/IEDriverServer_Win32_2.53.0/IEDriverServer.exe");
		ieDriver = new InternetExplorerDriver();
		ieDriver.navigate().to(URL);
		ieDriver.manage().window().maximize();

		return ieDriver;

	}

}
