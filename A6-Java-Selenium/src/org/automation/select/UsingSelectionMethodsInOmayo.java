package org.automation.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectionMethodsInOmayo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		WebElement dropDownElement = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropDownElement);
		//selecting an option based on tag text or visibleText
		select.selectByVisibleText("doc 3");
		Thread.sleep(2000);
		//selecting an option based on value
		select.selectByValue("def");
        Thread.sleep(2000);
        //selecting an option based on index
        select.selectByIndex(4);
	}

}
