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
		// initializing the browser with name
		BrowserInitialization("chrome");
		navigateToURL(loginPageProperties.getProperty("QAURL"));
	}

	public static LoginPage getInstance() {
		if (loginPage == null)
			loginPage = new LoginPage();
		return loginPage;
	}
	
	public void goToURL(String URL){
		
	}

	public void enterValueForLoginPage(String locator, String textValue) {
		// Entering values through the method defined in PreDefinedMethod
		enterText(loginPageProperties.getProperty(locator), textValue);
	}

	public void clickButton(String locator) {
		clickOnElement(loginPageProperties.getProperty(locator));
	}

}
