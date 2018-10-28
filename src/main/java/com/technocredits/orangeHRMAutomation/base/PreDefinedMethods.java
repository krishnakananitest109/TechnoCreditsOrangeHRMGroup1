package com.technocredits.orangeHRMAutomation.base;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import com.technocredits.orangeHRMAutomation.constant.constant;
import com.technocredits.orangeHRMAutomation.util.PropertyFileReader;

public class PreDefinedMethods {
	// Static block to load the properties file only once
	{
		PropertyFileReader propReader = new PropertyFileReader();
		predefinedPageProperties = propReader.readPropertyFile("LoginPageProperties");
	}

	static WebDriver driver;
	Properties predefinedPageProperties;

	// Method to launch the browser. @browserName to get browser name from properties file.
	// @chromePath to get path of chromedriver from constant file.
	public void BrowserInitialization() {
		String browserName = predefinedPageProperties.getProperty("browserName");
		switch (browserName) {
		case "chrome": {
			System.setProperty("webdriver.chrome.driver", constant.browsersPath + "chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		case "firefox": {
			System.setProperty("webdriver.gecko.driver", constant.browsersPath + "geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		case "IE": {
			System.setProperty("webdriver.ie.driver", constant.browsersPath + "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		}
		driver.manage().window().maximize();
	}
	
	// Method to close the browser session.
	public void browserClose(){
		driver.close();
	}
	
	// Method to open the URL.
	public void navigateToURL() {
		driver.get(predefinedPageProperties.getProperty("URL"));
	}
	
	// Method is taking two parameters. One for xpath and another to enter text value 
	public void enterText(String locator, String textValue) {
		getElement(locator).sendKeys(textValue);
	}
	
	// Method to click on the locator
	public void clickOnElement(String locator) {
		getElement(locator).click();
	}
	
	// Generic method to perform findElement
	public WebElement getElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element;
	}
	
	// Method is taking two parameters. One to hover on mainmenu and another to click on the submenu.
	public void hoverOnElement(String moduleName, String subModuleName) {
		Actions act = new Actions(driver);
		WebElement element = getElement(moduleName);
		act.moveToElement(element).build().perform();
		clickOnElement(subModuleName);
	}
	
	// Method is used to get the text from an element.
	public String getTextofElement(String FirstNameRequiredErrorMessage) {
		String returnTextValue = getElement(FirstNameRequiredErrorMessage).getText();
		return returnTextValue;
	}
}
