package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class CapribedsideAdministerBottlesPage extends IEDriver {

	// private static WebElement element = null;

	@FindBy(id = "txtBottleNumber")
	public WebElement bottleNumberTextBox;

	public WebElement getbottleNumberTextBox() {
		return bottleNumberTextBox;
	}

	@FindBy(id = "txtVolume")
	public WebElement volumeTextBox;

	public WebElement getVolumeTextBox() {
		return volumeTextBox;
	}

	@FindBy(id = "divModalErrorConfirm")
	public WebElement warningPopup;

	public WebElement warningPopup() {
		return warningPopup;
	}

	@FindBy(id = "modalErrorConfirm_cmdButton1")
	public WebElement warningPopupYesButton;

	public WebElement warningPopupYesButton() {
		return warningPopupYesButton;
	}

	@FindBy(id = "modalErrorConfirm_cmdCancel")
	public WebElement warningPopupNoButton;

	public WebElement warningPopupNoButton() {
		return warningPopupNoButton;
	}

	@FindBy(id = "errorLabel")
	public WebElement donorBottleErrorMessage;

	public WebElement donorBottleErrorMessage() {
		return donorBottleErrorMessage;
	}

	@FindBy(id = "cmdConfirm")
	public WebElement confirmButton;

	public WebElement confirmButton() {
		return confirmButton;
	}

	@FindBy(id = "cmdConfirm")
	public WebElement exitButton;

	public WebElement exitButton() {
		return exitButton;
	}

	@FindBy(id = "errorLabel")
	public WebElement bottleConnotBeAdministerForThisPatientErrorMsg;

	public WebElement bottleConnotBeAdministerForThisPatientErrorMsg() {
		return bottleConnotBeAdministerForThisPatientErrorMsg;
	}

	// Hazards

	@FindBy(id = "errorLabel")
	public WebElement bottleNotReceivedErrorMessage;

	public WebElement bottleNotReceivedErrorMessage() {
		return bottleNotReceivedErrorMessage;
	}

	private static String warningPop = ".//span[text()='Warning:']";

	public static String getWarningPop() {
		return warningPop;
	}

}
