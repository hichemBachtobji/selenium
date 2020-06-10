package com.practice;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Hw2FrameVerification {

	public static void main(String[] args) {
		
		WebDriver driver=BaseClass.setUp();
		
		WebElement othersDD=driver.findElement(By.linkText("Others"));
		othersDD.click();
		
		WebElement frameDD=driver.findElement(By.linkText("Iframe"));
		frameDD.click();
		
		driver.switchTo().frame("FrameOne");
		boolean logoIsDiplayed =driver.findElement(By.xpath("//img[@id='hide']")).isDisplayed();
		System.out.println("logo is displayed? "+logoIsDiplayed);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean logoFrame2=driver.findElement(By.className("custom-logo")).isDisplayed();
		System.out.println("logo frame 2 is displayed? "+logoFrame2);
		driver.switchTo().defaultContent();
		

	}

}
