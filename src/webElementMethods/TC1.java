package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		WebElement text= driver.findElement(By.xpath("//h1[contains(text(),'App')]"));
		
		String actualResult=text.getText();
		
		System.out.println("Actual result is "+actualResult);
		
		String expectedResult="India's Most-loved Payments App";
		
		if(actualResult.equals(expectedResult))
		{
			System.out.println("Result is Matching,TC is passed");
		}
		else
		{
		    System.out.println("Result is not Matching,TC is failed");	
		}
		
		
		
		
		
		
		
		

	}

}
