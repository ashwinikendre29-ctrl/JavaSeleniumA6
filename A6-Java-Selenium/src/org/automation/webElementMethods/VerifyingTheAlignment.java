package org.automation.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingTheAlignment {

	public static void main(String[] args)
	{
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://facebook.com/");
	 WebElement emailTextBox = driver.findElement(By.id("email"));
	 WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
	 
	 //fetching the size and location of both elements
	Dimension emailTBSize = emailTextBox.getSize();
	Dimension passwordTBSize = passwordTextBox.getSize();
	Point emailTBLoc = emailTextBox.getLocation();
	Point passwordTBLoc = passwordTextBox.getLocation();
	
	//verifying left alignment
	if(emailTBLoc.getX() == passwordTBLoc.getX())
		System.out.println("left alignment is proper");
	else
		System.out.println("left alignment is improper");
	
	//verifying right alignment
	if(emailTBLoc.getX()+emailTBSize.getWidth() == 
			passwordTBLoc.getX()+passwordTBSize.getWidth())
		System.out.println("right alignment is proper");
	else
		System.out.println("right alignment is improper");
	
	//verifying the overlapping issue
	if(passwordTBLoc.getY() - (emailTBLoc.getY()+emailTBSize.getHeight()) > 0)
		System.out.println("elements are not overlapped");
	else
		System.out.println("elements are overlapped");


	
	
	
	


		

		

	}

}
