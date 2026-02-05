package org.automation.modularFramework;

import org.automation.testNGFramework.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_RemoveProductFromCart_002_Test extends BaseTest
{
	@Test
	public void removeProductFromCartMethod()
	{
		BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		CellPhonePage cpp = new CellPhonePage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert  sa= new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(),true,"product is not added to the cart");
		//sa.assertAll();
		
		bp.getShoppingCartLink().click();
		
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.removeSmartPhoneMethod();
		
		try
		{
			if(scp.getSmartPhoneCartItem().isDisplayed())
			{
				
			Reporter.log("Product is not remove from cart",true);
			}
		}
		catch(Exception e)
		{
			Reporter.log("Product is  remove from cart",true);

		}
		//sa.assertAll();	
	}

}
