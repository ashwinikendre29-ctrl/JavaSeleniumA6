package org.automation.testNGFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage
{
	@FindBy(xpath="//a[text()'Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartPhoneCartItem;

}
