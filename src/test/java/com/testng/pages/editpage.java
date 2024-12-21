package com.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testng.base.basepage;

public class editpage extends basepage{

	public editpage(WebDriver driver) {
		super(driver);
		
	}
	WebDriverWait wait = new WebDriverWait(driver,5);
	Actions action = new Actions(driver);
	
	@FindBy(xpath="//input[@id='fname']")
	WebElement Editviewname; 
	
	@FindBy(xpath="//select[@id='fcol1']")
	WebElement FieldFirstDropDown; 
	
	@FindBy(xpath="//select[@id='fop1']")
	WebElement operatorFirstDropDown;
	
	@FindBy(xpath="//input[@id='fval1']")
	WebElement valueFirstDropDown;
	
	@FindBy(xpath="//select[@id='colselector_select_0']")
	WebElement AvailableFields;
	
	@FindBy(xpath="(//img[@class='rightArrowIcon'])[1]")
	WebElement Addbutton; 
	
	@FindBy(xpath="(//input[@name='save'])[1]")
	WebElement saveButton; 
	
	
	public void enterviewname(String newviewname) {
		Editviewname.clear();
		Editviewname.sendKeys(newviewname);
		
	}
	
	public void selectfirstfielddropdown(String fieldvalue) {
		Select firstfielddropdown = new Select(FieldFirstDropDown);
		firstfielddropdown.selectByVisibleText(fieldvalue);
	}
	
	public void selectfirstoperatordropdown(String operatorvalue) {
		Select operatordropdown =  new Select(operatorFirstDropDown);
		operatordropdown.selectByVisibleText(operatorvalue);
	}

	public void selectvalueFirstDropDown(String value) {
		valueFirstDropDown.clear();
		valueFirstDropDown.sendKeys(value);
	}
	
	public void availableFields(String availablefieldvalue) {
	//	wait.until(ExpectedConditions.elementToBeClickable(AvailableFields));
		waitforelement(AvailableFields);
		action.moveToElement(AvailableFields).build().perform();
		
		Select AvailableFieldsselect = new Select(AvailableFields);
		
		AvailableFieldsselect.selectByVisibleText(availablefieldvalue);
	}
	
	public void clickonaddbutton() {
		Addbutton.click();
	}
	public void clickonsavebutton() {
		saveButton.click();
	}
}
