package com.testng.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.basetest;
import com.testng.pages.loginpage;
import com.testng.pages.opportunitypages;
import com.testng.utilities.ScreenshotUtilities;

public class CreateOpportunitytest extends basetest{

	loginpage login;
	opportunitypages opportunityobj;
	ScreenshotUtilities scrShot;
	@BeforeMethod
	public void launchApplication() throws IOException {
		driver = getdriver();
		login = new loginpage(driver);
		opportunityobj = new opportunitypages(driver);
		scrShot = new ScreenshotUtilities();
	}
	
	@Test
	public void testcase_15() throws InterruptedException {
		login.enterintousername("geethu@company.com");
		login.enterintopassword("salesForce1!");
		login.clickonLoginButton();
		Thread.sleep(3000);
		opportunityobj.clickonOppotunitiestab();
		opportunityobj.clickonviewdropdown();
	}
	
	@Test
	public void testcase_16() throws InterruptedException {
		login.enterintousername("geethu@company.com");
		login.enterintopassword("salesForce1!");
		login.clickonLoginButton();
		Thread.sleep(3000);
		opportunityobj.clickonOppotunitiestab();
		opportunityobj.clickonNewButton();
		opportunityobj.enterintoopprtunityname("QA Automation");
		opportunityobj.enterintoAccountName("George");
		opportunityobj.clickonclosedate();
		opportunityobj.clickontoday();
		opportunityobj.clickanywhereonpage();
		opportunityobj.clickonstage();
		opportunityobj.selectstage("Qualification");
		opportunityobj.clickanywhereonpage();
		opportunityobj.enterintoprobability("80");
		opportunityobj.selectLeadSource("Web");
		opportunityobj.eneterintocampaignsource("campaign1");
		opportunityobj.clickonsaveButton();
	}
	
	@Test
	public void testcase_17() throws InterruptedException {
		login.enterintousername("geethu@company.com");
		login.enterintopassword("salesForce1!");
		login.clickonLoginButton();
		Thread.sleep(3000);
		opportunityobj.clickonOppotunitiestab();
		opportunityobj.clickonopportunitypipeline();
	}
	
	@Test
	public void testcase_18() throws InterruptedException {
		login.enterintousername("geethu@company.com");
		login.enterintopassword("salesForce1!");
		login.clickonLoginButton();
		Thread.sleep(3000);
		opportunityobj.clickonOppotunitiestab();
		opportunityobj.clickonstuckOpportunities();
	}
	
	@Test
	public void testcase_19() throws InterruptedException {
		login.enterintousername("geethu@company.com");
		login.enterintopassword("salesForce1!");
		login.clickonLoginButton();
		Thread.sleep(3000);
		opportunityobj.clickonOppotunitiestab();
		opportunityobj.selectinterval("Current and Next FQ");
		opportunityobj.selectinclude("Open Opportunities");
		opportunityobj.clickonrunreportbutton();
		
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
	//	scrShot.takescreenshot(driver);
		closedriver();
	}
}
