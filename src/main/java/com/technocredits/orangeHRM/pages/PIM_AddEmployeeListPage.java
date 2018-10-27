package com.technocredits.orangeHRM.pages;

import java.util.Properties;

import com.technocredits.orangeHRMAutomation.base.PreDefinedMethods;
import com.technocredits.orangeHRMAutomation.util.PropertyFileReader;

public class PIM_AddEmployeeListPage extends PreDefinedMethods {
	private static PIM_AddEmployeeListPage pimPage;
	Properties PIM_AddEmployeePageProperties;

	private PIM_AddEmployeeListPage() {
		PropertyFileReader propReader = new PropertyFileReader();
		PIM_AddEmployeePageProperties = propReader.readPropertyFile("PIM_AddEmployeeListProperties");
	}

	public static PIM_AddEmployeeListPage getInstance() {
		if (pimPage == null)
			pimPage = new PIM_AddEmployeeListPage();
		return pimPage;
	}

	public void mouseHoverOnElement() {
		hoverOnElement(PIM_AddEmployeePageProperties.getProperty("NavigationToPIM"),
				PIM_AddEmployeePageProperties.getProperty("NavigationToAddEmployee"));
	}

	public void clickButton() {
		clickOnElement(PIM_AddEmployeePageProperties.getProperty("SaveButton"));
	}

	public String getTextFromRequiredField(String errorMessageFiled) {
		String textValue = getTextofElement(PIM_AddEmployeePageProperties.getProperty(errorMessageFiled));
		return textValue;
	}
	
	public void enterTextValue(String locator, String textValue){
		enterText(PIM_AddEmployeePageProperties.getProperty(locator), textValue);
	}
}
