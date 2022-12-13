package neoStoxUtility;

import java.io.File;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	        //commonly used Methods
			//excel reading,screenshot,wait,scrolling

	public static String readDataFromExcel(int row, int cell)
	{
		File myFile = new File("");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		
		Reporter.log("Entering data from excel", true);
		
		return value;
	}
	public static void takeScreenshot(WebDriver driver,String fileName)
	{
		File src =((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileHandler.copy(src, dest);
		Reporter.log("taking screenshot", true);
	}
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = new (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("waiting for","waittime+milis",true);
	}
	

}
