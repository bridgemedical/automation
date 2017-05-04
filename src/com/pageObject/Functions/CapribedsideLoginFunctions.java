package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideLoginPage;

public class CapribedsideLoginFunctions
{
	//CapribedsideLoginPage login;
	//CommonFunctions commonFunctions = new CommonFunctions();
	String URL = "http://10.162.106.174/TransSpec2017010102/CapriBedside/Login.aspx";
	//CapribedsideLoginPage login;// = PageFactory.initElements(IEDriver.driver, CapribedsideLoginPage.class);
//	public CapribedsideLoginFunctions(IEDriver iedriver)
//	{
//		PageFactory.initElements(iedriver.driver,CapribedsideLoginPage.class);
//	}
	IEDriver ieDriver = new IEDriver(URL);
	CapribedsideLoginPage login = PageFactory.initElements(IEDriver.ieDriver, CapribedsideLoginPage.class);
	
	/*
	 * Method to enter UserName
	 */
	public void enterUserName(String userName) {
	   // try {
			//commonFunctions.waitForElement(login.getUserName());
			login.getUserName().clear();
			//login.userName.sendKeys(userName);
			login.getUserName().sendKeys(userName);
		
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
			//commonFunctions.waitForElement(login.getPassword());
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
