package org.automation.locatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheLoginButtonUsingcssSelector {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rutwikabhatane04@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("RutwikaBhatane@123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();


	}

}
