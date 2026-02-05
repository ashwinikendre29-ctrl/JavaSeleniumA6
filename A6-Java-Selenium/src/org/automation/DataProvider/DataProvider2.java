package org.automation.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 
{
	@DataProvider(name="invalidcreds")
	public String [] [] invalidLogincreds() throws EncryptedDocumentException, IOException
	{
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
		return creds;
	}
	
 @Test(dataProvider="invalidcreds",dataProviderClass=org.automation.DataProvider.DataProvider2.class)
 public void invalidLogin(String email,String password) throws InterruptedException
 {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.close();

	 
	 
 }

}
