package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testng.base.basepage;

public class unsavedReportpage extends basepage{

	public unsavedReportpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='dateColumn']")
	WebElement dateField;
	
	@FindBy(xpath="//div[text()='Created Date']")
	WebElement createdDate;
	
	@FindBy(xpath="//img[@id='ext-gen152']")
	WebElement FromDateicon;
	
	@FindBy(xpath="//button[text()='Today']")
	WebElement todayButtonfromdate;
	
	@FindBy(xpath="//*[@id=\"ext-comp-1045\"]")
	WebElement toDatetext;
	
	@FindBy(xpath="//*[@id=\"ext-gen154\"]")
	WebElement toDateicon;
	
	@FindBy(xpath="(//button[text()='Today'])[2]")
	WebElement todayButtontodate;
	
	@FindBy(xpath="//*[@id=\"ext-gen49\"]")
	WebElement saveButton;
	
	@FindBy(xpath="//*[@id=\"saveReportDlg_reportNameField\"]")
	WebElement ReportName; 
	
	
	@FindBy(xpath="//*[@id=\"saveReportDlg_DeveloperName\"]")
	WebElement ReportUniqueName;
	
	@FindBy(xpath="//button[text()='Save and Run Report']")
	WebElement saveandRunReport; 
	
	
	public void clickondatefield() {
		dateField.click();
	}
	
	public void clickoncreatedDate() {
		createdDate.click();
	}
	
	public void clickonFromDateicon() {
		FromDateicon.click();
	}

	public void clickontodayButtonfromdate() {
		waitforelement(todayButtonfromdate);
		todayButtonfromdate.click();
	}
	
	public void clickonToDateicon() {
	//	toDatetext.clear();
		toDateicon.click();
	}

	public void clickontodayButtonTodate() {
		waitforelement(todayButtontodate);
		todayButtontodate.click();
	}
	public void clickonsaveButton() {
		saveButton.click();
	}
	
	public void enterintoreportname(String reportname) {
		waitforelement(ReportName);
		ReportName.sendKeys(reportname);
	}
	public void enterintoreportUniquename(String reportUniqname) {
		ReportUniqueName.sendKeys(reportUniqname);
	}
	
	public void clickonsaveandRunReport() {
		waitforelement(saveandRunReport);
		saveandRunReport.click();
	}
}
