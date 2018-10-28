package com.technocredits.orangeHRMAutomation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.technocredits.orangeHRMAutomation.constant.constant;

public class PropertyFileReader {
	//String loginPropertiesPath = "E:\\Aditya\\Projects\\Oct20\\TechnoCreditsOrangeHRMGroup1\\src\\main\\java\\com\\technocredits\\orangeHRMAutomation\\config\\LoginPageProperties.properties";
	//Returning the properties object
	public Properties readPropertyFile(String propFileName){
		File file = new File(constant.PROPERTIES+ File.separator + propFileName + ".properties");
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
