package screenShot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg2 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);
			
			File source= ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String s= RandomString.make(3);
			File dest=new File("C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Screenshot2.png");
			
			FileHandler.copy(source,destination);
			
			
	}

} 
