package org.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickAndHoldInReleaseEvent {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL%203400/Downloads/DragDrop.html");
		Actions actions=new Actions(driver);
		WebElement capital = driver.findElement(By.xpath("//div[text()='Washington']"));
		WebElement country = driver.findElement(By.xpath("//div[text()='United States']"));
		actions.clickAndHold(country).release(country).perform();
		actions.moveToElement(capital).clickAndHold()
		.moveToElement(country).release().perform();

	}

}
