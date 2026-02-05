package org.automation.modularFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStaleElementReference {
	
	public static void main(String[] args) throws InterruptedException {
		//TODO:Understand the stale element reference using page object module
		/*
		 * Here We have locate the element passwordTB and then refresh the page
		 * and after that we are accessing that same passwordTB; but as the page is refreshed we
		 * are getting the exception
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		emailTB	.sendKeys("chitraher@yahoo.com");
		Thread.sleep(500);
		
		WebElement passwordTB =driver.findElement(By.id("Password"));
		
		//To refresh the Webpage
		driver.navigate().refresh();
		
		//Because old address is used ,we get "staleElementReferenceException"
		passwordTB.sendKeys("aherChitra@1");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();

	}

}
