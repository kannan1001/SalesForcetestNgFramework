package com.testng.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.basepage;

public class usermenupage extends basepage{

	public usermenupage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="userNavLabel")
	WebElement userMenuButton;
	
	@FindBy(xpath="//a[text()= 'My Profile']")
	WebElement MyProfile;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement Logoutbutton;
	
	@FindBy(xpath="//a[@title='My Settings']")
	WebElement MySettings;
	
	@FindBy(xpath="//a[text()='Developer Console']")
	WebElement DeveloperConsole;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement Logout;
	
	
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
	public void clickonDeveloperConsoleAndClose() throws InterruptedException {
		DeveloperConsole.click();
		Thread.sleep(3000);
		Set<String> allwindowhandles = driver.getWindowHandles();
		Iterator<String> iterator = allwindowhandles.iterator();
		String parenthandle = iterator.next();
		String childhandle =iterator.next();
		Thread.sleep(3000);
		driver.switchTo().window(childhandle);
		driver.close();
		driver.switchTo().window(parenthandle);
	}
	
	public void clickonLogout() {
		Logout.click();
	}
}
