package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelPage {

	@FindBy(partialLinkText = "Blue and")
	private WebElement blueSneakerLink;


public ApparelPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getBlueSneakerLink() {
	return blueSneakerLink;
}




} 