package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObjects.BabyMatchSelectPatientPage;

public class BabyMatchSelectPatientFunctions
{
	WebElement element;
	BabyMatchSelectPatientPage babyMatchSelectPatient = PageFactory.initElements(IEDriver.driver,BabyMatchSelectPatientPage.class );
	public void enetrPatientID(String patientID)
	{
		babyMatchSelectPatient.patientIDTextBox.sendKeys();
	}
	public void clickLogoutLink()
	{
		babyMatchSelectPatient.logoutLink.click();
	}
}
