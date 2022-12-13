package popUp;

import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VctcPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		Thread.sleep(1000);
		
		Set<String>pgid = driver.getWindowHandles();
		System.out.println("ID of all Tabs "+pgid);  //printing all ID
		
		Iterator<String> it = pgid.iterator();
		String mtid = it.next();
		System.out.println("1st Tab ID is "+mtid);
		
		String ctid = it.next();
		System.out.println("2nd Tab ID is "+ctid);
		
		driver.switchTo().window(ctid);	//switched focus from 1st Tab to 2nd Tab
		driver.findElement(By.id("checkBoxOption1")); //Performing action on 2nd Tab
		//Select s= new Select(checkBoxOption1);
		
		//driver.switchTo().window(pgid);
		
		
		

		

	}

}
