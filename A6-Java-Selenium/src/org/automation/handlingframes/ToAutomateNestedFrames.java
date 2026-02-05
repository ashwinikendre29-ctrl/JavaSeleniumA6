package org.automation.handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateNestedFrames {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes");
		
		//switching to the parent frame from main page
		driver.switchTo().frame("frame1");
		String text1 = driver.findElement(By.tagName("body")).getText();
		System.out.println(text1);
		
		//switching to the child frame from parent frame
		driver.switchTo().frame(0);
		String text2 = driver.findElement(By.tagName("p")).getText();
		System.out.println(text2);
		
		//switching to the parent frame from child frame
		driver.switchTo().parentFrame();
		String text3 = driver.findElement(By.tagName("body")).getText();
		System.out.println(text3);
		
		//switching  back to the main page
		driver.switchTo().defaultContent();

		
		
		

	}

}
