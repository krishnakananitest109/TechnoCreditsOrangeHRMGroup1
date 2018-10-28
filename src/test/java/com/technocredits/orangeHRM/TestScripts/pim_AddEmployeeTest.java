package com.technocredits.orangeHRM.TestScripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.technocredits.orangeHRM.pages.PIM_AddEmployeeListPage;

public class pim_AddEmployeeTest extends CommonTest {
	@Test(priority = 0)
	public void verifyPIM_AddEmployee() {
		String ExpectedErrorMessage = "Required";
		// login method check login functionality
		login("Admin", "admin123");
		// Creating a object of PIM page to access all the methods of PIM page
		PIM_AddEmployeeListPage pimPage = goToPIMAddEmployeePage();
		// Hover on PIM and click on Add employee
		pimPage.mouseHoverOnElement();
		// Click on save button to check the required field validation for
		// FirstName & LastName
		pimPage.clickButton("SaveButton");
		// Validating required field error message is shown for FirstName
		String FirstNameErrorMessage = pimPage.getTextFromRequiredField("FirstNameRequiredErrorMessage");
		Assert.assertEquals(FirstNameErrorMessage, ExpectedErrorMessage);
		// Validating required field error message is shown for LastName
		String LastNameErrorMessage = pimPage.getTextFromRequiredField("LastNameRequiredErrorMessage");
		Assert.assertEquals(LastNameErrorMessage, ExpectedErrorMessage);
	}

	@Test(priority = 1)
	public void verifyPIM_AddEmployeeScenarioSecond() {
		String ExpectedErrorMessage = "Required";
		// login method check login functionality
		login("Admin", "admin123");
		// Creating a object of PIM page to access all the methods of PIM page
		PIM_AddEmployeeListPage pimPage = goToPIMAddEmployeePage();
		// Hover on PIM and click on Add employee
		pimPage.mouseHoverOnElement();
		// Method is passing xpath and text value
		pimPage.enterTextValue("FirstNameTextField", "FirstNameTest");
		// Click on save button to check the required field validation for FirstName & LastName
		pimPage.clickButton("SaveButton");
		// Need to ask if assert is not equals
		/*
		 * Validating required field error message is shown for FirstName
		 * String FirstNameErrorMessage =
		 * pimPage.getTextFromRequiredField("FirstNameRequiredErrorMessage");
		 * Assert.assertEquals(FirstNameErrorMessage, ExpectedErrorMessage);
		 */
		// Validating required field error message is shown for LastName
		String LastNameErrorMessage = pimPage.getTextFromRequiredField("LastNameRequiredErrorMessage");
		Assert.assertEquals(LastNameErrorMessage, ExpectedErrorMessage);
	}
	
	// After each test closing the browser.
	@AfterTest
	public void performCloseBrowser(){
		closeBrowser();
	}
}
