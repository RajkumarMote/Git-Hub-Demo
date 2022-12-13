package upStox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserNameAndFunds {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//login to application
		//sending userID
		driver.findElement(By.name("userID")).sendKeys("2VB5QJ");
		
		//sending password
		driver.findElement(By.name("password")).sendKeys("Velocity@22");
		
		//click on sign In Button
		driver.findElement(By.id("yob")).sendKeys("1997");
		
		//click on cancel trip(no I am good)
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='No,I'm good']")).click();
		
		//nevigating to Home page
		Thread.sleep(1000);
		
		//validate UserName
		String expectedUN="Kunal A";
		
        WebElement userNameField = driver.findElement(By.xpath("(//span[@class='fiuwhfwhfoh'])[2]"));
        
        //scrolling into view
        Thread.sleep(500);
        // JavascriptExecutor js = (JavascriptExecutor).driver;
        //js.executeScript("arguments[0].scrollingIntoView(true)",userNameField);
        
		//calling common scrolling method
        Scrolling.scrollIntoView(driver,userNameField);
        Thread.sleep(1000);
        
        String actualUN = userNameField.getText();
        if(expectedUN.equals(actualUN))
        {
        	System.out.println("Actual and Expected UserNames are matching,TC passed");
        }
        else
        {
        	System.out.println("Actual and Expected UserName are not matching,TC Failed");
        }
        
        //validate funds
        //clicking on funds button
        driver.findElement(By.id("funds")).click();
        Thread.sleep(500);
        String funds = driver.findElement(By.xpath("(//div[@class='fgwgfiwb'][1]//div)[3])")).getText();
        System.out.println("Funds Available to Trade is "+funds);
   	}

}
