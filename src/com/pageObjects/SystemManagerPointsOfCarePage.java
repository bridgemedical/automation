package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerPointsOfCarePage 
{
	@FindBy (id = "dlPoc__ctl13_editLink") 			public WebElement editPocPeds;
	@FindBy (id = "dlPoc__ctl10_editLink") 			public WebElement editPocGenMed;
	@FindBy (id = "listSearch_txtSearchList") 		public WebElement txt_box_SearchPOC;
	@FindBy (id = "listSearch_imgSearchList") 		public WebElement button_Searchbutton;
	@FindBy (id = "cmdCreate") 						public WebElement buttonCreate;
	@FindBy (id = "cmdOK") 							public WebElement buttonSubmit;
	@FindBy (id = "dlPoc__ctl13_editLink") 			public WebElement linkEditPeds;
	
	
	public WebElement getEditPocPeds() {
		return editPocPeds;
	}
	public WebElement getEditPocGenMed() {
		return editPocGenMed;
	}
	public WebElement getTxt_box_SearchPOC() {
		return txt_box_SearchPOC;
	}
	public WebElement getButton_Searchbutton() {
		return button_Searchbutton;
	}
	public WebElement getButtonCreate() {
		return buttonCreate;
	}
	public WebElement getButtonSubmit() {
		return buttonSubmit;
	}
	public WebElement getLinkEditPeds() {
		return linkEditPeds;
	}
	
	
}
