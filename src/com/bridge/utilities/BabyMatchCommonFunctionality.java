package com.bridge.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.pageObject.Functions.BabyMatchSelectPatientFunctions;
import com.pageObjects.BabyMatchSelectPatientPage;
import com.pageObjects.CapribedsideBabyMatchPage;

public class BabyMatchCommonFunctionality extends IEDriver
{
	  CapribedsideBabyMatchPage babyMatchPage;
	    //String a = "635201";
	  /*
	    public void scanBabyMatchPatients(String a)  throws InterruptedException
	    {
	    	//iedriver.scanpatient("635201");
	    	babyMatchPage = PageFactory.initElements(IEDriver.driver, CapribedsideBabyMatchPage.class );
			Actions actions= new Actions(driver);
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanPatientID().sendKeys("[");
			babyMatchPage.scanPatientID().sendKeys(a);
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanPatientID().sendKeys("]");
	    }
	    public void scanBabyMatchRacipient(String b) throws InterruptedException
	    {
	    	babyMatchPage = PageFactory.initElements(IEDriver.driver, CapribedsideBabyMatchPage.class );
			Actions actions= new Actions(driver);
			
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanRacipientID().sendKeys("[");
			babyMatchPage.scanRacipientID().sendKeys(b);
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanRacipientID().sendKeys("]");
	    }
	    
	    BabyMatchSelectPatientFunctions babyMatchFunctions;
	    public void scanSelectPatientId(String a )  throws InterruptedException
	    {
	    	PageFactory.initElements(IEDriver.driver, BabyMatchSelectPatientFunctions.class );
	    	Actions actions= new Actions(driver);
			actions.keyDown(Keys.ALT).perform();
			babyMatchFunctions.enetrPatientID("["+"635201");
			//selectPatient.scanPatientID().sendKeys(a);
			actions.keyDown(Keys.ALT).perform();
			babyMatchFunctions.enetrPatientID("]");
			
	    }*/

}
