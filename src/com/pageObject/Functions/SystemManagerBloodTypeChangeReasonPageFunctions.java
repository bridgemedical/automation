package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import com.bridge.utilities.IEDriver;
import com.pageobjects.SystemManagerBloodTypeChangeReasonPage;


/*
 * Yet to implement explicit wait
 * 
*/



public class SystemManagerBloodTypeChangeReasonPageFunctions 
{

	SystemManagerBloodTypeChangeReasonPage bloodtypechangepage = PageFactory.initElements(IEDriver.ieDriver, SystemManagerBloodTypeChangeReasonPage.class );
	
	//Method to create Reason for blood type change.
	public void createReasonForBloodTypeChange(String code,String name,String description) 
	{		
		try{
		bloodtypechangepage.textboxCodeCreateReason.sendKeys(code);
		Thread.sleep(2000);
		bloodtypechangepage.textboxNameCreateReason.sendKeys(name);
		Thread.sleep(2000);
		bloodtypechangepage.textboxDescriptionCreateReason.sendKeys(description);
		Thread.sleep(2000);
		bloodtypechangepage.buttonConfirmCreateReason.click();
		}
		catch(Exception e)
		{
			System.out.println("can't create reason for blood type change reason \n"+ e );
		}
	}	
}
