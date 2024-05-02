package org.automation.test_scripts;

import org.automation.element_repository.BooksPage;
import org.automation.element_repository.FictionFXPage;
import org.automation.element_repository.WishlistPage;
import org.automation.element_repository.HomePage;
import org.automation.generic_library.BaseTest;
import org.automation.generic_library.UtilityMethods;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Book01Test extends BaseTest {
	
	@Test
	public void verify_User_Is_Able_To_Add_Product_To_Wishlist()
	{
		home_page.getBooksLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page not displayed"); 
		Reporter.log("Books Page Displayed", true);
		test.log(Status.INFO, "Books Page Displayed");

		BooksPage books_Page = new BooksPage (driver);
        String actProductName=books_Page.getFictionFX().getText(); 
        books_Page.getFictionFX().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Fiction EX", "Fiction Ex Product Page not Displayed");
		Reporter.log("Fiction Ex Product Page Displayed", true);
		test.log(Status.INFO, "Fiction Ex Product Page Displayed");
		
		FictionFXPage product_Page = new FictionFXPage(driver);
		product_Page.getAddToWishlist().click();

		home_page.getWishListLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist", "Wish List Page not Displayed");
		Reporter.log("Wish List Page Displayed", true);
		test.log(Status.INFO, "Wish List Page Displayed");

		driver.navigate().refresh();

		WishlistPage wishList_Page = new WishlistPage(driver);
		

		String expProductName=wishList_Page.getFictionFXProduct().getText();
		
	

		Assert.assertEquals (actProductName, expProductName, "verify_User_Is_Able_To_Add_Product_To_WishList Test Case Fail");
		Reporter.log("verify_User_Is_Able_To_Add_Product_To_WishList Test Case Pass..", true);
		test.log(Status.PASS,"verify_User_Is_Able_To_Add_Product_To_WishList Test Case Pass.." );
		test.addScreenCaptureFromPath(UtilityMethods.takeScreenshot(driver),"verify_User_Is_Able_To_Add_Product_To_WishList Test Case Pass..");
		
		wishList_Page.getRemoveFromCart().click();

		wishList_Page.getUpdateCart().click();

		}
	}


