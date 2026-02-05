package org.automation.groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash
{
	@Test(groups = {"Sandalwood","PanIndia"})
	public void launchYash()
	{
		Reporter.log("Launching Yash page",true);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Yash_(actor)");
}

}
