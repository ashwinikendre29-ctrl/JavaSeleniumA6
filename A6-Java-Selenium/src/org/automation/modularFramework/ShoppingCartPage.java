package org.automation.modularFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ShoppingCartPage
{
	@FindBy(xpath="//a[text()='Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartPhoneCartItem;
	
	@FindBy(name="updatecart") private WebElement updateCartButton;
	@FindBy(name="continueshopping") private WebElement continueShoppingButton;
	@FindBy(id="termsofservice") private WebElement termsOfServicesCheckbox;
	@FindBy(id="checkout") private WebElement checkoutButton;
	
	//Initialization
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Utilization


	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}

	public WebElement getTermsOfServicesCheckbox() {
		return termsOfServicesCheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	//Opertional Method/Business Logic
	public void removeSmartPhoneMethod()
	{
		smartPhoneCartItem.click();
		//Thread.sleep(500);
		updateCartButton.click();
		
			}
	

	

}
