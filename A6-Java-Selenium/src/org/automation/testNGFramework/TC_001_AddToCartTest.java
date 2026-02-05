package org.automation.testNGFramework;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(org.automation.testNGFramework.MyListener.class)
public class TC_001_AddToCartTest extends BaseTest
{
	@Test
  public void addToCart()
  {
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		driver.findElement(By.partialLinkText("Cell phones")).click();
	  WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']"));
	addToCartButton.click();
	//Reporter.log("Product has been added to in cart",true);
	  
	 WebElement productAddedMsg = driver.findElement(By.xpath("//p[text()='The product has been added to shopping cart']"));
	 
	  if(productAddedMsg.isDisplayed())
	  
		Reporter.log("Product is added to cart ",true);
	 
	  
	  else
	  
		  Reporter.log("Product is not added to cart",true);
	  
  }
	
}
 