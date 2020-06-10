package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class Task2Enabled {

	public static void main(String[] args) {
WebDriver driver=BaseClass.setUp();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement DControl=driver.findElement(By.linkText("Dynamic Controls"));
		DControl.click();
		
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
		WebElement hello=driver.findElement(By.xpath("//input[@type='text']"));
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(hello));
		hello.sendKeys("Hello");
		
		boolean textIsEnable=hello.isEnabled();
		System.out.println(textIsEnable);
		
		if(textIsEnable) {
			System.out.println("test case pass");
		}else {
			System.out.println("text case fail");
		}

	}

}
