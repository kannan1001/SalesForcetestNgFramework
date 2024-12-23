package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.basepage;

public class loginpage extends basepage{

	public loginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id = "Login")
	WebElement LoginButton;
	
	@FindBy(id = "rememberUn")
	WebElement rememberMecheckbox;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot Your Password?')]")
	WebElement ForgotPassword;
	
	
	
	public void enterintousername(String usrname) {
		username.sendKeys(usrname);
	}
	
	public void enterintopassword(String pswrd) {
		password.sendKeys(pswrd);
	}
	
	public void clearpassword() {
		password.clear();
	}
	
	public void clickonLoginButton() {
		LoginButton.click();
	}
	
	public void clickonRememberMe() {
		rememberMecheckbox.click();
	}
	
	public void clickonForgotPassword() {
		ForgotPassword.click();
	}
	
	
}
