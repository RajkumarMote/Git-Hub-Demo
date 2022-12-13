package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		 List<WebElement> data = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th[1]"));
		 for(WebElement d:data)
		 {
			 System.out.println(d.getText());
		 }
		for(int i=1;i<=3;i++)
		{
			WebElement data1 = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th["+i+"]"));	
			System.out.print(data1.getText()+" ");
	
		}
		

	}

}
