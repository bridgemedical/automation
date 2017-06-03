package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageobjects.CapribedsideBrowseTransfusionHistoryPage;

import junit.framework.Assert;

public class CapribedsideBrowseTransfusionHistoryPageFunctions {

	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideBrowseTransfusionHistoryPage browsetranshistorypage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideBrowseTransfusionHistoryPage.class);

	public void clickGeneralButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.generalButton);
			browsetranshistorypage.generalButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickGeneralButton method Failed " + e);
		}

	}

	public void clickReactionButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.reactionButton);
			browsetranshistorypage.reactionButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickReactionButton method Failed " + e);
		}

	}

	public void clickVitalsButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.vitalsButton);
			browsetranshistorypage.vitalsButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickVitalsButton method Failed " + e);
		}

	}

	public void clickChecksButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.checksButton);
			browsetranshistorypage.checksButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickChecksButton method Failed " + e);
		}
	}
	public void clickHoldButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.holdButton);
			browsetranshistorypage.holdButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickHoldButton method Failed " + e);
		}
	}
	public void clickBackButtonFromInfoPage() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.backButtonInformationPage);
			browsetranshistorypage.backButtonInformationPage.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickBackButtonFromInfoPage method Failed " + e);
		}
	}
	
	public void enterEndTransfusionDateEditTransfusion(String endTransfusionDate) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.endTransfusionDateTextBox);
			browsetranshistorypage.endTransfusionDateTextBox.sendKeys(endTransfusionDate);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterEndTransfusionDateEditTransfusion method Failed " + e);
		}
	}
	public void selectStorageStateFilter(String bloodProduct) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.bloodProductDropDown);
			seleniumFunctions.selectValueByVisibleText(browsetranshistorypage.bloodProductDropDown, bloodProduct);
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectStorageStateFilter method Failed " + e);

		}

	}
	
	public void enterValueForVolumeTransfused(String volume) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.volumeTransfusedTextBox);
			browsetranshistorypage.volumeTransfusedTextBox.sendKeys(volume);
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterValueForVolumeTransfused method Failed " + e);

		}

	}
	
	public void clickConfirmButtonFrEditTransfusion() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.confirmEditTransfusionButton);
			browsetranshistorypage.confirmEditTransfusionButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickConfirmButtonFrEditTransfusion method Failed " + e);

		}

	}
	public void clickExitButtonOfEditTransfusion() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitEditTransfusionButton);
			browsetranshistorypage.exitEditTransfusionButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButtonFrEditTransfusion method Failed " + e);

		}

	}
	public void enterAdministerDateForBloodPlasmaDerivative(String administerDate) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.administerDateTimeTextBox);
			browsetranshistorypage.administerDateTimeTextBox.sendKeys(administerDate);
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterAdministerDateForBloodPlasmaDerivative method Failed " + e);

		}

	}
	
	public void clickConfirmButtonEditBloodplasmaDerivative() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.confirmEditBloodPlasmaDerivativeButton);
			browsetranshistorypage.confirmEditBloodPlasmaDerivativeButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButtonFrEditTransfusion method Failed " + e);

		}

	}
	
	public void clickExitButtonEditBloodplasmaDerivative() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitEditBloodPlasmaDerivativeButton);
			browsetranshistorypage.exitEditBloodPlasmaDerivativeButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButtonEditBloodplasmaDerivative method Failed " + e);

		}

	}
	
	//Functions for Reaction Post Transfusion.
	public void checkElevatedTemperatureCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.elevatedTemperatureCheckBox);
			if(browsetranshistorypage.elevatedTemperatureCheckBox.isSelected())
			{
				Thread.sleep(1000);
			}
			else
			{
				browsetranshistorypage.elevatedTemperatureCheckBox.click();
			}
			
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkElevatedTemperatureCheckbox method Failed " + e);

		}

	}
	public void checkAnaphylaxisCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.anaphylaxisCheckBox);
			if(browsetranshistorypage.anaphylaxisCheckBox.isSelected())
			{
				Thread.sleep(1000);
			}
			else
			{
				browsetranshistorypage.anaphylaxisCheckBox.click();
			}
			
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkAnaphylaxisCheckbox method Failed " + e);

		}

	}
	public void checkHypotensionCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.hypotensionCheckBox);
			if(browsetranshistorypage.hypotensionCheckBox.isSelected())
			{
				Thread.sleep(1000);
			}
			else
			{
				browsetranshistorypage.hypotensionCheckBox.click();
			}
			
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkHypotensionCheckbox method Failed " + e);

		}

	}
	public void checkReducedUrineOutputCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.reducedUrinOutputCheckbox);
			if(browsetranshistorypage.reducedUrinOutputCheckbox.isSelected())
			{
				Thread.sleep(1000);
			}
			else
			{
				browsetranshistorypage.reducedUrinOutputCheckbox.click();
			}
			
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkHypotensionCheckbox method Failed " + e);

		}

	}
	public void checkFailureToClotCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.failureToClotCheckbox);
			if(browsetranshistorypage.failureToClotCheckbox.isSelected())
			{
				Thread.sleep(1000);
			}
			else
			{
				browsetranshistorypage.failureToClotCheckbox.click();
			}
			
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkFailureToClotCheckbox method Failed " + e);

		}

	}
	
	public void checkDyspeneaNauseaCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.dyspneaNauseaCheckBox);
			if(browsetranshistorypage.dyspneaNauseaCheckBox.isSelected())
			{
				Thread.sleep(1000);
			}
			else
			{
				browsetranshistorypage.dyspneaNauseaCheckBox.click();
			}
			
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkDyspeneaNauseaCheckbox method Failed " + e);

		}

	}
	public void checkUticariaChillsCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.uticariaChillsCheckbox);
			if(browsetranshistorypage.uticariaChillsCheckbox.isSelected())
			{
				Thread.sleep(1000);
			}
			else
			{
				browsetranshistorypage.uticariaChillsCheckbox.click();
			}
			
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkDyspeneaNauseaCheckbox method Failed " + e);

		}

	}
	public void clickContinueButtonPostTransfusionReaction() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.confirmPostTransfusionButton);
			browsetranshistorypage.confirmPostTransfusionButton.click();
			
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkDyspeneaNauseaCheckbox method Failed " + e);

		}

	}
	public void clickExitButtonPostTransfusionReaction() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitPostTransfusionButton);
			browsetranshistorypage.exitPostTransfusionButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButtonPostTransfusionReaction method Failed " + e);

		}

	}
	
	//Functions for reaction instruction page.
	public void verifyReactionInstructionHeader() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitPostTransfusionButton);
			Assert.assertTrue(browsetranshistorypage.exitPostTransfusionButton.isDisplayed());
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyReactionInstructionHeader method Failed " + e);

		}

	}
	public void clickConfirmReactionInstructionButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.confirmReactionInstructionButton);
			browsetranshistorypage.confirmReactionInstructionButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickConfirmButtonReactionInstruction method Failed " + e);

		}

	}public void clickExitReactionInstructionButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitReactionInstructionButton);
			browsetranshistorypage.exitReactionInstructionButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitReactionInstructionButton method Failed " + e);

		}

	}public void clickBackButtonBrowseTransfusionHistoryPage() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.backButtonBrowseTransfusionHistoryPage);
			browsetranshistorypage.backButtonBrowseTransfusionHistoryPage.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickBackButtonBrowseTransfusionHistoryPage method Failed " + e);

		}

	}



	
	
}
