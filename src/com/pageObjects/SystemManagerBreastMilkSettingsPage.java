package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerBreastMilkSettingsPage extends IEDriver
{
	
	@FindBy (id = "txtBottleRefExpHours") 		public WebElement textboxFreshExpLength;
	@FindBy (id = "lstBottleRefExpMode") 		public WebElement textboxFreshExpLengthUnits;
	@FindBy (id = "txtBottleFrzExpHours") 		public WebElement textBoxFrozenExpTimeLength;
	@FindBy (id = "lstBottleFrzExpMode") 		public WebElement textBoxFrozenExpTimeLengthUnits;
	@FindBy (id = "txtBottleThawExpHours") 		public WebElement textBoxThawedExpTimeLength;
	@FindBy (id = "lstBottleThawExpMode") 		public WebElement textBoxThawedExpTimeLengthUnits;
	@FindBy (id = "cmdOK") 						public WebElement buttonConfirm;
	@FindBy (id = "btnCancel") 					public WebElement buttonCancel;
	@FindBy (id = "txtBottleFortExpHours") 		public WebElement textboxFortifiedExpLength;
	@FindBy (id = "lstBottleFortExpMode") 		public WebElement selectFortifiedExpLengthUnits;
	@FindBy (id = "txtDonorMilkThawExpHours") 	public WebElement textboxDonormilkThawedExp;
	
}
