package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile = new File("C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\ExcelFile\\Book1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		int LastRowNum = mySheet.getLastRowNum();
		System.out.println("Last Row Number is "+LastRowNum);
		
		int totalNumOfRows = LastRowNum;
		System.out.println("Total Number of Rows are "+totalNumOfRows);
		
		short LastCellNum = mySheet.getRow(0).getLastCellNum();
		System.out.println("Total Cells are "+LastCellNum);
		
	//	totalNumOfCell = 
		
		
		
		
		

	}

}
