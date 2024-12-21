package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.testng.base.basepage;

public class accountspage extends basepage{

	public accountspage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="Account_Tab")
	WebElement Accountstab;
	
	@FindBy(xpath="//input[@value=' New ']")
	WebElement Newbutton; 
	
	@FindBy(xpath="//input[@id='acc2']")
	WebElement AccountName; 
	
	@FindBy( xpath="//select[@id='acc6']")
	WebElement type;
	
	@FindBy(xpath="//select[@id='00Naj000006YSck']")
	WebElement customerpriority;
	
	@FindBy(xpath="//input[@value='Save & New']")
	WebElement saveandnew;
	
	@FindBy(xpath="//a[contains(text(),'Create New View')]")
	WebElement createnewlink; 
	
	@FindBy(xpath="//input[@id='fname']")
	WebElement viewname;
	
	@FindBy(xpath="//input[@id='devname']")
	WebElement viewuniquename; 
	
	@FindBy(xpath="//input[@name='save']")
	WebElement savebutton;
	
	@FindBy(xpath="//select[@name='fcf'][1]")
	WebElement viewnamedropdown;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement Editlink;
	
	@FindBy(xpath="//a[text()='Merge Accounts']")
	WebElement MergeAccounts;
	
	@FindBy(xpath="//a[starts-with(text(),'Accounts with')]")
	WebElement Accountswithactivitygreaterthan30;
	
	
	public void clickonAccountstab() {
		Accountstab.click();
	}
	
	public void clickonNewbutton() {
		Newbutton.click();
	}
	
	public void enterintoaccountname(String accountname) {
		AccountName.sendKeys(accountname);
	}
	
	public void selecttype(String typeStr) {
		Select selecttype = new Select(type);
		//"Technology Partner" "High"
		selecttype.selectByValue(typeStr);
	}
	
	public void selectcustomerPriority(String customerPriority) {
		Select selectcustomerpriority= new Select(customerpriority);
		selectcustomerpriority.selectByVisibleText(customerPriority);
	}
	
	public void clickonsaveandnew() {
		saveandnew.click();	
	}
	
	public void clickonNewViewlink() {
		createnewlink.click();
	}
	
	public void enterintoViewName(String strviewname) {
		viewname.sendKeys(strviewname);
	}
	public void enterintoViewUniqueName(String struniquename) {
		viewuniquename.clear();
		viewuniquename.sendKeys(struniquename);
	}
	public void clickonsavebutton() {
		savebutton.click();
	}
	
	public void validateviewnamedropdown(String strviewname) {
//		Select viewdropdownselect = new Select(viewnamedropdown);
//		viewdropdownselect.selectByVisibleText(strviewname);
		String actualviename = viewnamedropdown.getText();
		String Expectedviewname = strviewname;
		Assert.assertEquals(actualviename, Expectedviewname);
	}
	public void selectviewname(String strviewname) {
		Select viewdropdownselect = new Select(viewnamedropdown);
		viewdropdownselect.selectByVisibleText(strviewname);
	}
	public void clickonEdit() {
		Editlink.click();
	}
	
	public void clickonMergeAccounts() {
		MergeAccounts.click();
	}
	
	public void clickonAccountswithactivitygreaterthan30() {
		Accountswithactivitygreaterthan30.click();
	}
}
