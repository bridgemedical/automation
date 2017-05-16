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
	
	public IEDriver() {

	}

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
