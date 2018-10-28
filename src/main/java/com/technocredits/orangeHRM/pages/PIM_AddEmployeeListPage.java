package com.technocredits.orangeHRM.pages;

import java.util.Properties;

import com.technocredits.orangeHRMAutomation.base.PreDefinedMethods;
import com.technocredits.orangeHRMAutomation.util.PropertyFileReader;

public class PIM_AddEmployeeListPage extends PreDefinedMethods {
	private static PIM_AddEmployeeListPage pimPage;
	Properties PIM_AddEmployeePageProperties;

	// Constructor to read the PIM_AddEmployeeListProperties properties
	private PIM_AddEmployeeListPage() {
		PropertyFileReader propReader = new PropertyFileReader();
		PIM_AddEmployeePageProperties = propReader.readPropertyFile("PIM_AddEmployeeListProperties");
	}

	// Using a singleton design pattern so that no one can create more than one
	// object
	public static PIM_AddEmployeeListPage getInstance() {
		if (pimPage == null)
			pimPage = new PIM_AddEmployeeListPage();
		return pimPage;
	}

	// This method is performing mouse hover on mainmenu like "PIM" then
	// clicking on it's submenu like "Add Employee"
	public void mouseHoverOnElement() {
		hoverOnElement(PIM_AddEmployeePageProperties.getProperty("NavigationToPIM"),
				PIM_AddEmployeePageProperties.getProperty("NavigationToAddEmployee"));
	}

	// Clicking on the save button.
	public void clickButton(String locator) {
		clickOnElement(PIM_AddEmployeePageProperties.getProperty(locator));
	}

	// This method returning textvalue of a specified element
	public String getTextFromRequiredField(String errorMessageFiled) {
		String textValue = getTextofElement(PIM_AddEmployeePageProperties.getProperty(errorMessageFiled));
		return textValue;
	}

	// This method is taking xpath and value to insert on the locator
	public void enterTextValue(String locator, String textValue) {
		enterText(PIM_AddEmployeePageProperties.getProperty(locator), textValue);
	}
}
