package softAsserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest 
{
  @Test
  public void firefox() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Rajkumar\\Downloads\\chromedriver_win32 (1)\\geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://paytm.com/");
  }
}
