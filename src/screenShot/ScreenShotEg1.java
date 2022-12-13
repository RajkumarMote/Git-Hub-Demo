package screenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ScreenShotEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);
			
			//Byte b=(byte)a;
			
			File source= ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			System.out.println(source);
			
			File destination=new File("C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Screenshot1.png");
			
			FileHandler.copy(source,destination);
		

	}

}
