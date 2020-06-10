package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2IsEmptyDisplayed {
	
	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		WebElement pass= driver.findElement(By.xpath("//span[@id='spanMessage']"));
		boolean p=pass.isDisplayed();
		System.out.println("message wrong password is displayed "+p);
		
		if(pass.isDisplayed()) {
			System.out.println("message wrong password is displayed");
		}else {
			System.out.println("message wrong password is NOT displayed");
		}

}
}
