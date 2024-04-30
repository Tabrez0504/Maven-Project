package org.automation.test_scripts;

import org.automation.element_repository.BooksPage;
import org.automation.element_repository.FictionFXPage;
import org.automation.element_repository.WishlistPage;
import org.automation.generic_library.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Book02Test extends BaseTest{

	@Test
	public void verify_User_Is_Able_To_Remove_Product_From_Wishlist()
	{
		home_page.getBooksLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page not displayed"); 
		Reporter.log("Books Page Displayed", true);

		BooksPage books_Page = new BooksPage (driver);
        String actProductName=books_Page.getFictionFX().getText(); 
        books_Page.getFictionFX().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Fiction EX", "Fiction Ex Product Page not Displayed");
		Reporter.log("Fiction Ex Product Page Displayed", true);

		FictionFXPage product_Page = new FictionFXPage(driver);
		product_Page.getAddToWishlist().click();

		home_page.getWishListLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist", "Wish List Page not Displayed");
		Reporter.log("Wish List Page Displayed", true);
		
		driver.navigate().refresh();

		WishlistPage wishList_Page = new WishlistPage(driver);
		

		String expProductName=wishList_Page.getFictionFXProduct().getText();
		
	

		Assert.assertEquals (actProductName, expProductName, "Fiction Ex Book Is Not Displayed");
		Reporter.log("Fiction Ex Book Is Displayed", true);

		wishList_Page.getRemoveFromCart().click();

		wishList_Page.getUpdateCart().click();
		
		String actRes = wishList_Page.getEmptyPage().getText();
		
		String expRes = wishList_Page.getEmptyPage().getText();
		
		Assert.assertEquals (actRes, expRes, "verify_User_Is_Able_To_Remove_Product_From_Wishlist is Failed...");
		Reporter.log("verify_User_Is_Able_To_Remove_Product_From_Wishlist is Pass...", true);



	}

}
