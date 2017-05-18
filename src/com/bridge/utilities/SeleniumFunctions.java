package com.bridge.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {
	Select sel;
<<<<<<< HEAD
	IEDriver iedriver = new IEDriver();
	WebDriverWait wait;
	//Explicit wait function
    public void waitForElement(String locator)
    { 
          wait = new WebDriverWait(iedriver.ieDriver, 10000);
    	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
=======
	// IEDriver iedriver = new IEDriver();
	// Explicit wait function

	// Function to select values from drop down.
	public void selectValueByVisibleText(WebElement element, String visibleText) {
		sel = new Select(element);
		sel.selectByVisibleText(visibleText);
>>>>>>> branch 'master' of https://github.com/bridgemedical/automation.git
	}
<<<<<<< HEAD
    
    public void wait(WebElement locator)
    { 
          wait = new WebDriverWait(iedriver.ieDriver, 10000);
    	  wait.until(ExpectedConditions.visibilityOf(locator));
	}
  
    //Function to select values from drop down.
	public void selectValueByVisibleText(WebElement element,String visibleText)
	{
		 sel = new Select(element);
	     sel.selectByVisibleText(visibleText);
=======

	public void selectValueByValueAttribute(WebElement element, String value) {
		// element = administerpage.dropdownBloodPlasmaDerivative();
		sel = new Select(element);
		sel.selectByValue(value);
>>>>>>> branch 'master' of https://github.com/bridgemedical/automation.git
	}

	public void waitForElement(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(IEDriver.ieDriver, 10000);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}

}
