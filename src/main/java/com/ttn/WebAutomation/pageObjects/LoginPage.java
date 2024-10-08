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

public class LoginPage extends BaseLib{
	WebDriver ldriver;
	SeleniumHelper helper;
	@FindBy(css  = "input[placeholder='Email']")WebElement email;
	@FindBy(css="input[placeholder='Password']")WebElement passwd;
	@FindBy(css = "button[type='submit']")WebElement LoginButon;
//	@FindBy(xpath ="(//span[@class=\"VfPpkd-vQzf8d\"])[2]") WebElement loginButton;
//	@FindBy(xpath = "//span[text()=\"Try another way\"]")WebElement tryAnotherWay;
//	@FindBy(xpath = "//strong[text()=\"Google Authenticator\"]")WebElement getAuthenticator;
//	@FindBy(id = "totpPin")WebElement pin;
//	@FindBy(css = "#totpNext > div > button")WebElement next2Fa;
	public LoginPage(WebDriver driver) throws IOException {
		ldriver = driver;		
		PageFactory.initElements(ldriver,this);
		helper = new SeleniumHelper(ldriver);

	}
	

	public void  Login(){
		WaitStatementLib.explicitWaitForVisibility(ldriver, 5, LoginButon);
		helper.enterData(email,GetPropertyValues.getEnvironmentProperty("username"));
		helper.enterData(passwd,GetPropertyValues.getEnvironmentProperty("password"));
		try {
			helper.click("Button",LoginButon);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	public void setPassword() throws InterruptedException {
//		Thread.sleep(3000);
////		wait.until(ExpectedConditions.elementToBeClickable(passwd));
//		
////		wait.until(ExpectedConditions.textToBePresentInElement(passwd, getPassword()));
//		Thread.sleep(3000);
//		loginButton.click();
//		Thread.sleep(5000);
//		tryAnotherWay.click();
//		Thread.sleep(2000);
//		getAuthenticator.click();
//		Thread.sleep(2000);
//		pin.sendKeys(TwoFA.getTwoFactorCode());
//		Thread.sleep(4000);
//		next2Fa.click();
//		Thread.sleep(3000);
//		
		
		
		
		
	}
//	@SuppressWarnings("unchecked")
//	public Homepage login(String eml , String pswd) throws InterruptedException, IOException {
//		email.sendKeys(eml);
//		new WebDriverWait(ldriver, 10).until(ExpectedConditions.elementToBeClickable(email));
//		email.sendKeys(eml);
//		Thread.sleep(3000);
		
//		nextButtn.click();
//		Thread.sleep(2000);
//		new WebDriverWait(ldriver, 10).until(ExpectedConditions.elementToBeClickable(passwd));
//		passwd.sendKeys(pswd);
//		Thread.sleep(2000);
//		passwd.sendKeys(pswd);
		
		
//		@SuppressWarnings({ "unchecked", "rawtypes" })
//		Wait fw = new  FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(TimeoutException.class);
//		fw.until(ExpectedConditions.elementToBeClickable(loginButton));
//		loginButton.click();
//		return new Homepage();
		
		
		
//	}
	
	

//}
