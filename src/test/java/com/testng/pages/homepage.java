package com.testng.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.testng.base.basepage;

public class homepage extends basepage {

	public homepage(WebDriver driver) {
		super(driver);
		
	}
	String FirstLastNamePage;
	
	@FindBy(xpath="//a[contains(text(),'Home') and @title='Home Tab']")
	WebElement HomeTab;
	
	@FindBy(xpath="//h1[@class = 'currentStatusUserName']")
	WebElement FirstLastName; 
	
	@FindBy(xpath="//a[text()= 'My Profile']")
	WebElement MyProfile;
	
	@FindBy(id="userNavLabel")
	WebElement userMenuButton; 
	
	@FindBy(xpath="//img[@title = 'Edit Profile']")
	WebElement Editprofilebutton; 
	
	@FindBy(id="contactInfoContentId")
	WebElement EditprofileiFrame; 
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement abouttab; 
	
	@FindBy(id="lastName")
	WebElement lastName; 
	
	@FindBy(xpath="//input[@value = 'Save All']")
	WebElement saveAll; 
	
	@FindBy(xpath="//img[@class='allTabsArrow']")
	WebElement plusicon; 
	
	@FindBy(xpath="//input[@name='customize']")
	WebElement customizemytab;
	
	@FindBy(xpath="//select[@id='duel_select_1']")
	WebElement selectedtabs; 
	
	@FindBy(xpath="//img[@class='leftArrowIcon']")
	WebElement RemoveButton; 
	
	@FindBy(xpath="//input[@name='save']")
	WebElement saveButton; 
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement Logout;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[2]/a")
	WebElement currentdatelink;
	
	@FindBy(className="fixedTable")
	WebElement time; 
	
	@FindBy(xpath= "//td[@class = 'fixedTable']//a")
	List<WebElement> times;
	
	@FindBy(name="EndDateTime_time")
	WebElement Endtime; 
	
	@FindBy(xpath="//div[text()='10:00 PM']")
	WebElement Endtime10option; 
	
	@FindBy(xpath="//div[text()='7:00 PM']")
	WebElement Endtime7option;
	
	@FindBy(xpath="//input[@id='IsRecurrence']")
	WebElement RecurrenceCheckBox; 
	
	@FindBy(xpath="//input[@id='rectypeftw']")
	WebElement WeeklyRadioButton;
	
	@FindBy(id="RecurrenceEndDateOnly")
	WebElement RecurrenceEndDate;
	
	@FindBy(xpath="//a[@class='calToday']")
	WebElement RecurrenceEndDateToday; 
	
	
	@FindBy(tagName="body")
	WebElement body;
	
	

	
	public void clickonhometab() {
		HomeTab.click();
	}
	
	public void clickonFirstLastName() {
		FirstLastName.click();
		FirstLastNamePage = driver.getTitle();
	}
	
	public void verifyNameinhomepageandMyprofilepage() {
		userMenuButton.click();
		MyProfile.click();
		String MyProfilepage =driver.getTitle();
		Assert.assertEquals(FirstLastNamePage, MyProfilepage ,"The two are not same");
	}
	
	public void clickoneditprofilebutton() {
		Editprofilebutton.click();
		driver.switchTo().frame(EditprofileiFrame);
	}
	
	public void clickonabouttabinEditprofile() {
		abouttab.click();
	}
	
	public void enterintolastname(String lname) {
		lastName.clear();
		lastName.sendKeys(lname);
	}
	
	public void clickonsaveall() {
		saveAll.click();
	}
	
	public void clickonplusicon() {
		plusicon.click();
	}
	public void clickoncustomizemytab() {
		customizemytab.click();
	}
	
	public void removeoneselectedtab(String removetab) {
		Select selectedtabselect = new Select(selectedtabs);
		selectedtabselect.selectByVisibleText(removetab);
		RemoveButton.click();
	}
	
	public void clickonsaveButton() {
		saveButton.click();
	}
	public void clickonLogout() {
		userMenuButton.click();
		Logout.click();
	}
	
	public void clickoncurrentdatelink() {
		waitforelement(currentdatelink);
		currentdatelink.click();
	}
	
	public void clickontimelink(String time) {
		
		for(WebElement ti: times) {
			if(ti.getText().equals(time)) {
				ti.click();
				System.out.println("I am here");
				break;
			}
		}
	}
	
	public void clickonEndtime() {
		Endtime.click();
	}
	
	public void select10EndTime() {
		Endtime10option.click();
	}

	public void select7Endtime() {
		Endtime7option.click();
	}
	
	public void clickonRecurrenceCheckBox() {
		RecurrenceCheckBox.click();
	}
	public void clickonWeeklyRadioButton() {
		WeeklyRadioButton.click();
	}
	
	public void clickonRecurrenceEndDate() {
		RecurrenceEndDate.click();
	}
	
	public void clickonRecurrenceEndDateToday() {
		RecurrenceEndDateToday.click();
	}
	public void clickanywhere() {
		body.click();
	}
}
