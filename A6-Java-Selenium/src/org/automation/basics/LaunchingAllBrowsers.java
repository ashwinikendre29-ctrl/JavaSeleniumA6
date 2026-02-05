package org.automation.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingAllBrowsers {

	public static void main(String[] args) 
	{

       WebDriver driver;
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter the browser name that you want to launch");
       String browserName =sc.next();
       if(browserName.equalsIgnoreCase("Chrome"))
       {
    	   driver=new ChromeDriver();
       }
       else if(browserName.equalsIgnoreCase("edge"))
       {
    	   driver=new EdgeDriver();
       }
       else
       {
    	   driver=null;
    	   System.out.println("Invalid Browser");
       }
	}

}
