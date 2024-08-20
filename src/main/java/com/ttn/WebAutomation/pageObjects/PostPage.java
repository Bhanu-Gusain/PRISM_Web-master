package com.ttn.WebAutomation.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ttn.WebAutomation.base.BaseLib;
import com.ttn.WebAutomation.seleniumUtils.SeleniumHelper;
import com.ttn.WebAutomation.seleniumUtils.WaitStatementLib;
import com.ttn.WebAutomation.utillib.GetPropertyValues;

public class PostPage extends BaseLib{
	
	WebDriver ldriver;
	SeleniumHelper helper;
	
	public PostPage(WebDriver driver) throws IOException {
		ldriver = driver;		
		PageFactory.initElements(ldriver,this);
		helper = new SeleniumHelper(ldriver);
	}
	
	@FindBy(css="input[placeholder='What’s on your mind?']")
	WebElement createPost;
	
	@FindBy(css="div[class='ql-editor ql-blank'] p")
	WebElement enterData;
	@FindBy(xpath="//button[normalize-space()='POST']")
	WebElement submitbtn;
	
	@FindBy(css="#toast-container")
	WebElement tostermsg;

	@FindBy(css=".primary_button.ng-star-inserted")
	WebElement saveasDraft;
	
	
	public void crudPost() throws Throwable {
		helper.click("createPost",createPost);
		WaitStatementLib.explicitWaitForVisibility(ldriver, 5, enterData);
		helper.enterData(enterData,"Testing");
		helper.click("Button",submitbtn);
	
	}
	
	public boolean tostermsgisDisplayed () throws InterruptedException {
		return tostermsg.isDisplayed();
	}
	
	public String tostermsgText() {
		return tostermsg.getText();
	}
}
