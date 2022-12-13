package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile = new File("C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\ExcelFile\\Book1.xlsx");
		
	    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
	    
	    //Outer for loop for--> rows--> vary form--> 0--> 1
	    for(int i=0;i<=2;i++)
	    {
	    	//inner for loop--> cell--> vary from--> 0==>3
	    	for(int j=0;j<=3;j++)
	    	{
	    		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
	    		System.out.println(value+" ");
	    	}
	    	System.out.println();
	    }
		

	}

}
