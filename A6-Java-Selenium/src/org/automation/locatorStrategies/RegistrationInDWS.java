package org.automation.locatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationInDWS {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Rutwika");
		driver.findElement(By.id("LastName")).sendKeys("Bhatane");
		driver.findElement(By.id("Email")).sendKeys("rutwikabhatane04@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("RutwikaBhatane@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("RutwikaBhatane@123");
		driver.findElement(By.id("register-button")).click();
		
		
}
}
