package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUpStox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//create an object of POM class
		
		UpStoxLoginPage login = new UpStoxLoginPage(driver);
		//loging in
		login.enterUserID();
		login.enterPassword();
		login.clickOnSignInButton();
	}

}
