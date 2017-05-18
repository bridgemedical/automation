package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideSelectPatientPage {

	@FindBy(id = "txtPatientId")
	public WebElement patientIdTextbox;

	@FindBy(id = "errorsLabel")
	public WebElement ErrorMsg;

	@FindBy(id = "header_cmdLogout")
	public WebElement logoutLink;

	@FindBy(id = "header_cmdDonorLink")
	public WebElement milkManagementLink;

	@FindBy(id = "header_cmdReportsLink")
	public WebElement reportsLink;

	@FindBy(id = "errorsLabel")
	public WebElement patientNotFoundErrorMessage;

	@FindBy(id = "errorsLabel")
	public WebElement expectingPatientIDErrorMessage;

}
