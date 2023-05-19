package com.ttn.WebAutomation.tests.msil;



import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.mockito.exceptions.Reporter;
import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ttn.WebAutomation.base.BaseLib;

import com.ttn.WebAutomation.base.*;
import com.ttn.WebAutomation.pageObjects.*;
import com.ttn.WebAutomation.seleniumUtils.CommonUtility;
import com.ttn.WebAutomation.seleniumUtils.SeleniumHelper;

import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseLib {
//	LoginPage loginpage; 
	LoginPage loginpage;

//	SeleniumHelper help = new SeleniumHelper(driver);
	
	
////	@Test
//	public void loginPageTitleTest1() {
//		
//	}
	
	@Test
	public void loginPageTitleTest() throws InterruptedException, IOException {	
		loginpage = new LoginPage();
		
		loginpage.setEmail();
		String title = getDriver().getTitle();
		assertEquals(title, "Sign in - Google Accounts");
		
		loginpage.setPassword();
		Thread.sleep(10000);
	}

	
	
//	@Test
//	public void Setup() throws InterruptedException, IOException {
//		
//		
//	}
	
//	
	
	
	
	
}
