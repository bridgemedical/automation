package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageobjects.CapribedsideAdministerDerivativesPage;

public class CapribedsideAdministerDerivativesFunctions {

	// WebElement element;
	Select sel;
	SeleniumFunctions seleniumFunctions;
	CommonFunctions commonFunctions;
	CapribedsideAdministerDerivativesPage administerpage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideAdministerDerivativesPage.class);

	// Method to select blood plasma derivative.
	public void selectBloodPlasmaDerivative(String bloodPlasmaDerivative) 
	{
		try {
			commonFunctions.waitForElement(administerpage.bloodPlasmaDerivativeDropDown);
			seleniumFunctions.selectValueByVisibleText(administerpage.getBloodPlasmaDerivativeDropDown(),
					bloodPlasmaDerivative);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-selectBloodPlasmaDerivative:Method is failed");
		}

	}

	/*
	 * Method to enter patientID .
	 */
	public void enterPatientID(String patientID) {
		commonFunctions.waitForElement(administerpage.patientIDTextBox);
		try {
			administerpage.patientIDTextBox.sendKeys(patientID);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterPatientID :Method is failed");

		}

	}

	/*
	 * Method to enter patient Name
	 */
	public void enterPatientName(String patientName) {
		commonFunctions.waitForElement(administerpage.patientNameTextBox);
		try {
			administerpage.patientIDTextBox.sendKeys(patientName);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterPatientName :Method is failed");

		}

	}

	/*
	 * Method to Select patient blood type
	 */
	public void selectPatientBloodType(String bloodType) {
		commonFunctions.waitForElement(administerpage.patientBloodTypeDropDown);
		try {
			seleniumFunctions.selectValueByVisibleText(administerpage.patientBloodTypeDropDown, bloodType);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-selectPatientBloodType :Method is failed");
		}

	}

	/*
	 * Method to Eenter Manufacturer.
	 */
	public void enterManufacturer(String manufacturer) {
		commonFunctions.waitForElement(administerpage.manufacturerTextBox);
		try {
			administerpage.manufacturerTextBox.sendKeys(manufacturer);
		} catch (Exception e) {
			System.out.print(
					"CapribedsideAdministerDerivativesFunctions-enterPaenterManufacturertientName :Method is failed");

		}

	}

	/*
	 * Method to Enter Lot Number
	 */
	public void enterLotNumber(String lotNumber) {
		commonFunctions.waitForElement(administerpage.lotNumberTextBox);
		try {
			administerpage.lotNumberTextBox.sendKeys(lotNumber);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterLotNumber :Method is failed");

		}

	}

	/*
	 * Method to Eneter IU Concentration.
	 */
	public void enterIUConcentration(String iuConcentration) {
		commonFunctions.waitForElement(administerpage.iuConcentrationTextBox);
		try {
			administerpage.iuConcentrationTextBox.sendKeys(iuConcentration);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterIUConcentration :Method is failed");

		}

	}

	/*
	 * Method to Select injection site
	 */
	public void selectInjectionSite(String injectionSite) {
		commonFunctions.waitForElement(administerpage.injectionSiteDropDown);
		try {
			seleniumFunctions.selectValueByVisibleText(administerpage.injectionSiteDropDown, injectionSite);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-selectInjectionSite :Method is failed");
		}

	}

	/*
	 * Method to enter serial number
	 */
	public void enterSerialNumber(String serialNumber) {
		commonFunctions.waitForElement(administerpage.serialNumberTextBox);
		try {
			administerpage.serialNumberTextBox.sendKeys(serialNumber);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterSerialNumber :Method is failed");

		}
	}

	/*
	 * Method to enter volume
	 */
	public void enterVolume(String volume) {
		commonFunctions.waitForElement(administerpage.volumeTextBox);
		try {
			administerpage.volumeTextBox.sendKeys(volume);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterVolume :Method is failed");

		}
	}

	/*
	 * Method to enter expire date
	 */
	public void enterExpireDate(String date) {
		commonFunctions.waitForElement(administerpage.expiresTextBox);
		try {
			administerpage.expiresTextBox.sendKeys(date);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterExpireDate :Method is failed");

		}
	}

	/*
	 * Method to enter quantity to administer derivative
	 */
	public void enterQuantity(String quantity) {
		commonFunctions.waitForElement(administerpage.quantityTextBox);
		try {
			administerpage.quantityTextBox.sendKeys(quantity);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterQuantity :Method is failed");

		}
	}

	/*Cosignature section
	 * Method to enter Cosign username
	 */
	public void enterUserName(String userName) {
		commonFunctions.waitForElement(administerpage.getUserIDTextBox());
		try {
			administerpage.getUserIDTextBox().sendKeys(userName);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterUserName :Method is failed");

		}

	}
	/*
	 * Method to enter Cosign Password
	 */
	public void enterPassword(String password) {
		commonFunctions.waitForElement(administerpage.getPasswordTextBox());
		try {
			administerpage.getPasswordTextBox().sendKeys(password);
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-enterPassword :Method is failed");

		}

	}
	/*
	 * Method to click confirm button
	 */
	public void clickContinueButton() {
		commonFunctions.waitForElement(administerpage.getContinueButton());
		try {
			administerpage.getContinueButton().click();
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-clickContinue :Method is failed");

		}

	}
	/*
	 * Method to click cancel button 
	 */
	public void clickCancelButton() {
		commonFunctions.waitForElement(administerpage.getCancelButton());
		try {
			administerpage.getCancelButton().click();
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-clickCancelButton :Method is failed");

		}

	}
	/*
	 * Method to click logout link from header 
	 */
	public void clickLogoutLink() {
		commonFunctions.waitForElement(administerpage.getLinkLogOut());
		try {
			administerpage.getLinkLogOut().click();
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-clickLogoutLink :Method is failed");

		}

	}
	/*
	 * Method to click Yes from Logout Popup 
	 */
	public void clickYesFromLogoutConfim() {
		commonFunctions.waitForElement(administerpage.getLinkLogOut());
		try {
			administerpage.getLinkLogOut().click();
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-clickLogoutLink :Method is failed");

		}

	}
	/*
	 * Method to click No from Logout Popup 
	 */
	public void clickNoFromLogoutConfim() {
		try {
			commonFunctions.waitForElement(administerpage.getLogOutPopupNoButton());
			administerpage.getLogOutPopupNoButton().click();
		} catch (Exception e) {
			System.out.print("CapribedsideAdministerDerivativesFunctions-clickNoFromLogoutConfim :Method is failed");

		}

	}

}
