package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage 
{
	@FindBy(xpath="(//span[@class='gggsgswvislv'])[2]") private WebElement userID;
	@FindBy(id="funds") private WebElement funds;
	@FindBy(xpath="//div[text()='Logout']") private WebElement logoutButton;
	
	public UpstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateUserID(WebDriver driver,String expID) throws InterruptedException
	{
		Thread.sleep(1000);
		
		ScrollingFunction.scrollIntoView(driver,userID);
		
		String actualUserID = userID.getText();
		
		String expectedUserID=expID;
		
		ScreenShotGeneralMethod.screnShotMethod(driver,actualUserID);
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("Actual and Expected UserID's are matching TC is Passed");
		}
		else
		{
			System.out.println("Actual and Expected UserID's are not matching TC is Failed");
		}
	}
	    public void clickOnFunds(WebDriver driver) throws InterruptedException
	    {
		Thread.sleep(1000);
		
		ScrollingFunction.scrollIntoView(driver,funds);
		
		funds.click();
		
		Thread.sleep(1000);
        }
	    public void logoutFromApplication(WebDriver driver) throws InterruptedException
	    {
	    	Thread.sleep(1000);
	    	
	    	ScrollingFunction.scrollIntoView(driver,userID);
	    	
	    	userID.click();
	    	
	    	Thread.sleep(500);
	    	
	    	logoutButton.click();
	    	
	    }
	    
	

}
