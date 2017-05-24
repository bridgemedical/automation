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
			printFormulaLabel.selectFortifierButton.click();
		} catch (Exception e) {
			System.out.println("Failed to click on fortifier button : "+e);
		}
	}

	public void clickFirstFortifiercheckbox()
	{
		seleniumFunctions.waitForElement(printFormulaLabel.firstFortifiercheckbox);
		printFormulaLabel.firstFortifiercheckbox.click();
	}
		
	public void selectFirstFortifierExpDate()
	{
		seleniumFunctions.waitForElement(printFormulaLabel.firstFortExpTextBox);
		printFormulaLabel.firstFortExpTextBox.click();
		seleniumFunctions.waitForElement(printFormulaLabel.firstFortDateSelectorPopup);
		printFormulaLabel.firstFortExpDateSelection.click();
		assert(printFormulaLabel.firstFortExpTextBox.getText()!=null);
	}
	
	public void clickSecondFortifiercheckbox()
	{
		seleniumFunctions.waitForElement(printFormulaLabel.secondFortifiercheckbox);
		printFormulaLabel.firstFortifiercheckbox.click();
	}
	
	public void writeSecondFortifierLotTextbox(String lotNumber)
	{
		seleniumFunctions.waitForElement(printFormulaLabel.SecondFortLottextbox);
		printFormulaLabel.SecondFortLottextbox.sendKeys(lotNumber);
	}
	

	public void clickThirdFortifierCheckbox()
	{
		seleniumFunctions.waitForElement(printFormulaLabel.thirdFortifierCheckbox);
		printFormulaLabel.thirdFortifierCheckbox.click();
	}
	
	public void selectThirdFortifierExpDate()
	{
		seleniumFunctions.waitForElement(printFormulaLabel.thirdFortExpTextbox);
		printFormulaLabel.thirdFortExpTextbox.click();
		seleniumFunctions.waitForElement(printFormulaLabel.thirdFortDateSelectorPopup);
		printFormulaLabel.thirdFortExpDateSelection.click();
		assert(printFormulaLabel.thirdFortExpDateSelection.getText()!=null);
	}
	
	
}
