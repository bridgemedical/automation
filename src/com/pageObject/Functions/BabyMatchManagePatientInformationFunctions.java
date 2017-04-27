package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.BabyMatchManagePatientInformationPage;

public class BabyMatchManagePatientInformationFunctions
{
	WebElement element;
	Select sel;
	BabyMatchManagePatientInformationPage managePatientInformation = PageFactory.initElements(IEDriver.driver,BabyMatchManagePatientInformationPage.class );
	//Function to click on EditMother link
	
	public void clickEditMotherLink()
	{
		managePatientInformation.editMotherLink.click();
	}

	//Enter Correct Mother Name
	public void enterCorrectMotherName(String name)
	{
		managePatientInformation.correctMotherNameTextBox.sendKeys(name);
	}
	
	public void enterCorrectMotherID(String id)
	{
		managePatientInformation.correctMotherIDTextBox.sendKeys(id);
	}
	
	public void clickConfirmButton()
	{
		managePatientInformation.confirmButton.click();
	}
	
	public void clickExitButton()
	{
		managePatientInformation.exitButton.click();
	}
}
