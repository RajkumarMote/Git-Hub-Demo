package popUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

public class VctcHw {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
		Set<String> allpageId = driver.getWindowHandles();
		
		for(String a:allpageId)
		{
			System.out.println("Id of all Page "+a);
		}
		
		Iterator<String> it = allpageId.iterator();
		String mainpage= it.next();
		String childpage = it.next();
		
		driver.switchTo().window(childpage);
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s= new Select(dropdown);
		s.selectByValue("option2");
		
		driver.close();
		
	    driver.switchTo().window(mainpage);
		
   	    driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']"));
		//Text.getText();
		
		

		
	}

}
