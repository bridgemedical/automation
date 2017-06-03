package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageobjects.SystemManagerReactionSignsAndSymptomsPage;

public class SystemManagerReactionSignsAndSymptomsPageFunctions 
{
	
	SystemManagerReactionSignsAndSymptomsPage reactionsignspage=  PageFactory.initElements(IEDriver.ieDriver, SystemManagerReactionSignsAndSymptomsPage.class );

	public void createReactionSignsAndSymptoms(String signName,String description) throws Throwable
	{
		reactionsignspage.linkCreateReactionSigns.click();
		Thread.sleep(2000);
		reactionsignspage.textBoxDescriptionCreateReactionSigns.sendKeys(signName);
		Thread.sleep(2000);
		reactionsignspage.textBoxDescriptionCreateReactionSigns.sendKeys(description);
		Thread.sleep(2000);
		reactionsignspage.submitCreateReactionSigns.click();
		Thread.sleep(2000);
	}
}
