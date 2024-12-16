package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.basepage;

public class mysettingspage extends basepage{

	public mysettingspage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="PersonalInfo_font")
	WebElement Personallink;
	
	@FindBy(id="LoginHistory_font")
	WebElement LoginHistory; 
	
	@FindBy(xpath ="//a[@href='/servlet/servlet.LoginHistory?id=005aj000009q1sT']")
	WebElement DownloadHistory;
	
	@FindBy(id="DisplayAndLayout_font")
	WebElement DisplayAndLayout;
	
	@FindBy(id="CustomizeTabs_font")
	WebElement CustomizeMyTabs;
	
	@FindBy(xpath="//select[@id='p4']")
	WebElement CustomAppDropDown;
	
	@FindBy(xpath="//select[@id='duel_select_0']")
	WebElement AvailableTabs;
	
	@FindBy(xpath="//img[@alt='Add']")
	WebElement AddButton;
	
	@FindBy(name="save")
	WebElement saveButton;
	
	@FindBy(id="EmailSetup_font")
	WebElement Email;
	
	@FindBy(id="EmailSettings_font")
	WebElement MyEmailSettings; 
	
	@FindBy(name="sender_name")
	WebElement EmailName;
	
	@FindBy( id="sender_email")
	WebElement EmailAddress;
	
	@FindBy(xpath="//input[@id=\"auto_bcc1\"]")
	WebElement AutomaticBCCYes; 
	
	@FindBy(id="CalendarAndReminders_font")
	WebElement CalendarandReminders;
	
	@FindBy(id="Reminders_font")
	WebElement ActivityReminders;
	
	@FindBy(id="testbtn")
	WebElement openatestreminderbutton;
	
	public void clickonpersonallink() 
	{
	Personallink.click();
	}
	
	public void clickonloginhistory() {
		LoginHistory.click();
	}
	
	public void clickonDownloadHistory() {
		DownloadHistory.click();
	}
	
	public void clickonDisplayAndLayout() {
		DisplayAndLayout.click();
	}
	
	public void clickonCustomizeMyTabs()
	{
		CustomizeMyTabs.click();
	}
	
	public void selectCustomAppDropDown(String optiontoSelect) {
		Select select = new Select(CustomAppDropDown);
		//"Salesforce Chatter"
		select.selectByVisibleText(optiontoSelect);
	}
	
	public void selectAvailableTab(String optioninavailableTab)throws InterruptedException {
		Thread.sleep(5000);
		Select selecttab = new Select(AvailableTabs);
		//"Reports"
		selecttab.selectByVisibleText(optioninavailableTab);
	}
	
	public void clickOnAddButton()  {
		
		AddButton.click();
	}
	
	public void clickOnSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		saveButton.click();
	}
	
	public void clickonEmail() {
		Email.click();
	}
	
	public void clickonMyEmailSettings() {
		MyEmailSettings.click();
	}
	
	public void enterintoEmailName(String emailname) {
		EmailName.clear();
//		Thread.sleep(3000);
		EmailName.sendKeys(emailname);
	}
	public void enterintoEmailAddress(String emailAddress) {
		EmailAddress.clear();
		EmailAddress.sendKeys(emailAddress);
	}
	
	public void clickonAutomaticBCCYes() {
		AutomaticBCCYes.click();
	}
	
	public void clickonCalendarandReminders() {
		CalendarandReminders.click();
	}
	public void clickonActivityReminders() {
		ActivityReminders.click();
	}
	
	public void clickonopenatestreminder() {
		openatestreminderbutton.click();
	}
}
