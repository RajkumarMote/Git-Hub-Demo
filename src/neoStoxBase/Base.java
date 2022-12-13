package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class Base 
{
	protected WebDriver driver;
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","");
		driver = new ChromeDriver();
		driver.get("https://neostox.com/sign-up");
		driver.manage().window().maximize();
		Reporter.log("Launching browser"true);
		Utility.wait(driver,1000);
	}
	public static void closingBrowser(WebDriver driver) throws InterruptedException
	{
		Reporter.log("closing browser",true);
		Thread.sleep(500);
		driver.close();
	}
	
		
	

}
