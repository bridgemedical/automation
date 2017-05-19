package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerMainPage;

public class SystemManagerMainPageFunction 
{

	SystemManagerMainPage menuPage = PageFactory.initElements(IEDriver.ieDriver,SystemManagerMainPage.class );
	
	public void clickBreastMilkSettings()
	{
		menuPage.getButtonBreastMilkSettings().click();
	}
}
