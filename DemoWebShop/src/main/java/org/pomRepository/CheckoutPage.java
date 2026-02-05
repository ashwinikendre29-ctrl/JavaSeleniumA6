package org.pomRepository;

import org.genericLib.SelectUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	@FindBy(id="BillingNewAddress_CountryId") private WebElement billingAddressCountryID;
	@FindBy(id="billing-address-select") private WebElement billingAddressNewAddressCountryDD;

	@FindBy(id="BillingNewAddress_City") private WebElement cityTB;
	@FindBy(id="BillingNewAddress_Address1") private WebElement address1TB;
	@FindBy(id="BillingNewAddress_ZipPostalCode") private WebElement pincodeTB ;
	@FindBy(id="BillingNewAddress_PhoneNumber") private WebElement phoneNumberTB;
	@FindBy(xpath="//input[@onclick='Billing.save()']") 
	private WebElement billingAddressContinueButton ;
	
	@FindBy(id="shipping-address-select") private WebElement shippingAddressDD;

	@FindBy(xpath="//input[@onclick='Shipping.save()']") 
	private WebElement shippingAddressContinueButton;
	
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']") 
	private WebElement shippingMethodContinueButton;
	
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodContinueButton;
	
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfoContinueButton;
	
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderConfirmButton;
	
	//Initialization
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization

	public WebElement getBillingAddressCountryID() {
		return billingAddressCountryID;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getPhoneNumberTB() {
		return phoneNumberTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressDD() {
		return shippingAddressDD;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderConfirmButton() {
		return confirmOrderConfirmButton;
	}

	public WebElement getBillingAddressNewAddressCountryDD() {
		return billingAddressNewAddressCountryDD;
	}
	
	//Operational Method/Business Logic
	public void buyProduct(String city,String address1,String pinCode,String phoneNO)
	{
		SelectUtility su = new SelectUtility();
		try
		{
			if (billingAddressNewAddressCountryDD.isDisplayed()) 
			{
			    su.selectByVisibleTextMethod(billingAddressNewAddressCountryDD, "New Address");
			}

			
		}
		catch(Exception e)
		{
			//su.selectByVisibleTextMethod(billingAddressCountryID, "India");

		}
		su.selectByVisibleTextMethod(billingAddressCountryID, "India");

	
		cityTB.sendKeys(city);
		address1TB.clear();
		address1TB.sendKeys(address1);
		pincodeTB.clear();
		pincodeTB.sendKeys(pinCode);
		phoneNumberTB.clear();
		phoneNumberTB.sendKeys(phoneNO);
		
		
		billingAddressContinueButton.click();
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInfoContinueButton.click();
		confirmOrderConfirmButton.click();
		
	}
	
}
