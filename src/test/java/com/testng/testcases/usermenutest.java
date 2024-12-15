package com.testng.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testng.base.basetest;
import com.testng.pages.loginpage;
import com.testng.pages.usermenupage;
import com.testng.pages.profilepage;
public class usermenutest extends basetest{
	
	WebDriver driver;
	loginpage login;
	usermenupage user;
	profilepage propage;
	
	@BeforeMethod
	public void launchapplication() throws IOException {
		driver = getdriver();
		login = new loginpage(driver);
		user = new usermenupage(driver);
		propage = new profilepage(driver);
	}
	@Test
	@Parameters({"validusername","validpassword"})

	public void testcase_5(String validusername,String validpassword) {
		login.enterintousername(validusername);
		login.enterintopassword(validpassword);
		login.clickonLoginButton();
		user.clickonuserMenuButton();
	}
	
	@Test
	public void testcase_6() {
		login.enterintousername("geethu@company.com");
		login.enterintopassword("salesForce1!");
		login.clickonLoginButton();
		user.clickonuserMenuButton();
		user.clickonMyProfile();

		propage.clickoncontactEditButton();
		propage.clickonabouttab();	
		propage.enterintolastname("Kanna");
		propage.clickonsaveAll();
		propage.switchtodefaultwindow();

		propage.clickonpost();
		propage.switchtopostFrame();
		propage.enterintoposttextbox("Today is a Excellent opportunity to learn something new.");
		propage.switchtodefaultwindow();
		propage.clickonsharebutton();
		
		propage.clickonFilelink();
		propage.clickonuploadfromcomputer();
		propage.sendfilelocation("/Users/geerthanakannan/Documents/smiley.jpeg");
		propage.clickonsharebutton();
		propage.clickonupdateprofilepic();
		propage.switchtophotoiFrame();
		
		propage.chooseProfilepicFile("/Users/geerthanakannan/Documents/smiley.jpeg");
		propage.clickphotobeforeuploadsave();
		propage.img_crop();
		propage.clickoncropsavebutton();
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		closedriver();
	}
}
