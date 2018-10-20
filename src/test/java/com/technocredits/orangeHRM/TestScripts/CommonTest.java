package com.technocredits.orangeHRM.TestScripts;

import com.technocredits.orangeHRM.pages.LoginPage;

public class CommonTest {

	void login(String username, String password) {
		LoginPage loginPage = LoginPage.getInstance();
		loginPage.enterValueForLoginPage("userNameTextFiled", username);
		loginPage.enterValueForLoginPage("passwordTextFiled", password);
		loginPage.clickButton("loginButtonFiled");
	}

}
