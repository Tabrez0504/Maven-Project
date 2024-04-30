package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	@FindBy(linkText = "Change password")
	private WebElement changePasswordLink;
	
	@FindBy(name = "OldPassword")
	private WebElement oldPasswordTextField;
	
	@FindBy(name = "NewPassword")
	private WebElement newPasswordTextField;
	
	@FindBy(name = "ConfirmNewPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(xpath = "//div[@class='result']")
	private WebElement changePasswordText;
	
	@FindBy(xpath = "//input[@class='button-1 change-password-button']")
	private WebElement changePasswordButton;
	
	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getChangePasswordLink() {
		return changePasswordLink;
	}

	public WebElement getOldPasswordTextField() {
		return oldPasswordTextField;
	}

	public WebElement getNewPasswordTextField() {
		return newPasswordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getChangePasswordText() {
		return changePasswordText;
	}

	public WebElement getChangePasswordButton() {
		return changePasswordButton;
	}

	
}
