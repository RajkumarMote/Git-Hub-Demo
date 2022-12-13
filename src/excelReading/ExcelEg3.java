package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
        File myfile=new File("C:\\Users\\Rajkumar\\eclipse-workspace\\Selenium2\\ExcelFile\\Book1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		System.out.println("==========================================================");
		
		//How to read complete single row
		for(int i=0;i<=3;i++)
		{
			String myValue = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(myValue+" ");
		}
		System.out.println();
		System.out.println("==========================================================");
		
		
		//How to read complete single cell/column
		for(int i = 0;i<=1;i++)
		{
			String myValue = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(myValue+" ");
		}
		System.out.println("===========================================================");
		
	    
	    
		

	}

}
