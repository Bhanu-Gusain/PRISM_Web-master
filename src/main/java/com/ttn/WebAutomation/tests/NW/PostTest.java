package com.ttn.WebAutomation.tests.NW;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ttn.WebAutomation.base.BaseLib;
import com.ttn.WebAutomation.pageObjects.LoginPage;
import com.ttn.WebAutomation.pageObjects.PostPage;

public class PostTest extends BaseLib{
	
	PostPage post;
	WebDriver driver;
	LoginPage login;
	
	@Test
	public void crudPostTest() throws Throwable {	
		driver = getDriver();
		login = new LoginPage(driver);
		login.Login();
		post = new PostPage(driver);
		post.crudPost();
		assertTrue(post.tostermsgisDisplayed());
		String text = post.tostermsgText();
		assertEquals(text, "Post has been published successfully");
		
	}
}
