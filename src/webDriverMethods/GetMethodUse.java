package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodUse {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); //created object of chromedriver
		
		//1. get-to enter url in browser opened an application.
		
		driver.get("https://paytm.com/");
		
		//2. close: to close the current tab of the browser opened by Selenium tool.
		    
		      // driver.close();
		
		//3. quit: to close all the present in browser opened by Selenium tool.
		
		     // driver.quit();
		
		//4. maximize/minimize()- used to maximize/minimize the browser.
		

	}

}
