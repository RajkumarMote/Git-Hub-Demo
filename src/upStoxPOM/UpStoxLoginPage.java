package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage
{
	//Variable Declaration
	
    @FindBy(name="userId")private WebElement userID;
    
    @FindBy(name="password")private WebElement password;
    
    @FindBy(xpath ="//div[text()'Sign into UpStox']")private WebElement signInButton;
    
    //Initialize using constructor-->uses-->pageFactory class-->(method)-->initElements
    
    public UpStoxLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    //Variable Usage using method
    public void enterUserID()
    {
    	userID.sendKeys("2VB5QJ");
    }
    public void enterPassword()
    {
    	password.sendKeys("Katraj@22");
    }
    public void clickOnSignInButton()
    {
    	signInButton.click();
    }

}
