package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

/*
 * TC 1: Verify element is clickable
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Select checkbox and click Remove
Click on Add button and verify “It's back!” text is displayed   
Close the browser 

 */

public class Task1clickable {

	public static void main(String[] args) {
		
		WebDriver driver=BaseClass.setUp();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement DControl=driver.findElement(By.linkText("Dynamic Controls"));
		DControl.click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		WebElement add=driver.findElement(By.xpath("//button[text()='Add']"));
		add.click();
		
		boolean addIsDisplayed=add.isDisplayed();
		System.out.println("add is diplayed ? "+addIsDisplayed);
		
		boolean ItsBack=driver.findElement(By.id("message")).isDisplayed();
		System.out.println("it's back text is displayed? "+ItsBack);
		
		

	}

}
