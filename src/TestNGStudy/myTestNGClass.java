package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myTestNGClass {
  @Test
  public void googleTest()
  {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		
  }
  @Test
     public void flipkartTest()
   {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
 		
 		WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.flipkart.com/");
   }
}

