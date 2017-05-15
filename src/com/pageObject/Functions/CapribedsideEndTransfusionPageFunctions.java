package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideEndTransfusionPage;

public class CapribedsideEndTransfusionPageFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideEndTransfusionPage endtransfusionpage = PageFactory.initElements(IEDriver.ieDriver, CapribedsideEndTransfusionPage.class );

	
/*	public void selectBlodProduct(int a)
	{
		element = endtransfusionpage.dropDownBloodProduct();
	   	sel = new Select(element);
	   	sel.selectByIndex(a);
	}

	public void selectTransfusionReactionAnswer(String a)
	{
		element = endtransfusionpage.dropdownTransfusionReaction();
    	sel = new Select(element);
    	sel.selectByValue(a);
	}
	
	public void selectVitalsTempSite(int a) throws InterruptedException
    {    	
		element = endtransfusionpage.vitalsTempSiteTextBox();
    	sel = new Select(element);
    	sel.selectByIndex(a);
    	
    }*/
}
