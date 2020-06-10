package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HWFileHandling {
	
    //public static String driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String filePath=System.getProperty("user.dir")+"/configs/HWFileHandle.properties";
		System.out.println(filePath);
		//String filePath1="C:\\Users\\bacht\\eclipse-workspace\\SeleniumBasics\\configs\\HWFileHandle.properties.exe";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		WebDriver driver=null;
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver =new FirefoxDriver();
			break;
		}
		driver.get(prop.getProperty("url"));
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.name("customerName")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.id("ap_email")).sendKeys("Bachtobji.hichem@gmail.com");
		driver.findElement(By.cssSelector("input[id= 'ap_password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("ap_password_check")).sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("input[id= 'continue']")).click();
		

	}

}
