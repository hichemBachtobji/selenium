package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bacht\\eclipse-workspace\\SeleniumBasics\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://google.com");
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.close();

	}

}
