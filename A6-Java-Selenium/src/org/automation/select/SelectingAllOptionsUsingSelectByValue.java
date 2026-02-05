package org.automation.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingAllOptionsUsingSelectByValue 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg");
	WebElement yearDropDown = driver.findElement(By.id("year"));
	Select select=new Select(yearDropDown);
	
	//fetching all the options of the year dropdown
	List<WebElement> allOptions = select.getOptions();
	
	//selecting all the options 1 by 1 using selectByValue() in loop
	for(WebElement option : allOptions )
	{
		Thread.sleep(500);
		String value = option.getAttribute("value");
		select.selectByValue(value);
	}

}
	
}