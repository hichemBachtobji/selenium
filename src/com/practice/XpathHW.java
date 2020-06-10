package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHW {
public static String url="http://www.newtours.demoaut.com/";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("hich");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("bach");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("20222774433");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("bachta17@hotmail.fr");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("5142 macarthur blvd");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("washington");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("DC");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("20011");
		driver.findElement(By.xpath("//select[@name='country']//option[@value='77']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hichbach");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hich123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("hich123");
		driver.findElement(By.xpath("//input[@type='image']")).click();
		
		
		
		
		
		

	}

}
