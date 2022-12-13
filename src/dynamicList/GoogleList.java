package dynamicList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleList {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.Google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Honda");
		Thread.sleep(1000);
		
		List<WebElement> Result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println(Result.size());
		
		for(WebElement a:Result )
		{
			System.out.println(a.getText());
			String expected="honda amaze";
			String actual=a.getText();
			if(expected.equals(actual))
			{
				a.click();
				break;
			}
		}
		
		
		

		
		

	}

}
