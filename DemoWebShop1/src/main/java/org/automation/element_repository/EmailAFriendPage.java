package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailAFriendPage {

	@FindBy(xpath = "//input[@class='friend-email']")
	private WebElement mailFriendTextField;
	
	@FindBy(xpath = "//input[@class='button-1 send-email-a-friend-button']")
	private WebElement sendMailButton;
	
	@FindBy(xpath = "//div[@class='result']")
	private WebElement resultText;
	
	public EmailAFriendPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getMailFriendTextField() {
		return mailFriendTextField;
	}

	public WebElement getSendMailButton() {
		return sendMailButton;
	}
	
	public WebElement getResultText() {
		return resultText;
	}

	
}
