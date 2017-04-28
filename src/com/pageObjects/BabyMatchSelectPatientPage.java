package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class BabyMatchSelectPatientPage extends IEDriver
{   
	private static WebElement element = null;

    @FindBy ( id = "txtPatientId")
    public WebElement patientIDTextBox;
    public WebElement getPatientIDTextBox() 
	{
		return patientIDTextBox;
	}
    
    //logout link
	@FindBy ( id = "header_cmdLogout")
    public WebElement logoutLink;
	 public WebElement getlogoutLink() 
		{
			return logoutLink;
		}
	
}
