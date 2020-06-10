package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bacht\\eclipse-workspace\\SeleniumBasics\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("bachta17@hotmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("hich123");
		
driver.findElement(By.id("u_0_b")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgot Password?")).click();

		
		
		
		

	}

}
