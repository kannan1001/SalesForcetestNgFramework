package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.basepage;

public class forgotpasswordpage extends basepage{
	WebDriver driver;
	
	public forgotpasswordpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="un")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	public void enterintousername(String usrname)
	{
		waitforelement(username);
		username.sendKeys(usrname);
	}
	
	public void clickoncontinue() {
		continuebutton.click();
	}
	
	
}
