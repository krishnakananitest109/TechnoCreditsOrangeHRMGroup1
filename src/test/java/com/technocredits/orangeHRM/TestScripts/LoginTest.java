package com.technocredits.orangeHRM.TestScripts;

import org.testng.annotations.Test;

public class LoginTest extends CommonTest {
	@Test
	public void doLogin(){
		//login method check login functionality
		login("Admin","admin123");
	}
}
