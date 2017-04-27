package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerBloodProductSubstitutionChartPage extends IEDriver
{
	@FindBy (id = "dlItems__ctl6_editLink") 	public WebElement editCryoprecipitates;
	@FindBy (id = "cmdOK") 						public WebElement saveCreateBloodProductSubstitutionChart;
	
}
