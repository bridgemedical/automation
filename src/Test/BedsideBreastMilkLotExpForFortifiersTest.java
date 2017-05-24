package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
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
 
//@BeforeTest
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
	  CapribedsideLoginFunctions loginFunctions =new CapribedsideLoginFunctions();
	  CapribedsideSelectPatientFunctions selectpatiendpage = new CapribedsideSelectPatientFunctions();
	  DonorMilkMainMenuFunctions mainmenupage = new DonorMilkMainMenuFunctions();
	  DonorMilkFormulaPrintLabelsPageFunction printlabelspage = new DonorMilkFormulaPrintLabelsPageFunction();
	  
	  
	  loginFunctions.adminLogin();
		
	  selectpatiendpage.clickMilkManagementLink();
	  
	  mainmenupage.clickPrintFormulaLabelsButton();
	  System.out.println("Formula label\n");
	  
	  printlabelspage.clickSelectForifierButton();
	  System.out.println("Formula label\n");
	 
	  printlabelspage.clickFirstFortifiercheckbox();
	  System.out.println("Formula label\n");
	  printlabelspage.selectFirstFortifierExpDate();
	  System.out.println("Formula label\n");
	  
	  IEDriver.ieDriver.close();
  }
}
