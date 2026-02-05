package org.automation.webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingWindowHandleUsingGetWindowHandle {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Set<String> WindowId=driver.getWindowHandles();
		System.out.println(WindowId);

	}

}
