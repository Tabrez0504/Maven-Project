package org.automation.test_scripts;

import org.automation.element_repository.ApparelPage;
import org.automation.element_repository.CartPage;
import org.automation.element_repository.SneakerPage;
import org.automation.element_repository.WishlistPage;
import org.automation.generic_library.BaseTest;
import org.automation.generic_library.UtilityMethods;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class SneakerTest extends BaseTest{
	
	@Test
	public void verify_User_Is_Able_To_Move_Product_from_Wishlist_To_Cart() 
	{
	
		home_page.getApparelLink().click();
		
		ApparelPage arl_Page = new ApparelPage(driver);
		
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes", "Apparel & Shoes page not displayed"); 
		Reporter.log("Apparel & Shoes Page Displayed", true);
		test.log(Status.INFO, "Apparel & Shoes Page Displayed");

		
		arl_Page.getBlueSneakerLink().click();
		
	    SneakerPage snk_Page = new SneakerPage(driver);
	    
	    Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Blue and green Sneaker", "Blue and green Sneaker page not displayed"); 
		Reporter.log("Blue and green Sneaker Page Displayed", true);
		test.log(Status.INFO, "Blue and green Sneaker Page Displayed");

		
		snk_Page.getAddWishlistButton().click();
		
		home_page.getWishListLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist", "Wish List Page not Displayed");
		Reporter.log("Wish List Page Displayed", true);
		test.log(Status.INFO, "Wish List Page Displayed");


		WishlistPage wishList_Page = new WishlistPage(driver);
		
		wishList_Page.getAddToCart().click();
		wishList_Page.getAddToCartButton().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart", "Shopping Cart Page not Displayed");
		Reporter.log("Shopping Cart Page Displayed", true);
		test.log(Status.INFO, "Shopping Cart Page Displayed");

		
		CartPage crt_Page = new CartPage(driver);
		
		Assert.assertEquals(crt_Page.getBlueSneakerProduct().getText(), "Blue and green Sneaker", "verify_User_Is_Able_To_Move_Product_from_Wishlist_To_Cart is Failed...");
		Reporter.log("verify_User_Is_Able_To_Move_Product_from_Wishlist_To_Cart is Passed...", true);
		test.addScreenCaptureFromPath(UtilityMethods.takeScreenshot(driver),"verify_User_Is_Able_To_Move_Product_from_Wishlist_To_Cart is Passed...");

		
		
		
	    
	}

}
