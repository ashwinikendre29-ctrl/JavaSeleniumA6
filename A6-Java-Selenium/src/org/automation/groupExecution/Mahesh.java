package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mahesh 
{
	@Test(groups ="Tollywood")
	public void launchMahesh()
	{
		Reporter.log("Launching Mahesh Babu page",true);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Mahesh_Babu");
}
}
