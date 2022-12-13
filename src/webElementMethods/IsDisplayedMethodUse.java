package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement textBox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		WebElement hideButton=driver.findElement(By.id("hide-textbox"));
		WebElement showButton=driver.findElement(By.id("show-textbox"));
		
		//hideButton.click();
		
		if(textBox.isDisplayed())
		{
			textBox.sendKeys("Good Morning");
		}
		else
		{
			showButton.click();
			textBox.sendKeys("Good Evening");
	    }
		
		
	
		
		
		

	}

}
