package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerMainPage;

public class SystemManagerMainPageFunction 
{
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerMainPage menuPage = PageFactory.initElements(IEDriver.ieDriver,SystemManagerMainPage.class );
	
	public void clickBreastMilkSettings()
	{
		seleniumFunctions.waitForElement(menuPage.buttonBreastMilkSettings);
		menuPage.getButtonBreastMilkSettings().click();
	}
}
