package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bacht\\eclipse-workspace\\SeleniumBasics\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String url="http://newtours.demoaut.com/";
		
		driver.get(url);
		
		driver.findElement(By.linkText("Register here")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("hichem");
		
		driver.findElement(By.name("lastName")).sendKeys("bachtobji");
		
		driver.findElement(By.name("phone")).sendKeys("123 456 789");
		
		driver.findElement(By.id("userName")).sendKeys("Bachtobji.hichem@gmail.com");
		
		driver.findElement(By.name("register")).click();

	}

}
