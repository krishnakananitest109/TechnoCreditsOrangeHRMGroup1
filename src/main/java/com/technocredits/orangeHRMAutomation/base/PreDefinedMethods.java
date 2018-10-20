package com.technocredits.orangeHRMAutomation.base;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreDefinedMethods {
	WebDriver driver;
	public void BrowserInitialization(String browserName){
		if(browserName.contains("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources"+ File.separator + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
	}
	
	public void enterText(String locator, String textValue){
		driver.findElement(By.xpath(locator)).sendKeys(textValue);
	}
	
	public void clickOnElement(String locator){
		driver.findElement(By.xpath(locator)).click();
	}
}
