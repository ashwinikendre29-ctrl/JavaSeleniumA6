package org.automation.modularFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_BuyProduct_003_Test extends BaseTest
{
 @Test
   public void buyProductMethod() throws EncryptedDocumentException, IOException
   {
	   
	   BasePage bp = new BasePage(driver);
		bp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		CellPhonePage cpp = new CellPhonePage(driver);
		cpp.getCellPhoneAddToCartButton().click();
		
		SoftAssert  sa= new SoftAssert();
		sa.assertEquals(cpp.getProductAddedToCartMsg().isDisplayed(), true ,"product is not added to the cart");
		
		bp.getShoppingCartLink().click();
		
		ShoppingCartPage scp =new ShoppingCartPage(driver);
		scp.getSmartPhoneCartItem().click();
		scp.getTermsOfServicesCheckbox().click();
		scp.getCheckoutButton().click();
		   
		String city = Flib.getWorkbookCellValue("buyproducts", 1, 0);
		String address1 = Flib.getWorkbookCellValue("buyproducts", 1, 1);
		//String pincode = Flib.getWorkbookCellValue("buyproducts", 1, 2);
		//String contact = Flib.getWorkbookCellValue("buyproducts", 1, 3);
		String pincode = Flib.getNumericCellValueMethod("buyproducts", 1, 2);
		String contact = Flib.getNumericCellValueMethod("buyproducts", 1, 3);
		
		int rn = Flib.generateRandomNo();
		String phoneNO = contact+rn;
		
		CheckoutPage cop = new CheckoutPage(driver);
		cop.buyProduct(city, address1, pincode, phoneNO);
		
		CompletedPage comp = new CompletedPage(driver);
		sa.assertEquals(comp.getOrderPlacedMsg().isDisplayed(), true,"Order is not processed ||");
		
		sa.assertAll();
   }
}
