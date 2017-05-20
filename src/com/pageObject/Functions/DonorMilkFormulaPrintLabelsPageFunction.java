package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.DonorMilkFormulaPrintLabelsPage;

public class DonorMilkFormulaPrintLabelsPageFunction 
{
	DonorMilkFormulaPrintLabelsPage printFormulaLabel = PageFactory.initElements(IEDriver.ieDriver, DonorMilkFormulaPrintLabelsPage.class);
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	
	public void clickSelectForifierButton()
	{
	 try {
			seleniumFunctions.waitForElement(printFormulaLabel.selectFortifierButton);
			printFormulaLabel.firstFortifiercheckbox.click();
		} catch (Exception e) {
			System.out.println("Cannot select First Fortifier button"+e);
		}
	}
	
}
