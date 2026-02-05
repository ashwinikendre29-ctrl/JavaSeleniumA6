package org.automation.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SwitchingControlToAnActiveElement {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("KGF Chapter 2");

	}

}
