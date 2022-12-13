package setSizeAndSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		Point defaultPosition = driver.manage().window().getPosition();
		
		System.out.println("Default Position "+defaultPosition);
		
		//Create an object of point class and pass x and y coordinates
		Point p = new Point(190,10);
		
		//Set the position by using setPosition method and pass Point class object as a parameter
		Thread.sleep(1000);
		
		driver.manage().window().setPosition(p);
		

	}

}
