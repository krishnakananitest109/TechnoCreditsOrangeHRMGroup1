package com.technocredits.orangeHRM.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.technocredits.orangeHRM.pages.PIM_AddEmployeeListPage;

public class pim_AddEmployeeTest extends CommonTest{
	@Test(priority=1)
	public void verifyPIM_AddEmployee(){
		String ExpectedErrorMessage = "Required";
		//login method check login functionality
		login("Admin","admin123");
		PIM_AddEmployeeListPage pimPage = goTo();
		//Hover on PIM and click on Add employee
		pimPage.mouseHoverOnElement();
		//Click on save button to check the required field validation for FirstName & LastName
		pimPage.clickButton();
		//Validating required field error message is shown for FirstName
		String FirstNameErrorMessage = pimPage.getTextFromRequiredField("FirstNameRequiredErrorMessage");
		Assert.assertEquals(FirstNameErrorMessage, ExpectedErrorMessage);
		//Validating required field error message is shown for LastName
		String LastNameErrorMessage = pimPage.getTextFromRequiredField("LastNameRequiredErrorMessage");
		Assert.assertEquals(LastNameErrorMessage, ExpectedErrorMessage);
	}
	
	@Test(priority=2)
	public void verifyPIM_AddEmployeeScenarioSecond(){
		String ExpectedErrorMessage = "Required";
		PIM_AddEmployeeListPage pimPage = goTo();
		//Hover on PIM and click on Add employee
		pimPage.mouseHoverOnElement();
		pimPage.enterTextValue("FirstNameTextField","FirstNameTest");
		//Click on save button to check the required field validation for FirstName & LastName
		pimPage.clickButton();
		//Need to ask if assert is not equals
/*		//Validating required field error message is shown for FirstName
		String FirstNameErrorMessage = pimPage.getTextFromRequiredField("FirstNameRequiredErrorMessage");
		Assert.assertEquals(FirstNameErrorMessage, ExpectedErrorMessage);*/
		//Validating required field error message is shown for LastName
		String LastNameErrorMessage = pimPage.getTextFromRequiredField("LastNameRequiredErrorMessage");
		Assert.assertEquals(LastNameErrorMessage, ExpectedErrorMessage);
	}
}
