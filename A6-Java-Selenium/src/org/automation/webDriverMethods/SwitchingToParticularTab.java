package org.automation.webDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToParticularTab {

	public static void main(String[] args) throws InterruptedException 
	{
		String expectedUrl="https://www.fossil.com/en-in";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fossil.com/en-in");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://jokerandwitch.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.rolex.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://shop.timexindia.com");
		
		//capturing window id's or handle's of all the tabs
		Set<String> allWindowIds=driver.getWindowHandles();
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
			Thread.sleep(3000);
			String actualUrl=driver.getCurrentUrl();
			//condition to break loop and to stop switching
			
			if(expectedUrl.equals(actualUrl))
			{
				break;
			}
		}
		
		


	}

}
