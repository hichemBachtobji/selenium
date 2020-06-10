package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	/*
	 * TC 1: Amazon Page Title Verification: 
Open chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
TC 2: Opening Page on Firefox Browser
Open Firefox browser
Navigate to “https://www.redfin.com/”
Verify that you have navigated to (https://www.redfin.com/)
End the Session (close the browser).

	 */

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bacht\\eclipse-workspace\\SeleniumBasics\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		
	//	String actual=driver.getCurrentUrl();
		
	//	String expected= "https://amazon.com";
		
//		String title=driver.getTitle();
//		System.out.println(title);
		
		String actual= driver.getCurrentUrl();
		
		String expected="https://amazon.com";
		
		if(actual.equalsIgnoreCase(expected)) {
		String title1 =driver.getTitle();
			System.out.println(title1);
		}else {
			System.out.println("wrong website");
		}
	
	}

}
