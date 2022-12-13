package upStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import screenShot.Scrolling;

public class ValidateUserNameAndFundsUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		//read data from excel
		File myfile = new File("C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\ExcelFile\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		String un = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		//login to application
		//sending userID
		driver.findElement(By.name("userId")).sendKeys(un);
		
		//sending password
		driver.findElement(By.name("password")).sendKeys(mySheet.getRow(0).getCell(1).getStringCellValue());
		
		//click on sign in button
		driver.findElement(By.id("submit-btn")).click();
		
		//nevigating to passcode page
		Thread.sleep(1000);
		driver.findElement(By.id("yob")).sendKeys(mySheet.getRow(0).getCell(2).getStringCellValue());
		
		//click on cancel trip(no I am good)
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='No I'm good]")).click();
		
		//navigating to Home page
		Thread.sleep(1000);
		
		//validate UserName
		String expectedUIN = "Kunal A";
		WebElement userNameField = driver.findElement(By.xpath("//span[@class='hfiuwhfiuh'])[2]"));
		
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
