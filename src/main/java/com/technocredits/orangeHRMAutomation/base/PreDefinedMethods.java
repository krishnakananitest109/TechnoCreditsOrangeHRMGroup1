package com.technocredits.orangeHRMAutomation.base;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PreDefinedMethods {
	static WebDriver driver;

	public void BrowserInitialization(String browserName) {
		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "src"
					+ File.separator + "test" + File.separator + "resources" + File.separator + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}

	public void navigateToURL(String navigateToURL) {
		driver.get(navigateToURL);
	}

	public void enterText(String locator, String textValue) {
		getElement(locator).sendKeys(textValue);
	}

	public void clickOnElement(String locator) {
		getElement(locator).click();
	}

	public WebElement getElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element;
	}

	public void hoverOnElement(String moduleName, String subModuleName) {
		Actions act = new Actions(driver);
		WebElement element = getElement(moduleName);
		act.moveToElement(element).build().perform();
		clickOnElement(subModuleName);
	}

	public String getTextofElement(String FirstNameRequiredErrorMessage) {
		String returnTextValue = getElement(FirstNameRequiredErrorMessage).getText();
		return returnTextValue;
	}
}
