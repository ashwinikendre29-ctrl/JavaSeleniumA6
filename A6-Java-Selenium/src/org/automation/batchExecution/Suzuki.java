package org.automation.batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Suzuki
{
	@Test
	public void launchingHayabusa()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bikewale.com/suzuki-bikes/hayabusa/");
		Reporter.log("Launched Hayabusa",true);
	}

}
