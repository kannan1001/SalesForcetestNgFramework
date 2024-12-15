package com.testng.testcases;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testng.base.basetest;
import com.testng.log.Log;
import com.testng.pages.forgotpasswordpage;
import com.testng.pages.loginpage;
import com.testng.pages.usermenupage;
import com.testng.utilities.ScreenshotUtilities;

public class logintest extends basetest{

	WebDriver driver;
	loginpage login;
	usermenupage userobj;
	forgotpasswordpage forgotobj;
	ScreenshotUtilities scrShot = new ScreenshotUtilities();
	//Log log = new Log();
	@BeforeMethod
	public void launchapplication() throws IOException {
		driver = getdriver();
		login = new loginpage(driver);
		userobj = new usermenupage(driver);
		forgotobj = new forgotpasswordpage(driver);
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("testcase Started");
	}
	
	@Test(priority=1)
	@Parameters({"validusername"})
	public void testcase_1(String validusername) {
		
		login.enterintousername(validusername);
		login.clearpassword();
		login.clickonLoginButton();
		
	}
	
	@Test(priority = 2)
	@Parameters({"validusername","validpassword"})
	public void testcase_2(String validusername,String validpassword) {
		login.enterintousername(validusername);
		login.enterintopassword(validpassword);
		login.clickonLoginButton();
	}
	
	@Test(priority = 3)
	@Parameters({"validusername","validpassword"})
	public void testcase_3(String validusername,String validpassword) {
		login.enterintousername(validusername);
		login.enterintopassword(validpassword);
		login.clickonRememberMe();
		login.clickonLoginButton();
		userobj.clickonuserMenuButton();
		userobj.clickonlogout();
	}
	
	@Test()
//	@Parameters({"invalidusername1"})
	public void testcase_4a() {
		login.clickonForgotPassword();
		forgotobj.enterintousername("notauser@company.com");
		forgotobj.clickoncontinue();
	}
	
	
	@Test(priority = 5)
	@Parameters({"invalidusername","invalidpassword"})
	public void testcase_4b(String invalidusername,String invalidpassword) {
		login.enterintousername(invalidusername);
		login.enterintopassword(invalidpassword);
		login.clickonLoginButton();
	}
	
	
	@AfterMethod
	public void teardown() {
	//	scrShot.takescreenshot(driver);
		Log.endTestCase("Testcase Ended");
		closedriver();
	}
	
}
