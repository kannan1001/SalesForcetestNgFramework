package com.testng.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.basetest;

import com.testng.pages.homepage;
import com.testng.pages.loginpage;
import com.testng.pages.neweventpage;
import com.testng.utilities.ScreenshotUtilities;

public class randomtest extends basetest{

	loginpage loginobj;
	ScreenshotUtilities scrshot;
	homepage homeobj;
	neweventpage neweventobj;
	@BeforeMethod
	public void launchapplication() throws IOException {
		driver = getdriver();
		loginobj = new loginpage(driver);
		homeobj = new homepage(driver);
		scrshot = new ScreenshotUtilities();
		neweventobj = new neweventpage(driver);
	}
	
	@Test
	public void testcase_33() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		homeobj.clickonhometab();
		homeobj.clickonFirstLastName();
		homeobj.verifyNameinhomepageandMyprofilepage();
	}

	@Test
	public void testcase_34() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		homeobj.clickonhometab();
		homeobj.clickonFirstLastName();
		homeobj.clickoneditprofilebutton();
		homeobj.clickonabouttabinEditprofile();
		homeobj.enterintolastname("Abcd");
		homeobj.clickonsaveall();
	}
	
	@Test
	public void testcase_35() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		homeobj.clickonplusicon();
		homeobj.clickoncustomizemytab();
		homeobj.removeoneselectedtab("Cases");
		homeobj.clickonsaveButton();
		homeobj.clickonLogout();
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
	}
	
	@Test
	public void testcase_36() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		homeobj.clickonhometab();
		homeobj.clickoncurrentdatelink();
		homeobj.clickontimelink("8:00 PM");
		Thread.sleep(5000);
		neweventobj.clickonSubjecticonandClickonOthers();
		homeobj.clickonEndtime();
		homeobj.select10EndTime();
		homeobj.clickonsaveButton();
	}
	
	
	@Test
	public void testcase_37() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		homeobj.clickonhometab();
		homeobj.clickoncurrentdatelink();
		homeobj.clickontimelink("8:00 PM");
		Thread.sleep(5000);
		neweventobj.clickonSubjecticonandClickonOthers();
		homeobj.clickonEndtime();
		homeobj.select7Endtime();
		homeobj.clickonRecurrenceCheckBox();
		homeobj.clickonWeeklyRadioButton();
		homeobj.clickonRecurrenceEndDate();
		homeobj.clickonRecurrenceEndDateToday();
		homeobj.clickanywhere();
		homeobj.clickonsaveButton();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
	//	scrShot.takescreenshot(driver);
		
		closedriver();
	}
	
}
