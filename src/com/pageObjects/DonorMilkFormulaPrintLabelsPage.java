package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonorMilkFormulaPrintLabelsPage 
{
	@FindBy (xpath=".//*[@id='cmdFortifiers_uncheckedImage']") 	
	public WebElement selectFortifierButton;
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr[1]/td[1]/input") 		
	public WebElement firstFortifiercheckbox;
	
	
	@FindBy (xpath = ".//*[@id='grdPromptFortifiers']/tbody/tr/td/table/tbody/tr[2]/td[2]/span/input[1]") 		
	public WebElement firstFortExpTextBox;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/span[2]") 		
	public WebElement firstFortExpLabel;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/span/div/div") 		
	public WebElement firstFortDateSelectorPopup;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[1]/td/table/tbody/tr[3]/td[2]/span/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/div") 		
	public WebElement firstFortExpDateSelection;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[2]/td/input[1]")
	public WebElement secondFortifiercheckbox;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")
	public WebElement SecondFortLottextbox;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/span[2]")
	public WebElement secondFortLotLabel;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[3]/td/input[1]")
	public WebElement thirdFortifierCheckbox;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[3]/td/table/tbody/tr[3]/td[1]/span[2]")
	public WebElement thirdFortExpLabel;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/span/input[1]")
	public WebElement thirdFortExpTextbox;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/span/div/div")
	public WebElement thirdFortDateSelectorPopup;
	
	@FindBy (xpath = "/html/body/div/div[1]/form/div[11]/table/tbody/tr[6]/td[2]/div/div/div/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/span/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/div")
	public WebElement thirdFortExpDateSelection;
	
}
