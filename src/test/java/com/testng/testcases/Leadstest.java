package com.testng.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.basetest;
import com.testng.log.Log;

import com.testng.pages.leadspage;
import com.testng.pages.loginpage;
import com.testng.pages.usermenupage;
import com.testng.utilities.ScreenshotUtilities;

public class Leadstest extends basetest{
	loginpage loginobj;
	leadspage leadsobj;
	usermenupage userobj;
	ScreenshotUtilities scrshot;
	@BeforeMethod
	public void launchapplication() throws IOException {
		driver = getdriver();
		loginobj = new loginpage(driver);
		leadsobj = new leadspage(driver);
		scrshot = new ScreenshotUtilities();
		userobj = new usermenupage(driver);
	}
	
	@Test
	public void testcase_20() {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		leadsobj.clickonLeadsTab();
	}
	
	@Test
	public void testcase_21() {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		leadsobj.clickonLeadsTab();
		leadsobj.clickonviewdropdown();
	}
	
	@Test
	public void testcase_22() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		leadsobj.clickonLeadsTab();
		leadsobj.clickonviewdropdown();
		leadsobj.selectview("Today's Leads");
		userobj.clickonuserMenuButton();
		userobj.clickonlogout();
		Thread.sleep(3000);
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		leadsobj.clickonLeadsTab();
		leadsobj.clickonGobutton();
	}
	
	@Test
	public void testcase_23() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		leadsobj.clickonLeadsTab();
		leadsobj.clickonviewdropdown();
		leadsobj.selectview("Today's Leads");
		leadsobj.clickonGobutton();
	}
	
	@Test
	public void testcase_24() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		leadsobj.clickonLeadsTab();
		leadsobj.clickonNewButton();
		leadsobj.enterintolastname("Abcd");
		leadsobj.enterintocompanyname("Abcd");
		leadsobj.clickonsavebutton();
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
	//	scrShot.takescreenshot(driver);
		Log.endTestCase("Testcase Ended");
		closedriver();
	}

}
