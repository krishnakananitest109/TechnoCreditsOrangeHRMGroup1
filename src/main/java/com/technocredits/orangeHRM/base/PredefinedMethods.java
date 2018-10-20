package com.technocredits.orangeHRM.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedMethods {
	WebDriver driver;
	
	public void initialization(){
		String OperatingSystem = "IOS";
		if( OperatingSystem.equals("IOS")) {System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/Selenium/chromedriver");} 
		else {System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources"+ File.separator + "chromedriver.exe");}
		driver = new ChromeDriver();
			
	}
	
	public void OpenURL(String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
	public void setText(String locator, String value)
	{
		driver.findElement(By.xpath(locator)).sendKeys(value);
	}
	
	public void click(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
}
