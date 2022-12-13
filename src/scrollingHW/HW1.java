package scrollingHW;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HW1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Dimension size = driver.manage().window().getSize();
		System.out.println("Size of page is "+size);
		Thread.sleep(500);
		Actions act = new Actions(driver);
		
		WebElement input = driver.findElement(By.id("displayed-text"));
		Thread.sleep(500);
		
		act.scrollToElement(input).click(input).sendKeys("Diwali").build().perform();
		Thread.sleep(1000);
		
        act.scrollByAmount(200, 400).perform();
		

	}

}
