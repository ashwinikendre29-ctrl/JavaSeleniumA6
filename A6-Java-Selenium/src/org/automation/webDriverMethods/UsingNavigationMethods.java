package org.automation.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethods {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.get("https://www.zeptonow.com/");
		Thread.sleep(2000);
		//to navigate back to filpkart
		driver.navigate().back();
		Thread.sleep(2000);
		//to navigate forward to zepto
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
