package com.testng.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.testng.base.basepage;

public class neweventpage extends basepage{

	public neweventpage(WebDriver driver) {
		super(driver);
	}
	Actions action = new Actions(driver);
	@FindBy(xpath="//img[@class='comboboxIcon']")
	WebElement subjecticon; 
	
	@FindBy(xpath="//li[@class='listItem4']")
	WebElement Others;
	public void clickonSubjecticonandClickonOthers() {
		subjecticon.click();
		Set<String> allwindowhandles = driver.getWindowHandles();
		Iterator<String> iterator = allwindowhandles.iterator();
		String parenthandle = iterator.next();
		String childhandle =iterator.next();
		
		driver.switchTo().window(childhandle);
		waitforelement(Others);
		action.doubleClick(Others).build().perform();
		driver.switchTo().window(parenthandle);
		
	}
	
	
	
	
	

}
