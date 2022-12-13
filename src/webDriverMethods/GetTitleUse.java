package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleUse {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		System.out.println(driver.getTitle());
		
		String myTitle = driver.getTitle();
		
		System.out.println(driver.getCurrentUrl());
		
		String myUrl = driver.getCurrentUrl();
		
		System.out.println("My url is "+myUrl);
		
		
		
		

	}

}
