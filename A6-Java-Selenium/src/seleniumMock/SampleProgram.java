package seleniumMock;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleProgram
{
 public static void main(String[] args) 
 {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://www.stayvista.com/");
	 
	driver.findElement(By.xpath("//span[text()='Our Brands']")).click();
	driver.findElement(By.xpath("//img[@alt='Uber Luxury']")).click();
	
}
}
