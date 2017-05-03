package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class SystemManagerMainPage extends IEDriver
{
	@FindBy (id = "PointsOfCare_cmdButton") 	public WebElement buttonPointsOfCare;
	@FindBy (id = "Users_cmdButton") 			public WebElement buttonUsers;
	@FindBy (id = "Roles_cmdButton") 			public WebElement buttonRoles;
	@FindBy (id = "Maintenance_cmdButton") 		public WebElement buttonSystemMaintenance;
	@FindBy (id = "ScheduleDowntime_cmdButton") public WebElement button_ScheduleDowntime;
	@FindBy (id = "userLogin_cmdButton") 		public WebElement buttonLoginSettings;
	@FindBy (id = "general_cmdButton") 			public WebElement buttonGeneralcmd;
	@FindBy (id = "specimen_cmdButton") 		public WebElement buttonSpecimenSettings;
	@FindBy (id = "transfusion_cmdButton") 		public WebElement buttonTransfusionSettings;
	@FindBy (id = "breastMilk_cmdButton") 		public WebElement buttonBreastMilkSettings;
	@FindBy (id = "babymatch_cmdButton") 		public WebElement buttonBabyMatchSettings;
	@FindBy (id = "printerBarcode_cmdButton") 	public WebElement buttonPrinterBarcodeSettings;
	@FindBy (id = "SystemInterface_cmdButton") 	public WebElement buttonInterfaceSettings;
	@FindBy (id = "reports_cmdButton") 			public WebElement buttonReportSettings;
	@FindBy (id = "header_cmdLogout") 			public WebElement linkLogout;
	@FindBy (id = "header_cmdHelp") 			public WebElement linkHelp;
	
}
