package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click(); //After clicking on this button we will get Alert
		
		//1. To handle alert pop up we need to switch selenium focus from main page to alert pop up by using syntax
		//Alert alt= driver.switchTo().alert();
		
		Alert alt= driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		
		Thread.sleep(2000);
		String myText= driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		
		System.out.println(myText);

	}

}
