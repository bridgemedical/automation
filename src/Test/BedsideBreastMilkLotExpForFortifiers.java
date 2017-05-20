package Test;

import org.testng.annotations.Test;

import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsideSelectPatientFunctions;
import com.pageObject.Functions.DonorMilkFormulaPrintLabelsPageFunction;
import com.pageObject.Functions.DonorMilkMainMenuFunctions;


public class BedsideBreastMilkLotExpForFortifiers {
  @Test
  public void f() 
  {
	  CapribedsideLoginFunctions loginFunctions =new CapribedsideLoginFunctions();
	  CapribedsideSelectPatientFunctions selectpatiendpage = new CapribedsideSelectPatientFunctions();
	  DonorMilkMainMenuFunctions mainmenupage = new DonorMilkMainMenuFunctions();
	  DonorMilkFormulaPrintLabelsPageFunction printlabelspage = new DonorMilkFormulaPrintLabelsPageFunction();
	  
	  loginFunctions.enterUserName("Superuser");
	  loginFunctions.enterPassword("123");
	  loginFunctions.clickLoginButton();
		
	  selectpatiendpage.clickMilkManagementLink();
	  
	  mainmenupage.clickPrintFormulaLabelsButton();
	  
	  printlabelspage.clickSelectForifierButton();
	  
  }
}
