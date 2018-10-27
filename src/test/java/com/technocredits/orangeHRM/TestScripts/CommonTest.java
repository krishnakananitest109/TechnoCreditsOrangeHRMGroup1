package com.technocredits.orangeHRM.TestScripts;

import com.technocredits.orangeHRM.pages.LoginPage;
import com.technocredits.orangeHRM.pages.PIM_AddEmployeeListPage;
import com.technocredits.orangeHRMAutomation.base.PreDefinedMethods;

public class CommonTest extends PreDefinedMethods {

	void login(String username, String password) {
		LoginPage loginPage = LoginPage.getInstance();
		loginPage.enterValueForLoginPage("userNameTextFiled", username);
		loginPage.enterValueForLoginPage("passwordTextFiled", password);
		loginPage.clickButton("loginButtonFiled");
	}

	PIM_AddEmployeeListPage goTo() {
		PIM_AddEmployeeListPage pimPage = PIM_AddEmployeeListPage.getInstance();
		return pimPage;
	}
}
