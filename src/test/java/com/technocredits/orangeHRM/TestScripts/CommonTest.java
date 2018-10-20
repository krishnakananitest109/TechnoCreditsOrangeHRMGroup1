package com.technocredits.orangeHRM.TestScripts;

import com.technocredits.orangeHRM.pages.LoginPage;

public class CommonTest {
	
            public void login(String username,String password){
            
			LoginPage loginpageInstance = LoginPage.getInstance();
			loginpageInstance.enterURL("URL");
			loginpageInstance.enterValueForLoginPage("usernameTextField",username);
			loginpageInstance.enterValueForLoginPage("passwordTextField",password);
			loginpageInstance.clickOnLoginPage("loginButton");
		
	}

}
