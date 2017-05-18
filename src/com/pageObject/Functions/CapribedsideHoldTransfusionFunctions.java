package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideHoldTransfusionPage;

public class CapribedsideHoldTransfusionFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideHoldTransfusionPage holdTransfusionPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideHoldTransfusionPage.class);

	public void enterUnitNumber(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.unitNumberTextbox);
			holdTransfusionPage.unitNumberTextbox.sendKeys(unitNumber);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterUnitNumber method Failed " + e);
		}

	}

	public void selectBloodPlasmaDerivative(String bloodProduct) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.bloodProductDroDown);
			seleniumFunctions.selectValueByVisibleText(holdTransfusionPage.bloodProductDroDown, bloodProduct);
		} catch (Exception e) {
			System.out
					.print("CapribedsideAdministerDerivativesFunctions-selectBloodPlasmaDerivative :Method is failed");
		}

	}

	public void clickYesButtonExitHoldPopup() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.yesButtonExitHoldPopup);
			holdTransfusionPage.yesButtonExitHoldPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickYesButtonExitHoldPopup method Failed " + e);
		}

	}

	public void clickNoButtonExitHoldPopup() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.noButtonExitHoldPopup);
			holdTransfusionPage.noButtonExitHoldPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickNoButtonExitHoldPopup method Failed " + e);
		}

	}

	public void clickContinueButton() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.continueButton);
			holdTransfusionPage.continueButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickContinueButton method Failed " + e);
		}

	}

	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.exitButton);
			holdTransfusionPage.exitButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButton method Failed " + e);
		}

	}

	public void enterStartHoldDateAndTime(String startHoldDate) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.startHoldDateAndTimeTextbox);
			holdTransfusionPage.startHoldDateAndTimeTextbox.sendKeys(startHoldDate);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterStartHoldDateAndTimeTextbox method Failed " + e);
		}

	}

	public void selectReasonForHold(String reasonForHold) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.reasonForHoldDropdown);
			seleniumFunctions.selectValueByVisibleText(holdTransfusionPage.reasonForHoldDropdown, reasonForHold);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectReasonForHold method Failed " + e);
		}

	}

	public void enterEndHoldDateAndTime(String endHoldDate) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.endHoldDateAndTimeTextbox);
			holdTransfusionPage.endHoldDateAndTimeTextbox.sendKeys(endHoldDate);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterEndHoldDateAndTime method Failed " + e);
		}

	}

	public void enterComment(String comment) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.commentTextbox);
			holdTransfusionPage.commentTextbox.sendKeys(comment);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterComment method Failed " + e);
		}

	}
	public void clickContinueHoldButton() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.continueButtonHoldPage);
			holdTransfusionPage.continueButtonHoldPage.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickContinueHoldButton method Failed " + e);
		}

	}
	public void clickExitHoldButton( ) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.exitButtonHoldPage);
			holdTransfusionPage.exitButtonHoldPage.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitHoldButton method Failed " + e);
		}

	}
	public void clickPrintButton( ) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.printButton);
			holdTransfusionPage.printButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickPrintButton method Failed " + e);
		}

	}
	public void clickCancelPrintButton() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.cancelPrintButton);
			holdTransfusionPage.cancelPrintButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickCancelPrintButton method Failed " + e);
		}

	}

}
