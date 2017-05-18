package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideChangeBloodTypePage;

public class CapribedsideChangeBloodTypeFunctions 
{
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideChangeBloodTypePage changeBloodTypePage = PageFactory.initElements(IEDriver.ieDriver, CapribedsideChangeBloodTypePage.class );

	public void selectNewBloodType(String newBloodType) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.newBloodTypeDropdown);
			seleniumFunctions.selectValueByVisibleText(changeBloodTypePage.newBloodTypeDropdown, newBloodType);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectNewBloodType method Failed " + e);
		}

	}
	public void selectConfirmNewBloodType(String confirmNewBloodType) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.confirmNewBloodTypeDropdown);
			seleniumFunctions.selectValueByVisibleText(changeBloodTypePage.confirmNewBloodTypeDropdown, confirmNewBloodType);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectConfirmNewBloodType method Failed " + e);
		}

	}
	public void selectReasonBloodChange(String reasonBloodChange) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.reasonForBloodTypeChangeDropdown);
			seleniumFunctions.selectValueByVisibleText(changeBloodTypePage.reasonForBloodTypeChangeDropdown, reasonBloodChange);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectReasonBloodChange method Failed " + e);
		}

	}
	public void enterUserId(String userId) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.userIDTextbox);
			changeBloodTypePage.userIDTextbox.sendKeys(userId);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterUserId method Failed " + e);
		}

	}
	public void enterPassword(String password) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.passwordTextbox);
			changeBloodTypePage.passwordTextbox.sendKeys(password);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterPassword method Failed " + e);
		}

	}
	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.confirmButton);
			changeBloodTypePage.confirmButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickConfirmButton method Failed " + e);
		}

	}
	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.exitButton);
			changeBloodTypePage.exitButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButton method Failed " + e);
		}

	}
	
	public void getCurrentBloodType() {
		try {
			String currentBloodType = changeBloodTypePage.currentBloodTypeVisibleText.getText();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: getCurrentBloodType method Failed " + e);
		}
		

	}
	
}


