package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideAdministerDerivativesPage;

public class CapribedsideAdministerDerivativesFunctions {

	// WebElement element;
	Select sel;
	SeleniumFunctions seleniumFunctions;
	CommonFunctions commonFunctions;
	CapribedsideAdministerDerivativesPage administerpage = PageFactory.initElements(IEDriver.driver,
			CapribedsideAdministerDerivativesPage.class);

	// Method to select blood plasma derivative.
	public void selectBloodPlasmaDerivative(String visibleText) {
		commonFunctions.waitForElement(administerpage.getBloodPlasmaDerivativeDropDown());
		try {
			seleniumFunctions.selectValueByVisibleText(administerpage.getBloodPlasmaDerivativeDropDown(), visibleText);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-selectBloodPlasmaDerivative:Method is failed");
		}

	}

	/*
	 * Method to enter patientID text box.
	 */
	public void enterPatientID(String patientID) {
		commonFunctions.waitForElement(administerpage.patientIDTextBox);
		try {
			administerpage.patientIDTextBox.sendKeys(patientID);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterPatientID :Method is failed");

		}

	}

}
