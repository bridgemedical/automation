package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerReactionInstructionPage extends IEDriver
{
	@FindBy (id = "cmdCreate") 			public WebElement linkCreateReactionInstruction;
	@FindBy (id = "txtValue") 			public WebElement textBoxNameOfReactionInstruction;
	@FindBy (id = "txtDescription") 	public WebElement textBoxDescriptionReactionInstruction;
	@FindBy (id = "cmdOK") 				public WebElement submitReactionInstruction;
	@FindBy (id = "cmdCancel") 			public WebElement cancelCreateReactionInstruction;
		
}
