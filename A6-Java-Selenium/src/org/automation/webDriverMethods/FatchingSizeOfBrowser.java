package org.automation.webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FatchingSizeOfBrowser {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://shariefbhai.com/ ");
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Height:"+size.getHeight());
		System.out.println("Width:"+size.getWidth());
		
		//new size
		Dimension targetSize=new Dimension(650,650);
		driver.manage().window().setSize(targetSize);

	}

}
