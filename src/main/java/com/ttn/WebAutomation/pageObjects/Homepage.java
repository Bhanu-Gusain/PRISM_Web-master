package com.ttn.WebAutomation.pageObjects;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ttn.WebAutomation.base.BaseLib;


public class Homepage extends BaseLib {
	WebDriver wd1 = getDriver() ;
	WebDriverWait wd;
	
	@FindBy(xpath = "(//a[@href='#/home'])[1]")
	WebElement NWlogo;
	
	@FindBy(xpath = "(//input[@placeholder=\"Search for Newers, Posts and Hashtags\"])[1]")
	WebElement searchNewer;
	
	@FindBy(xpath = "//div[@id=\"step4\"]/span")
	WebElement LogTicketLogo;
	
	@FindBy(xpath = "//div[@id='step5']/span")
	WebElement NotificationLogo;
	
	@FindBy(xpath = "//div[@id='step6']/span")
	WebElement ApplicationDrawerLogo;
	
	@FindBy(xpath = "//div[@id='step7']/span/app-profile-picture/img")
	WebElement MyProfileLogo;
	
	@FindBy(xpath = "//input[@placeholder='What’s on your mind?']")
	WebElement WhatsOnYourMind;
	
	@FindBy(xpath = "(//span[@class='text_gestures'])[1]")
	WebElement PhotoAndVideo;
	
	@FindBy(xpath = "//div[@class='picture_gestures ng-star-inserted']/span[2]")
	WebElement RecognizeLogo;
	
	@FindBy(xpath = "(//span[@class=\"like-icon reactions_icon ng-star-inserted\"])[1]")
	WebElement FirstPostLikeButton;
	
	@FindBy(xpath = "(//div[@class='comment_reaction reactions_box'])[1]")
	WebElement FirstPostCommentButton;
	
	@FindBy(xpath = "(//textarea[@id='firstNameField'])[1]")
	WebElement FirstPostCommentArea;
	
	@FindBy(xpath = "//span[contains(text(),'Manage My Time')]")
	WebElement managemytime;

	@FindBy(xpath = "//span[contains(text(),'My Tickets')]")
	WebElement mytickets;

	@FindBy(xpath = "//span[contains(text(),'Important Links')]")
	WebElement implinks;

	@FindBy(xpath = "//span[contains(text(),'Org Chart')]")
	WebElement orgchart;
	
	public Homepage() throws IOException
	{
		PageFactory.initElements(getDriver(),this);
//		wd = new WebDriverWait(wd1, Duration.ofSeconds(10)); 
	}
	
	
	public String ValidateTitle() throws InterruptedException {
		wd.until(ExpectedConditions.visibilityOf(searchNewer));
//		Thread.sleep(10000);
		return getDriver().getTitle();
	}
	
	public boolean nwLogo () {
		return NWlogo.isDisplayed();
//		assertTrue(NWlogo.isDisplayed());
	}
	
	public boolean searchNewerfunc() throws IOException {
//		searchNewer.sendKeys("Bhanu gusain");
//		searchNewer.sendKeys(Keys.ENTER);
//		return new searchNewerResult();
		return searchNewer.isDisplayed();
		
	}
	
	public boolean logTicketLogoIsDisplayed(){
		return LogTicketLogo.isDisplayed();
	}
	
	public boolean notificcationLogoIsDisplayed() {
		return NotificationLogo.isDisplayed();
	}
	
	public boolean appplicationDrawerLogoIsDisplayed() throws InterruptedException {
//		wd.until(ExpectedConditions.elementToBeClickable(ApplicationDrawerLogo));
//		Thread.sleep(2000);
		return ApplicationDrawerLogo.isDisplayed();
	}
	
	public boolean myProfileLogoIsDisplayed() {
		return MyProfileLogo.isDisplayed();
	}
	public boolean WhatsOnYourMindIsDisplayed() {
		return WhatsOnYourMind.isDisplayed();
	}
	public boolean photoAndVideoIsDisplayed() {
		return PhotoAndVideo.isDisplayed();
	}
	public boolean recognizeLogoIsDisplayed() {
		return RecognizeLogo.isDisplayed();
	}
	public boolean firstPostLikeButtonIsDisplayed() {
		return FirstPostLikeButton.isDisplayed();
	}
	
	

}
