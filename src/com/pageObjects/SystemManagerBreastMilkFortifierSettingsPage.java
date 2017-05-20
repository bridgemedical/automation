package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerBreastMilkFortifierSettingsPage 
{

	@FindBy (xpath = ".//*[@id='dlItems']/tbody/tr[2]/td[3]") 		public WebElement labelFirstFortifierName;
	@FindBy (xpath = ".//*[@id='dlItems']/tbody/tr[3]/td[3]") 		public WebElement labelSecondFortifierName;
	@FindBy (xpath = ".//*[@id='dlItems']/tbody/tr[4]/td[3]") 		public WebElement labelThirdFortifierName;
	@FindBy (id = "dlItems__ctl2_editLink") 						public WebElement editFirstFortifierlink;
	@FindBy (id = "dlItems__ctl3_editLink") 						public WebElement editSecondFortifierlink;
	@FindBy (id = "dlItems__ctl4_editLink") 						public WebElement editThirdFortifierlink;

	//Edit Fortifier Page
	@FindBy (id = "lstExtra") 		public WebElement selectPromptForLot;
	@FindBy (id = "lstExtra2") 		public WebElement selectPromptForExpiration;
	@FindBy (id = "lstExtra") 		public WebElement selectPromptForLot1SA;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
