package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		
		String singUpTitle=driver.getTitle();
		System.out.println("Main Page Title is:: "+singUpTitle);
		
		String parentWindowHandle= driver.getWindowHandle();//grab the handle of parent window
		System.out.println("what is the parent window handle ? "+parentWindowHandle);
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();

		Set<String> allWindowsHandles=driver.getWindowHandles();//returns set if window handle of all windows 
		System.out.println("what is the number of window opened? "+allWindowsHandles.size());
		
		Iterator<String> it = allWindowsHandles.iterator();
		while(it.hasNext()) {
			String handle = it.next();
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(2000);
				
			}
		}
		
		driver.quit();

	}

}
