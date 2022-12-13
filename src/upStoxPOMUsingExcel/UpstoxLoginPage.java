package upStoxPOMUsingExcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage 
{
	//variable declaration
	@FindBys(name="userId") private WebElement userID;
	
	@FindBy(name="password") private WebElement password;
	
	@FindBy(xpath="//div[text()='Sign into upstox']") private WebElement signInButton;
	
	//variable initialization
	public UpStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//variable usage
	public void sendUserName(String un)
	{
		userID.sendKeys(un);
	}
	public void sendPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
}
