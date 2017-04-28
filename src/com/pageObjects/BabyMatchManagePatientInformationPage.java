package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class BabyMatchManagePatientInformationPage extends IEDriver
{
	
	
	//Link to update mother details
	@FindBy ( id = "editMother")			
	public WebElement editMotherLink;
	public WebElement getEditMotherLink() 
	{
		return editMotherLink;
	}
	
	//Correct Mother Name field
	@FindBy ( id = "txtCorrectMother_Name")	
	public WebElement correctMotherNameTextBox;
	public WebElement correctMotherNameTextBox() 
	{
		return correctMotherNameTextBox;
	}
	
	//Correct Mother ID field
	@FindBy ( id = "txtCorrectMother_ID")	
	public WebElement correctMotherIDTextBox;
	public WebElement correctMotherIDTextBox() 
	{
		return correctMotherIDTextBox;
	}

	//Confirm button
	@FindBy ( id = "cmdOK")					
	public WebElement confirmButton;
	public WebElement confirmButton() 
	{
		return confirmButton;
	}
	
	//Exit button
	@FindBy ( id = "cmdCancel")				
	public WebElement exitButton;
	public WebElement exitButton() 
	{
		return exitButton;
	}
	

}
