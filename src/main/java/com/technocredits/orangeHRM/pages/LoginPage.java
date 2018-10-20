package com.technocredits.orangeHRM.pages;

import java.util.Properties;
import com.technocredits.orangeHRM.util.PropertyFileReader;



public class LoginPage extends com.technocredits.orangeHRM.base.PredefinedMethods{
	static LoginPage loginpageInstance;
	Properties loginPageProperties;
	private LoginPage(){
		PropertyFileReader propReader = new PropertyFileReader();
		loginPageProperties = propReader.initalizePropertyFile("LoginPage");
		initialization();
	}
	
	static public LoginPage getInstance() 
	{
		if(loginpageInstance == null){
			loginpageInstance = new LoginPage();
		}
		return loginpageInstance;
	}
	
	public void enterURL(String URL){
		OpenURL(loginPageProperties.getProperty(URL));
	}
	
	public void enterValueForLoginPage(String locator, String value){
		setText(loginPageProperties.getProperty(locator),value);
	}
	
	public void clickOnLoginPage(String locator){
		click(loginPageProperties.getProperty(locator));
	}	
}
