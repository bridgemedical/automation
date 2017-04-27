package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerBarcodeTypePage extends IEDriver
{
	@FindBy (id = "dlItems__ctl10_editLink") 	public WebElement editLinkPatientIDWristband;
	@FindBy (id = "txtExtra") 					public WebElement textboxPrefix;
	@FindBy (id = "txtExtra3") 					public WebElement textboxSuffix;
	@FindBy (id = "cmdOK") 						public WebElement buttonConfirm;
	@FindBy (id = "cmdCancel") 					public WebElement buttonCancel;
	
}
