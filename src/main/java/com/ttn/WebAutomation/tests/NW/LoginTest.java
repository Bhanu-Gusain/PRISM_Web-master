package com.ttn.WebAutomation.tests.NW;



import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ttn.WebAutomation.base.BaseLib;

import com.ttn.WebAutomation.pageObjects.*;
import com.ttn.WebAutomation.seleniumUtils.WaitStatementLib;

public class LoginTest extends BaseLib { 
	LoginPage loginpage;
	WebDriver driver;
	
	@Test
	public void loginPageTitleTest() throws InterruptedException, IOException {	
		driver = getDriver();
		loginpage = new LoginPage(driver);
		String title = driver.getTitle();
		assertEquals(title,"Newersworld");
		loginpage.Login();
		
	}

}
