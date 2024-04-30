package org.automation.test_scripts;

import java.io.IOException;

import org.automation.generic_library.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SubcribeTest extends BaseTest{

	@Test
	public void verify_User_Is_Able_To_Subcribe() throws IOException
	{
		home_page.getSubcribeText().sendKeys(data.getDataFromPropertiesFile("email"));
		
		home_page.getSubcribeButton().click();
		

		String actRes = home_page.getNewResult().getText();
		
		String expRes = home_page.getNewResult().getText();
		
		Assert.assertEquals (actRes, expRes, "verify_User_Is_Able_To_Subcribe is Failed...");
		Reporter.log("verify_User_Is_Able_To_Subcribe is Pass...", true);

	}
}
