package org.automation.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSendKeysToPerformLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox= driver.switchTo().activeElement();
		//emailTextBox.sendKeys("admin02@gmail.com",Keys.TAB,"Admin02",Keys.ENTER);
        emailTextBox.sendKeys("admin02@gmail.com");
        emailTextBox.sendKeys(Keys.CONTROL+"a");
        emailTextBox.sendKeys(Keys.CONTROL+"x");
        emailTextBox.sendKeys(Keys.TAB,Keys.CONTROL+"v");
	

}
}
