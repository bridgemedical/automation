package com.bridge.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions 
{
	Select sel;
	IEDriver iedriver = new IEDriver();
	//Explicit wait function
    public void waitForElement(String Locator)
    { 
          WebDriverWait wait = new WebDriverWait(iedriver.driver, 10000);
    	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Locator)));
	}
    
    
    //Function to select values from drop down.
	public void selectValueByVisibleText(WebElement element,String visibleText)
	{
		 sel = new Select(element);
	     sel.selectByVisibleText(visibleText);
	}
	
	public void selectValueByValueAttribute(WebElement element,String value)
	{
    	//element = administerpage.dropdownBloodPlasmaDerivative();
    	sel = new Select(element);
    	sel.selectByValue(value);
	}
	

}
