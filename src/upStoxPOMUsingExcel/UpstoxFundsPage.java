package upStoxPOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxFundsPage
{
	@FindBy(xpath="((//div[@class='idgadicahcnhc'])[1]//div)[3]") private WebElement availableFunds;
	
	public UpstoxFundsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void checkFunds()
	{
		String myFunds = availableFunds.getText();
		
		System.out.println("Funds available to trade is "+myFunds);
	}
    
}
