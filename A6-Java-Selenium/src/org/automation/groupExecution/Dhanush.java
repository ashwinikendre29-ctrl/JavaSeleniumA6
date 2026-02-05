package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dhanush
{
	@Test(groups = {"Tamil","Bollywood"})
	public void launchAlluArjun()
	{
		Reporter.log("Launching Dhanush page",true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Dhanush");
}

}
