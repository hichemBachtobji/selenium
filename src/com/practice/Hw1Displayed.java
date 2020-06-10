package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1Displayed {
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement logo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		boolean l=logo.isDisplayed();
		System.out.println("logo is displayed: "+l);
		
		logo.click();
		if (logo.isDisplayed()) {
			System.out.println("logo is diplayed");
		}else {
			System.out.println("logo is not displayed");
		}
	
	}

}
