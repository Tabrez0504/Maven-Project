package org.automation.element_repository;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(name = "removefromcart")
	private List<WebElement> removeFromCart;
	
	@FindBy(name = "updatecart")
	private WebElement updateCart;
	
	@FindBy(name = "continueshopping")
	private WebElement continueShopping;
	
	@FindBy(xpath = "(//a[@href='/blue-and-green-sneaker'])[3]")
	private WebElement blueSneakerProduct;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getRemoveFromCart() {
		return removeFromCart;
	}

	

	public WebElement getUpdateCart() {
		return updateCart;
	}



	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getBlueSneakerProduct() {
		return blueSneakerProduct;
	}
	
	
	

}
