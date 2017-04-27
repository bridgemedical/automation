package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerEditBloodProductSubstitutionChartPage extends IEDriver
{
	@FindBy (id = "d8302171783270p4294967382") 		public WebElement textboxABNegGroupBPooledRh;
	@FindBy (id = "cmdOK") 							public WebElement buttonConfirm;
	@FindBy (id = "cmdCancel") 						public WebElement buttonCancel;

}
