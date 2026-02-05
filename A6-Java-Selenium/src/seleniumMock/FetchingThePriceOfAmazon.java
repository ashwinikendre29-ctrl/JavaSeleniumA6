package seleniumMock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FetchingThePriceOfAmazon
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement priceElement = driver.findElement(By.xpath("//span[contains(text(),'iPhone 17 Pro Max Silver')]/../../../..//span[@class='a-price-whole']"));
		String price=priceElement.getText();
		System.out.println("Price :"+price);
	

		

	}

}
