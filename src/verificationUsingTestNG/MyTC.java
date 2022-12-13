package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTC 
{
  @Test
  public void verifyCheckBox() 
  {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html"); 
		
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		
		if(checkBox1.isSelected())
		{
			Reporter.log("CheckBox is selected TC is PASSED", true);
		}
		
		else
		{
			Reporter.log("CheckBox is not selected TC is FAILED", true);
		}
		
		checkBox1.click();
		Assert.assertTrue(checkBox1.isSelected(),"CheckBox is not selected TC is failed");
  }
}
