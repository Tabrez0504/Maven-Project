package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id ="Email")
	private WebElement emailtextfield;
	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEmailTextField()
	{
		return emailtextfield;
	}
	
	public WebElement getPasswordTxtField()
	{
		return passwordtextfield;
	}
	
	public WebElement getLoginButton()
	{
		return loginbutton;
	}
}
