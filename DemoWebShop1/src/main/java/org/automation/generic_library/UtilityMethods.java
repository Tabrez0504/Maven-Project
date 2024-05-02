package org.automation.generic_library;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods implements FrameworkConstant {

	public int getRandomNumnber() {
		Random r = new Random();
		return r.nextInt(4000);
	}
	
	public static String getLocaltime()
	{
		return LocalDateTime.now().toString().replace(":", "-");
	}

//	Take screenshot of entire web page
	public static String takeScreenshot(WebDriver driver)  {
		
		String filePath= screenshot_Path + getLocaltime() + ".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(filePath);
		try {
			FileHandler.copy(src, target);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return "."+filePath;
		
	}

	//	--------------------------
	// To handle Simple Alert PopUp
	public static String handleSimpleAlert(WebDriver driver) throws InterruptedException {
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String result = driver.findElement(By.id("result")).getText();
		return result;
	}
	// To handle Confirm Alert PopUp
	public static String handleConfirmAlert(WebDriver driver) throws InterruptedException {
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		String result = driver.findElement(By.id("result")).getText();
		return result;
	}
	// To handle Prompt Alert PopUp
	public static String handlePromptAlert(WebDriver driver) throws InterruptedException {
		driver.switchTo().alert().sendKeys("Hii GoodMorning");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String result = driver.findElement(By.id("result")).getText();
		return result;
	}

	// ----------------------------
	// To Handle Single Drop Down
	//	Using Index
	public static void handleDropDownUsingIndex(WebElement dropDown, int indexNum) {
		Select s = new Select(dropDown);
		s.selectByIndex(indexNum);
	}
	//	Using Value
	public static void handleSingleDropDownUsingValue(WebElement dropDown, String value) {
		Select s = new Select(dropDown);
		s.selectByValue(value);
	}
	//	Using Visible Text
	public static void handleSingleDropDownUsingText(WebElement dropDown, String text) {
		Select s = new Select(dropDown);
		s.selectByVisibleText(text);
	}

	// ---------------------------
	//	To Handle MultiSelect Drop Down
	public static void handleMultiSelectDropDown(WebElement dropDown, int i, String value, String text) throws InterruptedException {
		Select s =new Select(dropDown);
		s.selectByIndex(i);
		Thread.sleep(2000);
		s.selectByValue(value);
		Thread.sleep(2000);
		s.selectByVisibleText(text);
		Thread.sleep(2000);

		s.deselectByIndex(i);
		Thread.sleep(3000);
		s.deselectByValue(value);
		Thread.sleep(3000);
		s.deselectByVisibleText(text);
		Thread.sleep(3000);
	}

	// -----------------------
	// To perform scrolling using  Javascript
	public static void scrollInto(WebDriver driver,WebElement link, boolean value) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(" + value +")", link);
	}

	//	Disabled Link
	public static void scrollIntoView(WebDriver driver,WebElement disabledLink, boolean value) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", disabledLink);
	}

	// ScrollBy
	public static void scrollBy(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
	}

	//	ScrollTo
	public static void scrollTo(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1200);");
	}

	// -----------------------------
	// To perform scrolling using  Actions
	//	ScrollByAmount
	public static void scrollByAmount(WebDriver driver, int x, int y) throws InterruptedException {
		Actions act = new Actions(driver);
		act.scrollByAmount(x ,y).perform();
	}

	// ScrollFromOrigin
	public static void scrollFromOrigin(WebDriver driver, int x, int y,ScrollOrigin sc) throws InterruptedException {
		Actions act = new Actions(driver);
		act.scrollFromOrigin(sc, x, y).perform();
	}
	
	//	ScrollToElement
	public static void scrollToElement(WebDriver driver, int x, int y, WebElement element) throws InterruptedException {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
}
