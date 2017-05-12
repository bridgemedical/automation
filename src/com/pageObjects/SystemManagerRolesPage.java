package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerRolesPage 
{
	@FindBy (id = "dlRoles__ctl15_editLink") 	public WebElement editRapidStartOnly;
	@FindBy (id = "dlRoles__ctl19_editLink") 	public WebElement editStudentTransfusionist;
	@FindBy (id = "dlRoles__ctl20_editLink") 	public WebElement editSystemAdminister;
	@FindBy (id = "dlRoles__ctl21_editLink") 	public WebElement editTransfusionSupervisor;
	@FindBy (id = "dlRoles__ctl22_editLink") 	public WebElement editTransfusionist;
	@FindBy (id = "header_cmdLogout") 			public WebElement linkLogout;
	

}
