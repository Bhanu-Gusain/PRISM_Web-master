package com.ttn.WebAutomation.tests.msil;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ttn.WebAutomation.base.BaseLib;
import com.ttn.WebAutomation.pageObjects.Homepage;


public class HomePageTest extends BaseLib {
//	WebDriverWait wait;
	Homepage homePage=new Homepage();
//	searchNewerResult result;
public HomePageTest() throws IOException{
	super();
//	wait = new WebDriverWait(driver, 10);
}

	
  @Test
  public void homePageTitleTest() throws IOException, InterruptedException { 
	  Thread.sleep(3000);
	  String title = homePage.ValidateTitle();
	  assertEquals(title, "Home");
	  
  }
  @Test
  public void nwLogotest() {
	  assertTrue(homePage.nwLogo());
//	  homePage.nwLogo();
  }
  @Test
  public void searchNewerfuncTest() throws IOException {
//	  searchNewerResult res = homePage.searchNewerfunc();
	  assertTrue(homePage.searchNewerfunc());
  }
  @Test
  public void logTicketLogoIsDisplayedTest() {
	  assertTrue(homePage.logTicketLogoIsDisplayed());
  }
  @Test
  public void notificcationLogoIsDisplayedTest() {
	  assertTrue(homePage.notificcationLogoIsDisplayed());
  }
  @Test
  public void appplicationDrawerLogoIsDisplayedTest() throws InterruptedException {
	  assertTrue(homePage.appplicationDrawerLogoIsDisplayed());
  }
  
}
