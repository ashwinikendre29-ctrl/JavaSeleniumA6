package org.automation.Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
	@Test
	public void loginMethod() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//we put one space at the end of the both title in order to get error and get the error message
		//using softAssert class
		
		driver.get("https://demowebshop.tricentis.com/");
		String expectedWelcomePageTitle="Demo Web Shop";
		String expectedLoginPageTitle="Demo Web Shop.Login";
		
		SoftAssert sa = new SoftAssert();
        sa.assertEquals(driver.getTitle(),expectedWelcomePageTitle,"Welcome page is not displayed!!!");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(500);
		sa.assertEquals(driver.getTitle(),expectedLoginPageTitle,"Login page is not displayed!!!");
		
		driver.findElement(By.id("Email")).sendKeys("chitraher@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("aherChitra@1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//This method we need to include at the end of the program
		sa.assertAll();
		
		driver.quit();

	}

}
