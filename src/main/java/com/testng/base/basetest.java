package com.testng.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.testng.utilities.PropertiesReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {

	WebDriver driver;
	PropertiesReader propreader = new PropertiesReader();
	
	public WebDriver getdriver() throws IOException {
		if(driver == null) {
			
		//	propreader.getproperties(browser)
			if(propreader.getproperties("browser").equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(propreader.getproperties("browser").equalsIgnoreCase("Firefox")) {
				WebDriverManager.chromedriver().setup();
				driver = new FirefoxDriver();
			}
			
		}
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		return driver;
		
	}
	
	public void closedriver() {
		driver.close();
		driver = null;
	}
}
