package Test;

import org.testng.annotations.Test;

import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObjects.CapribedsideLoginPage;

public class LaunchBridgeMedicalTest {
	//String Url = "http://10.162.106.174/TransSpec2017010102/CapriBedside/Login.aspx";
	CapribedsideLoginFunctions loginFunctions;
	CapribedsideLoginPage login = new CapribedsideLoginPage();
  @Test
  public void bridgeMedicalLoginTest() throws InterruptedException 
  {
	   loginFunctions =new CapribedsideLoginFunctions();
		loginFunctions.enterUserName("Superuser");
		loginFunctions.enterPassword("123");
		loginFunctions.clickLoginButton();
		Thread.sleep(1000);
  }
}
