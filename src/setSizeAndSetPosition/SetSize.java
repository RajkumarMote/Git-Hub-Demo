package setSizeAndSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
	   Dimension defaultSize = driver.manage().window().getSize();
	   
	   System.out.println("defaultSize is "+defaultSize);
	   
	   //To set the size we need to use Dimension class
	   //Create object of Dimension class and pass width and height
	   
	   Dimension d = new Dimension(190,900);
	   
	   //Now set the size
	   //use setSize method and pass Dimension class object as parameter
	   Thread.sleep(1000);
	   driver.manage().window().setSize(d);
	   Thread.sleep(1000);
	   
	   Dimension d1 = new Dimension(1900,100);
	   driver.manage().window().setSize(d1);
	}

}
