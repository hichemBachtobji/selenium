package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		String signUpTitle=driver.getTitle();
		System.out.println("Main Page Title is :: "+signUpTitle);
		
		driver.findElement(By.linkText("Help")).click();
		
		/*
		 * How to get window handle?
		 * In Selenium we have two method to get the hand of window
		 * getWindowHandle();
		 * getWindowHandles();
		 * 
		 */
		
		Set<String >allWindowHandles=driver.getWindowHandles();
		//Returns set of string IDs of all windows currently opened by the current instance.
		
		
		System.out.println("Number of windows opened are "+allWindowHandles.size());//get size of set
		
		Iterator<String> it=allWindowHandles.iterator();
		
		String mainWindowHandle=it.next();//returns the id of main window
		System.out.println("Id of main window : "+mainWindowHandle);
		
		String childWindowHandle= it.next();//returns the id of child window
		System.out.println("id of child window "+childWindowHandle);
		
		//using switchTo method we switch to another window by passing the handle/id of window 
		
		driver.switchTo().window(childWindowHandle);
		String childWithTitle= driver.getTitle();
		System.out.println("child page title is : "+childWindowHandle);
		driver.close();
		
	}
	 
}
