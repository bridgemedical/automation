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
	WebDriverWait wait;
	//Explicit wait function
    public void waitForElement(String locator)
    { 
          wait = new WebDriverWait(iedriver.ieDriver, 10000);
    	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
	}
    
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
	}
	
	public void selectValueByValueAttribute(WebElement element,String value)
	{
    	//element = administerpage.dropdownBloodPlasmaDerivative();
    	sel = new Select(element);
    	sel.selectByValue(value);
	}
	

}
