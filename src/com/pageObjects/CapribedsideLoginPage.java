package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideLoginFunctions;


public class CapribedsideLoginPage  {
	
	
	@FindBy (id="UserId")
	private WebElement userName;
//	public WebElement getUserName() 
//	{
//		return userName;
//	}
	
	public WebElement getUserName() {
		return userName;
	}

	@FindBy (id="Password")
	public WebElement password;
	public WebElement getPassword() 
	{
		return password;
	}
	
	@FindBy (id="cmdLogin")
	public WebElement loginButton;
	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	@FindBy (id="btnChangePw")
	public WebElement clickHereLink;
	public WebElement getClickHereLink() 
	{
		return clickHereLink;
	}
	
	//Hazards
	@FindBy (id="errorsLabel")
	public WebElement noPrivilegeToAccessBridgeMedicalErrorMessage;
	
}
