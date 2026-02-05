 package org.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage
{
//Declaration
	@FindBy(xpath ="//a[text()='Smartphone']/../..//input[@value='Add to cart']") private WebElement cellPhoneAddToCartButton;
	@FindBy(xpath ="//p[contains(text(),'The product has been added to your')]") private WebElement productAddedToCartMsg;
	
	//Initialization
	public CellPhonePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	//Utilization
	public WebElement getCellPhoneAddToCartButton() {
		return cellPhoneAddToCartButton;
	}

	public WebElement getProductAddedToCartMsg() {
		return productAddedToCartMsg;
	}
	

	
}
