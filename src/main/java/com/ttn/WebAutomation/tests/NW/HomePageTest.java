package com.ttn.WebAutomation.tests.NW;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ttn.WebAutomation.base.BaseLib;
import com.ttn.WebAutomation.pageObjects.Homepage;
import com.ttn.WebAutomation.pageObjects.LoginPage;
import com.ttn.WebAutomation.seleniumUtils.WaitStatementLib;


public class HomePageTest extends BaseLib {
	WebDriver driver;
	Homepage homePage;
	LoginPage login;
	
  @Test
  public void HomePageTests() throws IOException, InterruptedException { 
	  driver = getDriver(); 
	  login = new LoginPage(driver);
	  login.Login();
	  homePage = new Homepage(driver);
	  String title = homePage.ValidateTitle();
	  assertEquals(title, "Home");
	  assertTrue(homePage.nwLogo());
	  assertTrue(homePage.searchNewerFuncIsDisplayed());	  
	  homePage.scrollHomepage();
	  assertTrue(homePage.logTicketLogoIsDisplayed());
	  assertTrue(homePage.notificcationLogoIsDisplayed());
	  assertTrue(homePage.appplicationDrawerLogoIsDisplayed());
	  assertTrue(homePage.myProfileLogoOpening());
	  assertTrue(homePage.WhatsOnYourMindIsDisplayed());
	  assertTrue(homePage.photoAndVideoIsDisplayed());
	  assertTrue(homePage.recognizeLogoIsDisplayed());
	  assertTrue(homePage.firstPostLikeButtonIsDisplayed());
	  List<Boolean> libool = homePage.importantLinksFunc();
	  assertTrue(libool.get(0));
	  assertTrue(libool.get(1));
	  
	  
  }
 
 
}
