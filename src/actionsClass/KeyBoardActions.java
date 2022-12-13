package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'][2]")).click();
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Actions act=new Actions(driver);
		
		WebElement firstname= driver.findElement(By.name("firstname"));
		
		//act.moveToElement(firstname).sendKeys("Rajkuamr").build().perform();
		
		act.moveToElement(firstname).keyDown(Keys.SHIFT).sendKeys("R").keyUp(Keys.SHIFT).sendKeys("ajkumar").build().perform();
		Thread.sleep(500);
	    act.click(month).perform();
	    
//		Thread.sleep(500);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(500);
//		act.sendKeys(Keys.ENTER).perform();
	    
	    for(int i=0;i<=7;i++)
	    {
	    	act.sendKeys(Keys.ARROW_UP).perform();
	    	Thread.sleep(100);
	    }
	    act.sendKeys(Keys.ENTER).perform();
	  
	}

}
