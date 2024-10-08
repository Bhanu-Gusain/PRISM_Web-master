package com.ttn.WebAutomation.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ttn.WebAutomation.base.BaseLib;
import com.ttn.WebAutomation.seleniumUtils.SeleniumHelper;
import com.ttn.WebAutomation.seleniumUtils.WaitStatementLib;

public class SearchResultFor extends BaseLib{
	WebDriver driver;
	SeleniumHelper helper;
	
	@FindBy(css = "h2.searched-profile-name")
	WebElement searchResult;
	
	@FindBy(xpath = "(//a[@href='#/home'])[1]")
	WebElement NWlogo;
	
	
	@FindBy(css="span.search_result_text")
	WebElement ResultForHead;
	
	@FindBy(xpath = "(//input[@placeholder='Search for Newers, Posts and Hashtags'])[1]")
	WebElement searchNewer;
	
	
	public SearchResultFor(WebDriver driver) {
		super();
		this.driver = getDriver();
		PageFactory.initElements(driver,this);
		helper = new SeleniumHelper();
	}


	public String searchResultTitle() throws InterruptedException {
//		searchNewer.sendKeys("bhanu gusain");
		helper.enterData(searchNewer,"bhanu gusain");
		searchNewer.sendKeys(Keys.ENTER);
		WaitStatementLib.explicitWaitForVisibility(driver, 5, ResultForHead);
		String titleSearchResult = driver.getTitle(); 
		return titleSearchResult;
		
	}
	public void goToUev() {
		searchResult.click();
	}
	public String resultForName() {
		WaitStatementLib.hardWaitFormiliSeconds(2000);
		return ResultForHead.getText();
	}
//	public void clickOnName() {
//		searchResult.click();
//	}
	
}
