package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ixigo.com/");
		//driver.manage().window();
		
	    JavascriptExecutor	js=(JavascriptExecutor)driver;
	    Thread.sleep(2000);
	    
	    js.executeAsyncScript("window.scrollBy(40,800)");
	    Thread.sleep(2000);
	    
	    js.executeAsyncScript("window.scrollBy(-40,800)");
	    Thread.sleep(2000);
	    
	    js.executeAsyncScript("window.scrollBy(+90,-190)");
	    
	    
	    
	    
		
		

	}

}
