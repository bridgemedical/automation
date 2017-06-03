package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageobjects.SystemManagerMainPage;

public class SystemManagerMainPageFunction 
{
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerMainPage menuPage = PageFactory.initElements(IEDriver.ieDriver,SystemManagerMainPage.class );
	
	public void clickBreastMilkSettings()
	{
		seleniumFunctions.waitForElement(menuPage.buttonBreastMilkSettings);
		menuPage.getButtonBreastMilkSettings().click();
	}
	public void clickRolesButton()
	{
		seleniumFunctions.waitForElement(menuPage.buttonRoles);
		menuPage.buttonRoles.click();
	}
	public void clickUsersButton()
	{
		seleniumFunctions.waitForElement(menuPage.buttonUsers);
		menuPage.buttonUsers.click();
	}
}
