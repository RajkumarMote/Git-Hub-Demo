package screenShot1;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotEg1 {
	static WebDriver driver;
	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mercedesindia.in");
		
		}
	public static void takeScreenshot(String fileName, Object FileUtils) 
	{
		//1. Take screenshot and store it as a file format:
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	
		//2. now copy the screenshot to desired location using location copyfile method:
	    FileUtils).copyFile(file, new File("C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\Screenshots"+fileName+".jpg"));
		
	}

}
