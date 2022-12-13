package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//1. Identify list box to be handled and store it in reference variable
		WebElement dropDown=driver.findElement(By.name("dropdown-class-example"));
		
		//2. Create an object of select class which will accept WebElements as argument
		Select s= new Select(dropDown);
		
		//3. By using one of the select class methods we can select values from list box like
//		     1.selectByVisibleText:selectByVisibleText(String arg0)
//           2.selectByIndex:selectByIndex(int arg0)
//	         3.selectByValue:selectByValue(String arg0)
		
		//1.selectByVisibleText
		s.selectByVisibleText("Option3");
		
		//2.selectByIndex
		Thread.sleep(1000);
		s.selectByIndex(0); 
		
		//3.selectByValue
		Thread.sleep(1000);
		s.selectByValue("option1"); 
		

	}

}
