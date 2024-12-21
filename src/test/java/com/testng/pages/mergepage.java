package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.basepage;

public class mergepage extends basepage{

	public mergepage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='srch']")
	WebElement mergeaccounttextbox;  
	
	@FindBy(name="srchbutton")
	WebElement findAccounts; 
	
	@FindBy(xpath="//input[@id='cid0']")
	WebElement firstcheckbox;
	
	
	@FindBy(xpath="//input[@id='cid1']")
	WebElement secondcheckbox;
	
	@FindBy(xpath="//input[@value=' Next ']")
	WebElement NextButton; 
	
	
	
	@FindBy(xpath="//input[@value=' Merge ']")
	WebElement MergeButton; 
	
	
	
	
	public void enterintomergeaccounttextbox(String mergeaccountname) {
		mergeaccounttextbox.sendKeys(mergeaccountname);
	}
	
	public void clickonfindAccountsbutton() {
		findAccounts.click();
	}
	
	public void clickonFirstTwoAccounts() {
		firstcheckbox.click();
		secondcheckbox.click();
	}
	public void clickonNextButton() {
		NextButton.click();
	}
	
	public void clickonMergeButton() {
		MergeButton.click();
	}

	public void handleAlert() {
		acceptAlert();
	}
	
}
