package org.automation.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDatasFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	//FileInputStream is to read something from file
		
		FileInputStream fis = new FileInputStream("./TestData/DWS.xlsx");
		//create method will help to make the file ready for reading
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		int rowCount= sheet.getPhysicalNumberOfRows()-1;
		System.out.println("Number of rows:"+rowCount);
		int columnCount = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println("Number of columns:"+columnCount);
		
		String [] [] creds = new String [rowCount][columnCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<columnCount;j++)
			{
				creds[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
       for(String []arr:creds)
       {
    	   for(String data:arr)
    	   {
    		   System.out.println(data+" ,");
    	   }
    	   System.out.println();
       }

	}

}
