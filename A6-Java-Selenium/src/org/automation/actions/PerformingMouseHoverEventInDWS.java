package org.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingMouseHoverEventInDWS
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement electronicslink = driver.findElement(By.partialLinkText("ELECTRONICS"));
		Actions action = new Actions(driver);
		action.moveToElement(electronicslink).perform();
		//action.moveToLocation(437, 192).perform();
		action.moveByOffset(360-510,191-191).perform();


}
}