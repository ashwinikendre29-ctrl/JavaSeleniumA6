package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Puneeth
{
	@Test(groups = "Sandalwood")
	public void launchPuneeth()
	{
		Reporter.log("Launching Puneeth page",true);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Puneeth_Rajkumar");
}
}
