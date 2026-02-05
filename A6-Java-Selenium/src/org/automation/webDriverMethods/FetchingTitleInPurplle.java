package org.automation.webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingTitleInPurplle {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.purplle.com/");
		String title=driver.getTitle();
		System.out.println(title);

	}

}
