package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Hw4SiblingsJsExecuter extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement userName = driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
		sendText(userName, ConfigsReader.getProperty("userName"));
		
		WebElement password = driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		WebElement login = driver.findElement(By.xpath("//div[@id='divPassword']/following-sibling::div/input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", login);
		

	}

}
