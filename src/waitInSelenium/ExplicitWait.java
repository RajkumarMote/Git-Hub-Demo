package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.discoveryplus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//explicit wait 1-->parameter-->time, 2-->parameter-->condition
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(4000));
		WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='sign In'][2])"));
		w.until(ExpectedConditions.visibilityOf(signInButton));
		signInButton.click();
		

	}

}
