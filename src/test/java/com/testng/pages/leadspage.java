package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.basepage;

public class leadspage extends basepage{

	public leadspage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Leads']")
	WebElement LeadsTab; 
	
	@FindBy(xpath="//select[@id='fcf']")
	WebElement view; 
	
	@FindBy(xpath="(//input[@name='go'])[1]")
	WebElement Gobutton; 
	
	@FindBy(xpath="//input[@name='new']")
	WebElement NewButton; 
	
	@FindBy(xpath="//input[@id='name_lastlea2']")
	WebElement lastName; 
	
	@FindBy(xpath="//input[@name='lea3']")
	WebElement companyName; 
	
	@FindBy(xpath="//input[@name='save']")
	WebElement saveButton; 
	
	public void clickonLeadsTab() {
		waitforelement(LeadsTab);
		LeadsTab.click();
	}
	
	public void clickonviewdropdown() {
		view.click();
	}
	
	public void selectview(String viewname) {
		Select viewselect = new Select(view);
		viewselect.selectByVisibleText(viewname);
	}
	public void clickonGobutton() {
		Gobutton.click();
	}

	public void clickonNewButton() {
		NewButton.click();
	}
	
	public void enterintolastname(String lname) {
		lastName.sendKeys(lname);
	}
	public void enterintocompanyname(String companyname) {
		companyName.sendKeys(companyname);
	}
	public void clickonsavebutton() {
		saveButton.click();
	}
}
