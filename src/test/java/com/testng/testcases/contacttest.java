package com.testng.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.basetest;
import com.testng.pages.contactpage;
import com.testng.pages.homepage;
import com.testng.pages.loginpage;
import com.testng.utilities.ScreenshotUtilities;

public class contacttest extends basetest{
	loginpage loginobj;
	contactpage contactobj;
	ScreenshotUtilities scrshot;
	homepage homeobj;
	@BeforeMethod
	public void launchapplication() throws IOException {
		driver = getdriver();
		loginobj = new loginpage(driver);
		contactobj = new contactpage(driver);
		homeobj = new homepage(driver);
		scrshot = new ScreenshotUtilities();
	}
	
	@Test
	public void testcase_25() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		contactobj.clickoncontacttab();
		contactobj.clickonNewButton();
		contactobj.enterintoLastName("columbus");
		contactobj.enterintoAccountName("George");
		contactobj.clickonsaveButton();
	}
	
	@Test
	public void testcase_26() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		contactobj.clickoncontacttab();
		contactobj.clickoncreatenewview();
		contactobj.enterintoviewname("My view 3");
		contactobj.enterintoviewuniquename("");
		contactobj.clickonsaveButton();
	}
	
	@Test
	public void testcase_27() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		contactobj.clickoncontacttab();
		contactobj.selectrecentlycreateddropdown("Recently Created");
	}
	
	@Test
	public void testcase_28() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		contactobj.clickoncontacttab();
		contactobj.selectcontactdropdown("My Contacts");
	}
	
	@Test
	public void testcase_29() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		contactobj.clickoncontacttab();
		contactobj.clickonFirstcontact();
	}
	
	@Test
	public void testcase_30() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		contactobj.clickoncontacttab();
		contactobj.clickoncreatenewview();
		contactobj.enterintoviewuniquename("EFGH");
		contactobj.clickonsaveButton();
	}
	
	@Test
	public void testcase_31() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		contactobj.clickoncontacttab();
		contactobj.clickoncreatenewview();
		contactobj.enterintoviewname("ABCD");
		contactobj.enterintoviewuniquename("EFGH");
		contactobj.clickoncancelbutton();
	}
	

	@Test
	public void testcase_32() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(3000);
		contactobj.clickoncontacttab();
		contactobj.clickonNewButton();
		contactobj.enterintoLastName("Indian");
		contactobj.enterintoAccountName("Global Media)");
		contactobj.clickonsaveandnewbutton();
		
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
	//	scrShot.takescreenshot(driver);
		
		closedriver();
	}
	
}
