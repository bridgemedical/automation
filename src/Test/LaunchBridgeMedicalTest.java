package Test;

import org.testng.annotations.Test;


import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObjects.CapribedsideLoginPage;

public class LaunchBridgeMedicalTest {
	String Url = "http://10.162.106.174/TransSpec2017010102/CapriBedside/Login.aspx";
	CapribedsideLoginFunctions loginFunctions;// = new CapribedsideLoginFunctions(iedriver);
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	//IEDriver ieDriver = new IEDriver();
	
  @Test
  public void bridgeMedicalLoginTest() throws InterruptedException 
  {
	  loginFunctions =new CapribedsideLoginFunctions();
	  //ieDriver.iEDriver(Url);
	 // iedriver.c("http://10.162.106.174/TransSpec2017010102/CapriBedside/Login.aspx");
	  Thread.sleep(2000);
	  
		loginFunctions.enterUserName("Superuser");
		loginFunctions.enterPassword("123");
		loginFunctions.clickLoginButton();
		Thread.sleep(1000);
		//ieDriver.close();
		
	  /*
	  login.userName.sendKeys("Superuser");
	  login.password.sendKeys("123");
	  login.loginButton.click();
	  */
  }
}
