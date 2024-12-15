package com.testng.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtilities {

	WebDriver driver;
	public void takescreenshot(WebDriver driver) {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		String userDir = System.getProperty("user.dir");
		Date current = new Date();
		
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(current);
		
		String filepath = userDir+"/screenshot/screenshot"+timestamp+".jpeg";
		
		File desFile = new File(filepath);
		
		try {
			FileUtils.copyFile(srcFile, desFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
