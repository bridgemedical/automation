package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageobjects.CapribedsidePatientMainMenuPage;

public class CapribedsidePatientMainMenuFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsidePatientMainMenuPage patientMainMenuPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsidePatientMainMenuPage.class);

	public void clickAdministerBotttleButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.administerBottlesButton);
			patientMainMenuPage.administerBottlesButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickAdministerBotttleButton method Failed " + e);
		}

	}

	public void clickAdministerDerivativeButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.administerDerivativeButton);
			patientMainMenuPage.administerDerivativeButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickAdministerDerivativeButton method Failed " + e);
		}

	}

	public void clickBrowseBottleHistoryButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.browseBottleHistoryButton);
			patientMainMenuPage.browseBottleHistoryButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickBrowseBottleHistoryButton method Failed " + e);
		}

	}

	public void clickBrowseTransfusionHistoryButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.browseTransfusionHistoryButton);
			patientMainMenuPage.browseTransfusionHistoryButton.click();

		} catch (Exception e) {
			System.out
					.println("BabyMatchSelectPatientFunctions: clickBrowseTransfusionHistoryButton method Failed " + e);
		}

	}
	public void verifyBrowseTransfusionHistoryButtonDisplay() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.browseTransfusionHistoryButton);
			Assert.assertTrue(patientMainMenuPage.browseTransfusionHistoryButton.isDisplayed(), "browseTransfusionHistoryButton is displayed");

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyBrowseTransfusionHistoryButtonDisplay method Failed " + e);
		}

	}

	public void clickChangeBloodTypeButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.changeBloodTypeButton);
			patientMainMenuPage.changeBloodTypeButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickChangeBloodTypeButton method Failed " + e);
		}

	}

	public void clickChangePatientButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.changePatientButton);
			patientMainMenuPage.changePatientButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickChangePatientButton method Failed " + e);
		}

	}

	public void clickCollectSpecimensButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.collectSpecimensButton);
			patientMainMenuPage.collectSpecimensButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickCollectSpecimensButton method Failed " + e);
		}

	}

	public void clickCombineBottlesButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.combineBottlesButton);
			patientMainMenuPage.combineBottlesButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickCombineBottlesButton method Failed " + e);
		}

	}

	public void clickConfirmLogoutOKButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.confirmLogoutOKButton);
			patientMainMenuPage.confirmLogoutOKButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickConfirmLogoutOKButton method Failed " + e);
		}

	}

	public void clickDischargeBottlesButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.dischargeBottlesButton);
			patientMainMenuPage.dischargeBottlesButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickDischargeBottlesButton method Failed " + e);
		}

	}

	public void verifyDitheredRrowseTransfusinHistoryButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.ditheredRrowseTransfusinHistoryButton);
			Assert.assertTrue(patientMainMenuPage.ditheredRrowseTransfusinHistoryButton.isEnabled(),
					"Browse Transfusion History Button is dithered");

		} catch (Exception e) {
			System.out.println(
					"BabyMatchSelectPatientFunctions: verifyDitheredRrowseTransfusinHistoryButton method Failed " + e);
		}

	}

	public void clickEndTransfusionButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.endTransfusionButton);
			patientMainMenuPage.endTransfusionButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickEndTransfusionButton method Failed " + e);
		}

	}

	public void clickHoldTransfusionButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.holdTransfusionButton);
			patientMainMenuPage.holdTransfusionButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickHoldTransfusionButton method Failed " + e);
		}

	}

	public void clickLogoutLink() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.logoutLink);
			patientMainMenuPage.logoutLink.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickLogoutLink method Failed " + e);
		}

	}

	public void clickManagePatientInformationButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.managePatientInformationButton);
			patientMainMenuPage.managePatientInformationButton.click();

		} catch (Exception e) {
			System.out
					.println("BabyMatchSelectPatientFunctions: clickManagePatientInformationButton method Failed " + e);
		}

	}

	public void clickPrepareBottlesButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.prepareBottlesButton);
			patientMainMenuPage.prepareBottlesButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickPrepareBottlesButton method Failed " + e);
		}

	}

	public void clickPrintLabelsButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.printLabelsButton);
			patientMainMenuPage.printLabelsButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickPrintLabelsButton method Failed " + e);
		}

	}

	public void clickRapidStartTransfusionButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.rapidStartTransfusionButton);
			patientMainMenuPage.rapidStartTransfusionButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickRapidStartTransfusionButton method Failed " + e);
		}

	}

	public void clickReceiveBottlesButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.receiveBottlesButton);
			patientMainMenuPage.receiveBottlesButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickReceiveBottlesButton method Failed " + e);
		}

	}

	public void clickStartTransfusionButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.startTransfusionButton);
			patientMainMenuPage.startTransfusionButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickStartTransfusionButton method Failed " + e);
		}

	}
	public void verifyStartTransfusionButtonDisplay() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.startTransfusionButton);
			Assert.assertTrue(patientMainMenuPage.startTransfusionButton.isDisplayed(), "Start Transfusion Button is displayed");

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyStartTransfusionButtonDisplay method Failed " + e);
		}

	}

	public void clickStateChangeButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.stateChangeButton);
			patientMainMenuPage.stateChangeButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickStateChangeButton method Failed " + e);
		}

	}

	public void clickViewReactionInformationButton() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.viewReactionInformationButton);
			patientMainMenuPage.viewReactionInformationButton.click();

		} catch (Exception e) {
			System.out
					.println("BabyMatchSelectPatientFunctions: clickViewReactionInformationButton method Failed " + e);
		}

	}
	public void verifyViewReactionInformationButtonDisplay() {
		try {
			seleniumFunctions.waitForElement(patientMainMenuPage.viewReactionInformationButton);
			Assert.assertTrue(patientMainMenuPage.viewReactionInformationButton.isDisplayed(), "View Reaction Information Button is displayed");

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyViewReactionInformationButtonDisplay method Failed " + e);
		}

	}

}