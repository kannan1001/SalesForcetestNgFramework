package com.testng.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.basetest;
import com.testng.pages.accountspage;
import com.testng.pages.editpage;
import com.testng.pages.loginpage;
import com.testng.pages.mergepage;
import com.testng.pages.unsavedReportpage;

public class CreateAccounttest extends basetest{
	
	
	
	loginpage loginobj;
	accountspage accountobj;
	editpage editobj;
	mergepage mergeobj;
	unsavedReportpage unsaveReportobj;
	
	@BeforeMethod
	public void launchapplication() throws IOException {
		driver = getdriver();
		loginobj = new loginpage(driver);
		accountobj = new accountspage(driver);
		editobj = new editpage(driver);
		mergeobj = new mergepage(driver);
		unsaveReportobj = new unsavedReportpage(driver);
		
	}

	@Test
	public void testcase_10() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(2000);
		accountobj.clickonAccountstab();
		accountobj.clickonNewbutton();
		accountobj.enterintoaccountname("George3");
		accountobj.selecttype("Technology Partner");
		accountobj.selectcustomerPriority("High");
		accountobj.clickonsaveandnew();
	}
	
	@Test
	public void testcase_11() throws InterruptedException{
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(4000);
		accountobj.clickonAccountstab();
		accountobj.clickonNewViewlink();
		accountobj.enterintoViewName("Mann3");
		accountobj.enterintoViewUniqueName("Manna3");
		accountobj.clickonsavebutton();
		Thread.sleep(5000);
		
	//	accountobj.validateviewnamedropdown("Mann8");
	}
	
	@Test
	public void testcase_12() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(4000);
		accountobj.clickonAccountstab();
		accountobj.selectviewname("Hannah");
		accountobj.clickonEdit();
		editobj.enterviewname("Pargavi");
		editobj.selectfirstfielddropdown("Account Name");
		editobj.selectfirstoperatordropdown("contains");
		editobj.selectvalueFirstDropDown("argavi");
		editobj.availableFields("Last Activity");
		editobj.clickonaddbutton();
		editobj.clickonsavebutton();
	}
	
	@Test
	public void testcase_13() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(4000);
		accountobj.clickonAccountstab();
		accountobj.clickonMergeAccounts();
		mergeobj.enterintomergeaccounttextbox("George");
		mergeobj.clickonfindAccountsbutton();
		mergeobj.clickonFirstTwoAccounts();
		mergeobj.clickonNextButton();
		mergeobj.clickonMergeButton();
		mergeobj.handleAlert();
	}
	
	@Test
	public void testcase_14() throws InterruptedException {
		loginobj.enterintousername("geethu@company.com");
		loginobj.enterintopassword("salesForce1!");
		loginobj.clickonLoginButton();
		Thread.sleep(4000);
		accountobj.clickonAccountstab();
		accountobj.clickonAccountswithactivitygreaterthan30();
		unsaveReportobj.clickondatefield();
		unsaveReportobj.clickoncreatedDate();
		unsaveReportobj.clickonFromDateicon();
		unsaveReportobj.clickontodayButtonfromdate();
		unsaveReportobj.clickonToDateicon();
		unsaveReportobj.clickontodayButtonTodate();
		unsaveReportobj.clickonsaveButton();
		unsaveReportobj.enterintoreportname("Reporta1.1");
		unsaveReportobj.enterintoreportUniquename("Reporta1.1");
		unsaveReportobj.clickonsaveandRunReport();
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		closedriver();
	}
}
