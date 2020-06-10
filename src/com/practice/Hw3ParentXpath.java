package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Hw3ParentXpath extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement userName = driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		sendText(userName, ConfigsReader.getProperty("userName"));
		
		WebElement password = driver.findElement(By.xpath("//div[@id='divPassword']/input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		WebElement login = driver.findElement(By.xpath("//div[@id='divLoginButton']/input"));
		click(login);
		
		
		
	}

}
