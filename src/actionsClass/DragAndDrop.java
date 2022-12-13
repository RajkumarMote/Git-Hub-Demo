package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/V4/");
		Thread.sleep(1000);
		
		WebElement source= driver.findElement(By.xpath("//a[text()='5000']"));
		
		WebElement target= driver.findElement(By.id("amt8"));
		
		Actions act=new Actions(driver);
		Thread.sleep(1000);

		//old lengthy method-->
//        act.clickAndHold(source).moveToElement(target).release().build().perform();	
		act.dragAndDrop(source, target).perform();

	

	
	
	
		
	}

}
