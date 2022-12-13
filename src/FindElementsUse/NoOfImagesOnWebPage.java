package FindElementsUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NoOfImagesOnWebPage {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		Actions act=new Actions(driver);
		act.sendKeys("IPhone 14").sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		
		List<WebElement> Images = driver.findElements(By.tagName("img"));
		System.out.println(Images.size());

	}

}
