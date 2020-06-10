package com.syntax.hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginToHrms {

	public static void main(String[] args) throws IOException {


		String filePath=System.getProperty("user.dir")+"/configs/Configuration.properties";
		
		FileInputStream fis= new FileInputStream(filePath);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browser =prop.getProperty("browser");
		
		 switch (browser) {
		 case "chrome":
			 System.setProperty("webdriver.chrome.driver"," /drivers/chromedriver");
			 break;
		 case "firefox":
			 System.getProperty("webdriver.gecko.driver", "/drivers/gecko");
			 break;
		 }
		
		
		

	}

}
