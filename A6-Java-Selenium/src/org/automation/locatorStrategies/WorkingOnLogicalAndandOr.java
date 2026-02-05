package org.automation.locatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnLogicalAndandOr {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL%203400/Downloads/XpathLogicalAnd.html");
		//locating element using xpath by logical or
		WebElement firstNameTextBox =
		 driver.findElement(By.xpath("//input[@id='f-name' or @name='first']"));
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys("Ashwini");
		//locating element using xpath by logical and
		WebElement maleRadioButton =
			driver.findElement(By.xpath("//input[@value='M' and @name='gender']"));
		maleRadioButton.click();

	}

}
