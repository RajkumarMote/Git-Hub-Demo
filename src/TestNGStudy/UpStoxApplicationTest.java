package TestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class UpStoxApplicationTest 
{
  @Test
  public void validateUserName()
  {
	Reporter.log("User Name is validated", true);  
  }
  
  @BeforeMethod
  public void loginToUpstoxApp()
  {
	  Reporter.log("Enter UN,Enter PWD,Enter Passcode and Login To application", true);  
  }
  
  @AfterMethod
  public void logOutFromUpstoxApp() 
  {
	  Reporter.log("Click on LogOut,Logged out", true);  
  }
  
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Launch browser and enter URL", true);
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Close browser", true);  
  }

}
