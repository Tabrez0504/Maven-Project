package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(className="ico-register")
	private WebElement registerLink;
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishListLink;
	
	@FindBy(xpath = "//a[@href='/books']")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitalDownloadLink;
	
	@FindBy(xpath = "(//a[@href='/apparel-shoes'])[1]")
	private WebElement apparelLink;
	
	@FindBy(id = "newsletter-email")
	private WebElement subcribeText;
	
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement subcribeButton;
	
	@FindBy(xpath = "//div[@id='newsletter-result-block']")
	private WebElement newResult;
	
	@FindBy(xpath = "//a[@class='account']")
	private WebElement myAccountButton;
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRegisterLink()
	{
		return registerLink;
	}
	
	public WebElement getLoginLink() {
		return loginLink;
	}



	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public WebElement getApparelLink() {
		return apparelLink;
	}

	

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	

	public WebElement getWishListLink() {
		return wishListLink;
	}

	

	public WebElement getBooksLink() {
		return booksLink;
	}

	

	public WebElement getDigitalDownloadLink() {
		return digitalDownloadLink;
	}
	
	public WebElement getSubcribeText() {
		return subcribeText;
	}
	
	public WebElement getSubcribeButton() {
		return subcribeButton;
	}

	public WebElement getNewResult() {
		return newResult;
	}
	
	public WebElement getMyAccountButton() {
		return myAccountButton;
	}
	

	
	
	
	
}
