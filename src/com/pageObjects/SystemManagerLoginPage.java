package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;;
public class SystemManagerLoginPage
{
	@FindBy (id = "UserId") 		public WebElement textboxUsername;
	@FindBy (id = "Password") 		public WebElement textboxPassword;
	@FindBy (id = "cmdLogin") 		public WebElement buttonLogin;
	@FindBy (id = "errorsLabel") 	public WebElement labelErrorText;

}
