package org.automation.popupHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPopup {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		//fetching parent window id
		String parentWindowID = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		
		driver.findElement(By.partialLinkText("Forgot Username ")).click();
		//fetching all the window ids
		Set<String> allWindowIds = driver.getWindowHandles();
		//removing parent window id from all window ids,
		//so only child window id will be available in the set.
		allWindowIds.remove(parentWindowID);
		for(String childWindowID : allWindowIds)
		{
			driver.switchTo().window(childWindowID);
		}
		driver.findElement(By.id("nextStep")).click();

		
		

	}

}
