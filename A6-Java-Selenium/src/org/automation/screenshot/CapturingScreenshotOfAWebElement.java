package org.automation.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfAWebElement {

	public static void main(String[] args) throws IOException
	{
		LocalDateTime ldt=LocalDateTime.now();
		String timestamp =ldt.toString().replace(':', '-');

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cricket bat for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
	    WebElement product=driver.findElement(By.xpath
		("//span[contains(text(),' Willow Kooka_burra Cricket Bat ')]/../../../../.."));
        
	    //step1
	    File src =product.getScreenshotAs(OutputType.FILE);
	    //step2
	    File dest=new File("./Errorshots/scrrenshot" +timestamp+ ".png");
	    FileHandler.copy(src, dest);
	}

}
