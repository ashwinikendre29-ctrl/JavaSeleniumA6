
package org.automation.popupHandling;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingDynamicXpath {

	public static void main(String[] args)
	{
	  LocalDateTime ldt = LocalDateTime.now();
	  int date = ldt.getDayOfMonth();
	  String monthtemp = ldt.getMonth().toString();
	  String month = monthtemp.charAt(0)+monthtemp.substring(1).toLowerCase();
	 // System.out.println("//div[text()='"+month+"']/../..//span[text()='"+date+"']");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://www.redbus.com/");
	  driver.findElement(By.id("date-box")).click();
	  driver.findElement(By.xpath("//div[text()='"+month+"']/../..//span[text()='"+date+"']")).click();
	  
	  

	}

}

