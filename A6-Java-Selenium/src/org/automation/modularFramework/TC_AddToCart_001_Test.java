package org.automation.modularFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_AddToCart_001_Test extends BaseTest
{
 @Test
 public void addToCartMethod()
 {
	    BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		CellPhonePage cpp = new CellPhonePage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert  sa= new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(),true,"product is not added to the cart");
		sa.assertAll();
		

 }
}
