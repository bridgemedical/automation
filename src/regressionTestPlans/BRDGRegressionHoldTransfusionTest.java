package regressionTestPlans;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsidePatientMainMenuFunctions;
import com.pageObject.Functions.CapribedsideSelectPatientFunctions;
import com.pageObject.Functions.CapribedsideStartTransfusionFunctions;
import com.pageObject.Functions.SystemManagerEditRoleFunctions;
import com.pageObject.Functions.SystemManagerMainPageFunction;
import com.pageObject.Functions.SystemManagerRolesFunctions;

public class BRDGRegressionHoldTransfusionTest {
	// SystemManagerLoginPageFunctions systemManager = new
	// SystemManagerLoginPageFunctions(Constants.systemManagerUrl);
	SystemManagerMainPageFunction systemManagerMainMenu = new SystemManagerMainPageFunction();
	SystemManagerRolesFunctions rolesFunctions = new SystemManagerRolesFunctions();
	SystemManagerEditRoleFunctions editRoleFunctions = new SystemManagerEditRoleFunctions();
	CommonFunctions commonFunctions = new CommonFunctions();
	SeleniumFunctions sleniumFunctions = new SeleniumFunctions();
	// CapribedsideSelectPatientFunctions selectPatientFunctions = new
	// CapribedsideSelectPatientFunctions();
	String unitNumber = commonFunctions.currentDate(Constants.dateFormatForUnitNumber, 0);
	String bloodProdExpiryDate = commonFunctions.currentDate(Constants.regularDateFormat, 4);

	@BeforeTest
	public void systemManagerSettingsTest() throws InterruptedException {

		/*
		 * systemManager.adminLogin(); systemManagerMainMenu.clickRolesButton();
		 * rolesFunctions.clickEditSystemAdminitserLink();
		 * editRoleFunctions.checkMayStartTransfusionWithoutCosignatureCheckbox(
		 * ); editRoleFunctions.clickConfirmButton();
		 * rolesFunctions.clickEditTransfusionistLink(); editRoleFunctions.
		 * uncheckMayStartTransfusionWithoutCosignatureCheckbox();
		 * editRoleFunctions.checkMayStartTransfusionWithCosignatureCheckbox();
		 * editRoleFunctions.clickConfirmButton(); IEDriver.ieDriver.quit();
		 */
		// IEDriver.ieDriver.quit();

	}

	@Test
	public void holdTransfusionTest() throws InterruptedException {
		// IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
		IEDriver.iEDriver(Constants.capribedsideUrl);
		CapribedsideLoginFunctions capribedsideLogin = new CapribedsideLoginFunctions();
		// IEDriver.iEDriver(Constants.capribedsideUrl);
		// Step ------"Login to Capribedside as User1 scan patient A, Start
		// Transfusion,BrowseTransfusion and View Reaction Information Buttons
		// are active"-----Step 1
		capribedsideLogin.adminLogin();
		// systemManager.adminLogin();
		CapribedsideSelectPatientFunctions selectPatientFunctions = new CapribedsideSelectPatientFunctions();
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		Thread.sleep(2000);
		CapribedsidePatientMainMenuFunctions patientMainMenu = new CapribedsidePatientMainMenuFunctions();
		patientMainMenu.verifyStartTransfusionButtonDisplay();
		patientMainMenu.verifyBrowseTransfusionHistoryButtonDisplay();
		patientMainMenu.verifyViewReactionInformationButtonDisplay();

		// Step 2----"Start a Transfusion, Chack Date,Time tag below Start
		// Transfusion Butto.Active End Transfusion Buttoun should be
		// active"-----Step 2
		patientMainMenu.clickStartTransfusionButton();
		CapribedsideStartTransfusionFunctions startTransfusionFunctions = new CapribedsideStartTransfusionFunctions();
		startTransfusionFunctions.enterRecipientPatientIDTextbox(Constants.idPateintA);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterRecipientPatientName(Constants.namePateintA);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterRecipientUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.selectRecipientBloodType(Constants.bloodTypeOpos);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.clickRecipientContinueButton();
		startTransfusionFunctions.selectDonorCenterCode(Constants.donorCenterCode);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterDonorUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.selectDonorBloodProduct(Constants.bloodProductPD1);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterDonorBloodProductExpirationDate(bloodProdExpiryDate);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.selectDonorBloodType(Constants.bloodTypeOpos);
		sleniumFunctions.pressEnter();
		//startTransfusionFunctions.clickDonorContinueButton();
		commonFunctions.recordVitals();
		startTransfusionFunctions.checkOriginalTransOrderCheckBox();
		startTransfusionFunctions.enterSecondOrderVerification(Constants.secondOrderVerificationBy);
		startTransfusionFunctions.checkSignedConsentCheckBox();
		startTransfusionFunctions.clickChecksContinueButton();
		startTransfusionFunctions.clickStartButtonStartTransfusionPage();
		startTransfusionFunctions.clickCancelButtonPrintReportPage();
		
		IEDriver.ieDriver.quit();

		System.out.println("Test Plan is running");
	}

	@AfterTest
	public void afterTest() {
		IEDriver.ieDriver.quit();

	}
}
