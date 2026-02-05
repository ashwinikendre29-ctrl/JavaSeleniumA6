package org.automation.locatorStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfProductInAmazon {

	public static void main(String[] args)
   {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise Earbuds");
		driver.findElement(By.id("nav-search-submit-button")).click();
		 WebElement priceElement=driver.findElement(By.xpath
		("//span[contains(text(),'VS501') and contains(text(),'Wine')]/../../../..//span[@class='a-price-whole']"));
		//driver.findElement(By.xpath("//div[contains(@id,'cart-text')]")).click();
		
		String price=priceElement.getText();
		System.out.println("Price :"+price);

	}

	}


