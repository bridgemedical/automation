package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerPointsOfCarePage extends IEDriver
{
	@FindBy (id = "dlPoc__ctl13_editLink") 			public WebElement editPocPeds;
	@FindBy (id = "dlPoc__ctl10_editLink") 			public WebElement editPocGenMed;
	@FindBy (id = "listSearch_txtSearchList") 		public WebElement txt_box_SearchPOC;
	@FindBy (id = "listSearch_imgSearchList") 		public WebElement button_Searchbutton;
	@FindBy (id = "cmdCreate") 						public WebElement buttonCreate;
	@FindBy (id = "cmdOK") 							public WebElement buttonSubmit;
	@FindBy (id = "dlPoc__ctl13_editLink") 			public WebElement linkEditPeds;
	
}
