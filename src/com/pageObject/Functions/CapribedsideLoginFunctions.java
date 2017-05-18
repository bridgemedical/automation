package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideLoginPage;

public class CapribedsideLoginFunctions
{
	//Constants constants = new Constants();
	//String URL = "http://10.162.106.174/TransSpec2017010102/CapriBedside/Login.aspx";
	SeleniumFunctions seleniumFunction = new SeleniumFunctions();
	IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideLoginPage login = PageFactory.initElements(IEDriver.ieDriver, CapribedsideLoginPage.class);
	
	/*
	 * Method to enter UserName
	 */
	public void enterUserName(String userName) {
	   // try {
			//commonFunctions.waitForElement(login.getUserName());
			login.getUserName().clear();
			login.userName.sendKeys(userName);
			//login.getUserName().sendKeys(userName);
		
		// } 
	    //catch (Exception e) {
		// System.out.println("CapribedsideLoginFunctions-enterUserName : Mathod is failed" + e);
		//}
	}
	/*
	 * Method to enter Password
	 */
	public void enterPassword(String password) {
		try {
			seleniumFunction.waitForElement(login.getPassword());
			login.getPassword().clear();
			login.getPassword().sendKeys(password);
		} catch (Exception e) {
			System.out.println("CapribedsideLoginFunctions-enterPassword : Mathod is failed" + e);
		}
	}
	/*
	 * Method to click on  Password
	 */
	public void clickLoginButton() {
		try {
			//commonFunctions.waitForElement(login.getLoginButton());
			login.getLoginButton().click();
		} catch (Exception e) {
			System.out.println("CapribedsideLoginFunctions-clickLoginButton : Mathod is failed" + e);
		}
	}
	/*
	 * Method to click on  Password
	 */
	public void clickOnClickHereLink() {
		try {
			//commonFunctions.waitForElement(login.getClickHereLink());
			login.clickHereLink.click();
		} catch (Exception e) {
			System.out.println("CapribedsideLoginFunctions-clickOnClickHereLink : Mathod is failed" + e);
		}
	}

}
