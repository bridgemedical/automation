package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerBabyMatchPage extends IEDriver
{
	@FindBy (id = "lstBabyMatchPromptForLocation") 	public WebElement babyMatchPropmtLocation;
	@FindBy (id = "cmdOK") 							public WebElement confirmButton;
	@FindBy (id = "cmdCancel") 						public WebElement cancelButton;
	
}
