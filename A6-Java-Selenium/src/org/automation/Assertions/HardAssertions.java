package org.automation.Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test
	public void validLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		String expectedTitle="Demo Web Shop";
		String expectedLoginPageTitle="Demo Web Shop.Login";
		
		Assert.assertEquals(driver.getTitle(),expectedTitle,"Welcome page is not displayed!!!");
		
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle(),expectedLoginPageTitle,"Login page is not displayed!!!");
		
		driver.findElement(By.id("Email")).sendKeys("chitraher@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("aherChitra@1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();

		
	}

}
