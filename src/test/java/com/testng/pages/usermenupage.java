package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.basepage;

public class usermenupage extends basepage{

	public usermenupage(WebDriver driver) {
		super(driver);
	}

	WebDriver driver;
	
	@FindBy(id="userNavLabel")
	WebElement userMenuButton;
	
	@FindBy(xpath="//a[text()= 'My Profile']")
	WebElement MyProfile;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement Logoutbutton;
	
	@FindBy(xpath="//a[@title='My Settings']")
	WebElement MySettings;
	
	public void clickonuserMenuButton() {
		waitforelement(userMenuButton);
		userMenuButton.click();
	}
	
	public void clickonlogout() {
		Logoutbutton.click();
	}
	public void clickonMyProfile() {
		MyProfile.click();
	}
	
	public void clickonMySettings() {
		MySettings.click();
	}
}
