package com.technocredits.orangeHRM.TestScripts;

import com.technocredits.orangeHRM.pages.LoginPage;
import com.technocredits.orangeHRM.pages.PIM_AddEmployeeListPage;
import com.technocredits.orangeHRMAutomation.base.PreDefinedMethods;

public class CommonTest extends PreDefinedMethods {
	// Login method taking username and password for login into website
	void login(String username, String password) {
		LoginPage loginPage = LoginPage.getInstance();
		BrowserInitialization();
		navigateToURL();
		loginPage.enterValueForLoginPage("userNameTextFiled", username);
		loginPage.enterValueForLoginPage("passwordTextFiled", password);
		loginPage.clickButton("loginButtonFiled");
	}

	// Returning PIM_AddEmployeeListPage object so that all the methods can be accessible.
	PIM_AddEmployeeListPage goToPIMAddEmployeePage() {
		PIM_AddEmployeeListPage pimPage = PIM_AddEmployeeListPage.getInstance();
		return pimPage;
	}

	// Method to close the browser
	void closeBrowser() {
		browserClose();
	}
}
