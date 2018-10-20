package com.technocredits.orangeHRM.pages;

import java.util.Properties;

import com.technocredits.orangeHRMAutomation.base.PreDefinedMethods;
import com.technocredits.orangeHRMAutomation.util.PropertyFileReader;

public class LoginPage extends PreDefinedMethods{

	private static LoginPage loginPage;
	Properties loginPageProperties;
	private LoginPage() {
		//initializing the broweser with name
		BrowserInitialization("chrome");
		//Reading property file
		PropertyFileReader propReader = new PropertyFileReader();
		loginPageProperties = propReader.readPropertyFile("E:\\Aditya\\Projects\\Oct20\\TechnoCreditsOrangeHRMGroup1\\src\\main\\java\\com\\technocredits\\orangeHRMAutomation\\config\\LoginPageProperties.properties");
	}

	public static LoginPage getInstance() {
		if (loginPage == null)
			loginPage = new LoginPage();
		return loginPage;
	}

	public void enterValueForLoginPage(String locator, String textValue) {
		//Entering values through the method defined in PreDefinedMethod
		enterText(loginPageProperties.getProperty(locator),textValue);
	}

	public void clickButton(String locator){
		clickOnElement(loginPageProperties.getProperty(locator));
	}
}
