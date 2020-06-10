package com.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

/*
 * TC 3: Windows Handling
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Javascript Alerts” link
Click on “Window Popup Modal” link
Click on the “ Follow On Instagram” button
Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos” 
Click on the “Like us On Facebook ” button
Verify title of the page is “Go to Facebook Home” 
Quit the browser
NOTE: Selenium execution could be too fast, please use Thread.sleep or selenium waits.

 */

public class Task3WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BaseClass.setUp();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement AlertModals=driver.findElement(By.linkText("Alerts & Modals"));
		AlertModals.click();
		
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);
		WebElement popUpModel= driver.findElement(By.linkText("Window Popup Modal"));
		popUpModel.click();
		WebElement FollowInstagram =driver.findElement(By.xpath("//a[text()='  Follow On Instagram ']"));
		FollowInstagram.click();
		

		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> it = allwindows.iterator();
		while(it.hasNext()) {
			String handle=it.next();
			if(!handle.equals(ParentWindow)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
			}
			
		}
		
		Thread.sleep(3000);
		
		driver.switchTo().window(ParentWindow);
		
		WebElement fb=driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		fb.click();
		Set<String> fbID=driver.getWindowHandles();
		 Iterator<String> itfb = fbID.iterator();
		String fbook = itfb.next();
		String childFB=itfb.next();
		driver.switchTo().window(childFB);
		System.out.println(driver.getTitle());
		
		Thread.sleep(10000);
		driver.quit();
	
	}

}
