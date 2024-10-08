package com.ttn.WebAutomation.tests.NW;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ttn.WebAutomation.base.BaseLib;
import com.ttn.WebAutomation.pageObjects.LoginPage;
import com.ttn.WebAutomation.pageObjects.SearchResultFor;

public class SearchResultFuncTest extends BaseLib {
	WebDriver driver;
	LoginPage login;
	SearchResultFor searchResultFor;

	@Test
	public void searchResultIsDisplayed() throws InterruptedException, IOException {
		driver = getDriver();
		login = new LoginPage(driver);
		login.Login();
		searchResultFor = new SearchResultFor(driver);
		assertEquals(searchResultFor.searchResultTitle(),"Search Results");
		assertEquals(searchResultFor.resultForName(),"Results for “bhanu gusain”");

	}
}
