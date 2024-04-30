package org.automation.test_scripts;

import org.automation.element_repository.ApparelPage;
import org.automation.element_repository.CartPage;
import org.automation.element_repository.SneakerPage;
import org.automation.element_repository.WishlistPage;
import org.automation.generic_library.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SneakerTest extends BaseTest{
	
	@Test
	public void verify_User_Is_Able_To_Move_Product_from_Wishlist_To_Cart() 
	{
	
		home_page.getApparelLink().click();
		
		ApparelPage arl_Page = new ApparelPage(driver);
		
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes", "Apparel & Shoes page not displayed"); 
		Reporter.log("Apparel & Shoes Page Displayed", true);
		
		arl_Page.getBlueSneakerLink().click();
		
	    SneakerPage snk_Page = new SneakerPage(driver);
	    
	    Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Blue and green Sneaker", "Blue and green Sneaker page not displayed"); 
		Reporter.log("Blue and green Sneaker Page Displayed", true);
		
		snk_Page.getAddWishlistButton().click();
		
		home_page.getWishListLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist", "Wish List Page not Displayed");
		Reporter.log("Wish List Page Displayed", true);

		WishlistPage wishList_Page = new WishlistPage(driver);
		
		wishList_Page.getAddToCart().click();
		wishList_Page.getAddToCartButton().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Shopping Cart", "Shopping Cart Page not Displayed");
		Reporter.log("Shopping Cart Page Displayed", true);
		
		CartPage crt_Page = new CartPage(driver);
		
		Assert.assertEquals(crt_Page.getBlueSneakerProduct().getText(), "Blue and green Sneaker", "verify_User_Is_Able_To_Move_Product_from_Wishlist_To_Cart is Failed...");
		Reporter.log("verify_User_Is_Able_To_Move_Product_from_Wishlist_To_Cart is Passed...", true);
		
		
		
	    
	}

}
