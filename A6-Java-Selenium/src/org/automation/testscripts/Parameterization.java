package org.automation.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
  @Parameters("bname")
  @Test
  public void launchingAndNavigate(@Optional("chrome") String browsweName)
  {
	  WebDriver driver = null;
	  if(browsweName.equalsIgnoreCase("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  else if(browsweName.equalsIgnoreCase("edge"))
	  {
		  driver = new EdgeDriver();
	  }
	  else if(browsweName.equalsIgnoreCase("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");;
  }
}
