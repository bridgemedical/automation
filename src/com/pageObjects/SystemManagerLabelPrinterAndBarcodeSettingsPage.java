package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerLabelPrinterAndBarcodeSettingsPage extends IEDriver
{
	@FindBy (id = "trBarcodeTypes") 				public WebElement linkBarcodeType;
	
}
