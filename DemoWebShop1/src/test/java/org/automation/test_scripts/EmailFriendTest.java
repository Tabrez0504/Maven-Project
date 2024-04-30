package org.automation.test_scripts;

import java.io.IOException;

import org.automation.element_repository.BooksPage;
import org.automation.element_repository.EmailAFriendPage;
import org.automation.element_repository.FictionFXPage;
import org.automation.generic_library.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmailFriendTest extends BaseTest{
	@Test
	public void verify_User_Is_Able_To_Email_Product_To_A_Friend() throws IOException
	{
		home_page.getBooksLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books", "Books page not displayed"); 
		Reporter.log("Books Page Displayed", true);

		BooksPage books_Page = new BooksPage (driver);
        books_Page.getFictionFX().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Fiction EX", "Fiction Ex Product Page not Displayed");
		Reporter.log("Fiction Ex Product Page Displayed", true);

		FictionFXPage product_Page = new FictionFXPage(driver);
		product_Page.getEmailFriendButton().click();
		
		EmailAFriendPage email_Page = new EmailAFriendPage(driver);
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Email A Friend. Fiction EX", "Email A Friend Page not Displayed");
		Reporter.log("Email A Friend Page Displayed", true);
		
		email_Page.getMailFriendTextField().sendKeys(data.getDataFromPropertiesFile("email"));
		
		email_Page.getSendMailButton().click();
		
		Assert.assertEquals(email_Page.getResultText().getText(), "Your message has been sent.", "verify_User_Is_Able_To_Email_Product_To_A_Friend is Failed...");
		Reporter.log("verify_User_Is_Able_To_Email_Product_To_A_Friend is Passed...", true);
		

        
    
	}

}
