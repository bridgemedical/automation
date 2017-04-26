package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerBreastMilkSettingsPage extends IEDriver
{
	
	@FindBy (id = "txtBottleRefExpHours") 		public WebElement txtBottleRefExpHours;
	@FindBy (id = "lstBottleRefExpMode") 		public WebElement textBoxFreshExpTimeLengthUnits;
	@FindBy (id = "txtBottleFrzExpHours") 		public WebElement textBoxFrozenExpTimeLength;
	@FindBy (id = "lstBottleFrzExpMode") 		public WebElement textBoxFrozenExpTimeLengthUnits;
	@FindBy (id = "txtBottleThawExpHours") 		public WebElement textBoxThawedExpTimeLength;
	@FindBy (id = "lstBottleThawExpMode") 		public WebElement textBoxThawedExpTimeLengthUnits;
	@FindBy (id = "cmdOK") 						public WebElement buttonConfirm;
	@FindBy (id = "btnCancel") 					public WebElement buttonCancel;
	
}
