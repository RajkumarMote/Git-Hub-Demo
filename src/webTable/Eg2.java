package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Eg2 {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement data = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th[1]"));
		
		System.out.println(data.getText());
		
		System.out.println("==================================================");
		
//To read header Row-->th??
		for(int i=1;i<=3;i++)
		{
			WebElement data1 = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th["+i+"]"));
			System.out.println(data1.getText()+" ");
		}
		
//To read Row4-->
		System.out.println();
		for(int i=1;i<=3;i++)
		{
		  System.out.println(driver.findElement(By.xpath("//table[@id='product']//tr[4]/td["+i+"]")).getText()+" ");	
		}
		
		System.out.println("====================================================");
		
			
			
		}
	}


