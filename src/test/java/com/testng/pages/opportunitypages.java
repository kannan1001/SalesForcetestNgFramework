package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.basepage;

public class opportunitypages extends basepage{

	public opportunitypages(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[@title='Opportunities Tab' and contains(text(),'Opportunities')]")
	WebElement opportunitiestab;
	
	@FindBy(xpath="//select[@id='fcf']")
	WebElement viewdropdown;
	
	@FindBy(xpath="//input[@name='new']")
	WebElement NewButton; 
	
	@FindBy(id="opp3")
	WebElement OpportunityName; 
	
	@FindBy(id="opp4")
	WebElement AccountName; 
	
	@FindBy(xpath="//input[@id='opp9']")
	WebElement closeDate; 
	
	@FindBy(xpath="//a[text()='Today']")
	WebElement today; 
	
	@FindBy(xpath="//select[@id='opp11']")
	WebElement stage; 
	
	@FindBy(xpath="//html")
	WebElement page;
	
	@FindBy(xpath="//input[@id='opp12']")
	WebElement probability; 
	
	@FindBy(id="opp6")
	WebElement LeadSource;
	
	@FindBy(id="opp17")
	WebElement PrimaryCampaignSource; 
	
	@FindBy(xpath="//input[@name='save']")
	WebElement saveButton;
	
	@FindBy(xpath="//a[text()='Opportunity Pipeline']")
	WebElement opportunitypipeline; 
	
	@FindBy(xpath="//a[text()='Stuck Opportunities']")
	WebElement stuckOpportunities; 
	
	@FindBy(xpath="//select[@name='quarter_q']")
	WebElement Interval; 
	
	@FindBy(xpath="//select[@id='open']")
	WebElement Include; 
	
	@FindBy(xpath="//input[@value='Run Report']")
	WebElement RunReportButton; 
	
	
	public void clickonviewdropdown() {
		viewdropdown.click();
	}
	
	public void clickonNewButton() {
		NewButton.click();
	}
	
	public void enterintoopprtunityname(String opportunityname) {
		OpportunityName.sendKeys("QA Testing");
	}
	
	public void enterintoAccountName(String accountname) {
		AccountName.sendKeys(accountname);
	}
	
	public void clickonclosedate() {
		closeDate.click();
	}
	
	public void clickontoday() {
		today.click();
	}
	
	public void clickanywhereonpage() {
		page.click();
	}
	
	public void clickonstage() {
		stage.click();
	}
	
	public void selectstage(String stagename) {
		Select stageselect = new Select(stage);
		stageselect.selectByVisibleText(stagename);
	}
	
	public void enterintoprobability(String percentage) {
		probability.clear();
		probability.sendKeys(percentage);
	}
	public void selectLeadSource(String leadsourceoption) {
		LeadSource.click();
		Select leadselect = new Select(LeadSource);
		leadselect.selectByVisibleText(leadsourceoption);
	}
	
	public void eneterintocampaignsource(String campaignName) {
		PrimaryCampaignSource.sendKeys(campaignName);
	}
	
	public void clickonsaveButton() {
		saveButton.click();
	}
	
	public void clickonopportunitypipeline() {
		opportunitypipeline.click();
	}
	
	public void clickonstuckOpportunities() {
		stuckOpportunities.click();
	}
	
	public void selectinterval(String intervalname) {
		Select intervalselect = new Select(Interval);
		intervalselect.selectByVisibleText(intervalname);
	}
	
	public void selectinclude(String includevalue) {
		Select includeselect = new Select(Include);
		includeselect.selectByVisibleText(includevalue);
		//
	}
	public void clickonrunreportbutton() {
		RunReportButton.click();
	}
	
	public void clickonOppotunitiestab() {
		opportunitiestab.click();
	}
}
