package regressiontests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsideSelectPatientFunctions;
import com.pageObject.Functions.DonorMilkFormulaPrintLabelsPageFunction;
import com.pageObject.Functions.DonorMilkMainMenuFunctions;
import com.pageObject.Functions.SystemManagerBreastMilkFortifierSettingsPageFunction;
import com.pageObject.Functions.SystemManagerBreastMilkSettingsPageFunctions;
import com.pageObject.Functions.SystemManagerLoginPageFunctions;
import com.pageObject.Functions.SystemManagerMainPageFunction;


public class BedsideBreastMilkLotExpForFortifiersTest {
	
 
@BeforeTest
 public void setup()
 {
	 SystemManagerLoginPageFunctions systemManager = new SystemManagerLoginPageFunctions(Constants.systemManagerUrl);
	 SystemManagerMainPageFunction mainMenu = new SystemManagerMainPageFunction();
	 SystemManagerBreastMilkSettingsPageFunctions breastmilkSettings = new SystemManagerBreastMilkSettingsPageFunctions();
	 SystemManagerBreastMilkFortifierSettingsPageFunction fortifierSettings = new SystemManagerBreastMilkFortifierSettingsPageFunction();
	 
	 systemManager.adminLogin();
	 mainMenu.clickBreastMilkSettings();
	 breastmilkSettings.clickFortifierSettingsLink();
	 
	 fortifierSettings.clickEditFirstFortifier();
	 fortifierSettings.editFortifier("No","Yes","All","Yes");
	 
	 fortifierSettings.clickEditSecondFortifier();
	 fortifierSettings.editFortifier("Yes","No","All","Yes");
	 
	 fortifierSettings.clickEditThirdFortifier();
	 fortifierSettings.editFortifier("Yes","Yes","All","Yes");
	 
	 IEDriver.ieDriver.close();
	 }
	
	
	
@Test
  public void test() 
  {
	System.out.println("Test ");
	CapribedsideLoginFunctions loginFunctions =new CapribedsideLoginFunctions();
	  CapribedsideSelectPatientFunctions selectpatiendpage = new CapribedsideSelectPatientFunctions();
	  DonorMilkMainMenuFunctions mainmenupage = new DonorMilkMainMenuFunctions();
	  DonorMilkFormulaPrintLabelsPageFunction printlabelspage = new DonorMilkFormulaPrintLabelsPageFunction();
	  String lotNumber="10";
	  
	  loginFunctions.adminLogin();	
	  selectpatiendpage.clickMilkManagementLink();
	  mainmenupage.clickPrintFormulaLabelsButton();
	  printlabelspage.clickSelectForifierButton();
	  
	  printlabelspage.clickFirstFortifiercheckbox();
	  printlabelspage.selectFirstFortifierExpDate();
	  printlabelspage.clickFirstFortifiercheckbox();
	  
	  printlabelspage.clickSecondFortifiercheckbox();
	  printlabelspage.writeSecondFortifierLotTextbox(lotNumber);
	  printlabelspage.clickSecondFortifiercheckbox();
	  
	  printlabelspage.clickThirdFortifierCheckbox();
	  printlabelspage.selectThirdFortifierExpDate();
	  printlabelspage.writeThirdFortifierLotTextbox(lotNumber);
	  printlabelspage.clickThirdFortifierCheckbox();
	  System.out.println("Test ");
	 IEDriver.ieDriver.close();
  }
}
