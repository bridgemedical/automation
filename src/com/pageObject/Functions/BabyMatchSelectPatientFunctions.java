package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObjects.BabyMatchSelectPatientPage;

public class BabyMatchSelectPatientFunctions
{
	
	BabyMatchSelectPatientPage babyMatchSelectPatient = PageFactory.initElements(IEDriver.ieDriver,BabyMatchSelectPatientPage.class );
	public void enetrPatientID(String patientID)
	{
		babyMatchSelectPatient.patientIDTextBox.sendKeys();
	}
	public void clickLogoutLink()
	{
		babyMatchSelectPatient.logoutLink.click();
	}
}
