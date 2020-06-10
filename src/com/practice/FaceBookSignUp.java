package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class FaceBookSignUp extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement firstName=driver.findElement(By.name("firstname"));
		sendText(firstName, ConfigsReader.getProperty("userName"));
		
		WebElement lastName=driver.findElement(By.name("lastname"));
		sendText(lastName, "bachtobji");
		
		WebElement email=driver.findElement(By.name("reg_email__"));
		sendText(email, "bachtobji.hichem@gmail.com");
		
		WebElement emailConfirm=driver.findElement(By.name("reg_email_confirmation__"));
		sendText(emailConfirm, "bachtobji.hichem@gmail.com");
		
		
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		WebElement month=driver.findElement(By.id("month"));
		selectDdValue(month,"Apr");
		
		WebElement day=driver.findElement(By.id("day"));
		selectDdValue(day,"17");
		
		
		WebElement year=driver.findElement(By.id("year"));
		selectDdValue(year,100);
		
		List<WebElement> radioB= driver.findElements(By.name("sex"));
		
		Thread.sleep(2000);
		clickRadioOrCheckbox(radioB, "2");
		
		Thread.sleep(1000);

	}

}
