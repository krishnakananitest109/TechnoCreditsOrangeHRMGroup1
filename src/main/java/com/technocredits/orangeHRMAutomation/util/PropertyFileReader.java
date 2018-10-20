package com.technocredits.orangeHRMAutomation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	//String loginPropertiesPath = "E:\\Aditya\\Projects\\Oct20\\TechnoCreditsOrangeHRMGroup1\\src\\main\\java\\com\\technocredits\\orangeHRMAutomation\\config\\LoginPageProperties.properties";
	//Returning the properties object
	public Properties readPropertyFile(String loginPropertiesPath){
		File file = new File(loginPropertiesPath);
		Properties prop = null;
		try {
			FileInputStream input = new FileInputStream(file);
			prop = new Properties();
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
