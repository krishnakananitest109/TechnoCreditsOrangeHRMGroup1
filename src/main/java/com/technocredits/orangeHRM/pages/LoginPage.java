package com.technocredits.orangeHRM.pages;

import java.util.Properties;

import com.technocredits.orangeHRMAutomation.base.PreDefinedMethods;
import com.technocredits.orangeHRMAutomation.util.PropertyFileReader;

public class LoginPage extends PreDefinedMethods {

	private static LoginPage loginPage;
	Properties loginPageProperties;

	private LoginPage() {
		// Reading property file
		PropertyFileReader propReader = new PropertyFileReader();
		loginPageProperties = propReader.readPropertyFile("LoginPageProperties");
	}

	// Using a singleton design pattern so that no one can create more than one
	// object
	public static LoginPage getInstance() {
		if (loginPage == null)
			loginPage = new LoginPage();
		return loginPage;
	}

	// This method is taking xpath and value to insert on the locator
	public void enterValueForLoginPage(String locator, String textValue) {
		// Entering values through the method defined in PreDefinedMethod
		enterText(loginPageProperties.getProperty(locator), textValue);
	}

	// Click method to click on the specified locator
	public void clickButton(String locator) {
		clickOnElement(loginPageProperties.getProperty(locator));
	}

}
