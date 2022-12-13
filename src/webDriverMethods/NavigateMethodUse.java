package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Rajkumar\\Downloads\\chromedriver_win32.zip");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.phonepe.com/");
		
		Thread.sleep(1100);
		
		driver.navigate().back();
		
		Thread.sleep(1100);
		
		driver.navigate().forward();
		
		Thread.sleep(1100);
		
		driver.navigate().refresh();
		

	}

}
