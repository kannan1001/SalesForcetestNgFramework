package com.testng.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public String getproperties(String key) throws IOException {
		String userDir = System.getProperty("user.dir");
		String filepath = userDir+"/application.properties";
		FileInputStream fileinput = new FileInputStream(filepath);
		Properties prop = new Properties();
		prop.load(fileinput);
		String value = prop.getProperty(key);
		return value;
	}
	
	
}
