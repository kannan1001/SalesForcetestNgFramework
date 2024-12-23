package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.basepage;

public class contactpage extends basepage{

	public contactpage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath="//a[@title='Contacts Tab' and contains(text(),'Contacts')]")
	WebElement contactsTab; 
	
	@FindBy(xpath="//input[@name='new']")
	WebElement NewButton; 
	
	@FindBy(xpath="//input[@name='name_lastcon2']")
	WebElement LastName; 
	
	@FindBy(xpath="//input[@name='con4']")
	WebElement AccountName; 
	
	@FindBy(xpath="//input[@name='save']")
	WebElement saveButton; 
	
	@FindBy(xpath="//input[@name='save_new']")
	WebElement saveandNewButton; 
	
	
	@FindBy(xpath="//a[text()='Create New View']")
	WebElement createnewview; 
	
	@FindBy(xpath="//input[@id='fname']")
	WebElement viewname; 
	
	@FindBy(xpath="//input[@id='devname']")
	WebElement viewuniquename; 
	
	@FindBy(xpath="//select[@id='hotlist_mode']")
	WebElement RecentlyCreatedDropdown; 
	
	@FindBy(xpath="//select[@name='fcf']")
	WebElement contactdropdown; 
	
	@FindBy(xpath="//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")
	WebElement firstcontact; 
	
	@FindBy(xpath="//input[@name='cancel']")
	WebElement cancelButton; 
	
	
	
	public void clickoncontacttab() {
		contactsTab.click();
	}
	
	public void clickonNewButton() {
		NewButton.click();
	}
	
	public void enterintoLastName(String lname) {
		LastName.sendKeys(lname);
	}
	
	public void enterintoAccountName(String accountname) {
		AccountName.sendKeys(accountname);
	}
	
	public void clickonsaveButton() {
		saveButton.click();
	}
	
	public void clickoncreatenewview() {
		createnewview.click();
	}
	
	public void enterintoviewname(String strviewname) {
		viewname.sendKeys(strviewname);
	}
	
	public void enterintoviewuniquename(String strviewuniquename) {
		viewuniquename.clear();
		viewuniquename.sendKeys(strviewuniquename);
	}
	
	public void selectrecentlycreateddropdown(String dropdownstr) {
		Select RecentDropdownselect = new Select(RecentlyCreatedDropdown);
		RecentDropdownselect.selectByVisibleText(dropdownstr);
	}
	
	public void selectcontactdropdown(String strcontactdropdown) {
		Select contactdropdownselect = new Select(contactdropdown);
		contactdropdownselect.selectByVisibleText(strcontactdropdown);
	}
	
	public void clickonFirstcontact() {
		waitforelement(firstcontact);
		firstcontact.click();
	}
	
	public void clickoncancelbutton() {
		cancelButton.click();
	}

	public void clickonsaveandnewbutton() {
		saveandNewButton.click();
	}
}
