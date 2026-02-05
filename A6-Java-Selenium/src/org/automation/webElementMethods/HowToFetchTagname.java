package org.automation.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToFetchTagname {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement image = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	    WebElement TextData = driver.findElement(By.xpath("//h2"));
		
		String iconName = image.getTagName();
        System.out.println(iconName);
      
		String text = TextData.getText();
		System.out.println(text);

	}

}
