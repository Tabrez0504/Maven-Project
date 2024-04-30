package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SneakerPage {

	@FindBy(id = "add-to-wishlist-button-28")
	private WebElement addWishlistButton;
	
	public SneakerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddWishlistButton() {
		return addWishlistButton;
	}

}
