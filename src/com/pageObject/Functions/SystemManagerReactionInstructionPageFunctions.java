package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerReactionInstructionPage;

public class SystemManagerReactionInstructionPageFunctions
{
	SystemManagerReactionInstructionPage reactioninstrpage = PageFactory.initElements(IEDriver.ieDriver, SystemManagerReactionInstructionPage.class );
			
	public void createReactionInstruction(String reactionName,String description) throws Throwable
	{
		reactioninstrpage.linkCreateReactionInstruction.click();
		Thread.sleep(2000);
		reactioninstrpage.textBoxNameOfReactionInstruction.sendKeys(reactionName);
		Thread.sleep(2000);
		reactioninstrpage.textBoxDescriptionReactionInstruction.sendKeys(description);
		Thread.sleep(2000);
		reactioninstrpage.submitReactionInstruction.click();
	}

}
