package com.ttn.WebAutomation.pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogTicket {
	WebDriver driver;
	@FindBy(xpath = "//span[normalize-space()='?']")
	WebElement LogTicketLogo;
	
	
	@FindBy(xpath = "//input[@ng-reflect-placeholder='Select Type']")
	WebElement type;
	
//	@FindBy(xpath = "//input[@ng-reflect-placeholder='Title']")
//	WebElement subType;
	
	@FindBy(xpath="//input[@ng-reflect-placeholder='Title']")
	WebElement title;
	
	@FindBy(xpath="//textarea[@data-placeholder='Description']")
	WebElement description;
	
	@FindBy(xpath = "//button[@type='button'][normalize-space()='SUBMIT']")
	WebElement submit;
	
	@FindBy(xpath = "//span[contains(text(),'Tickets')]")
	WebElement Tickets;

	@FindBy(xpath="//li[@class='ng-tns-c692-10 active']")
	WebElement Mytickets;
	
	@FindBy(xpath = "(//span[@class='tickets_count'])[1]")
	WebElement openTicketCount;
	
	public LogTicket(WebDriver driver) throws IOException
	{
		this.driver = driver; 
		PageFactory.initElements(driver,this);
//		wd = new WebDriverWait(wd1, Duration.ofSeconds(10)); 
	}
	
	
	
	public List<String> logTicketFunc() throws InterruptedException {
		List<String> countList = new ArrayList<String>();
		Tickets.click();
		Mytickets.click();
		String count =  openTicketCount.getText();
		LogTicketLogo.click();
		type.click();
		type.sendKeys("Attendance & Leave");
		type.sendKeys(Keys.ENTER);
		title.click();
		title.sendKeys("leave");
		description.click();
		description.sendKeys("abc");
		submit.click();
		Tickets.click();
		Thread.sleep(2000);
		Mytickets.click();
		String count1 = openTicketCount.getText();
		countList.add(count);
		countList.add(count1);
		return countList;
	}
}
