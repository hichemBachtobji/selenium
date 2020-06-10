package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LoginWithFunctions extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		

	}

}
