package com.practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Hw1Alert  {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= BaseClass.setUp();
		
		List<WebElement> headerDD=driver.findElements(By.className("dropdown-toggle"));
		
		for (WebElement webElement : headerDD) {
			
			String textDD=webElement.getText();
			if (textDD.equals("Alerts & Modals")){
				webElement.click();
			}
			
		}
		
		WebElement JavascriptAlert= driver.findElement(By.linkText("Javascript Alerts"));
		JavascriptAlert.click();
		
		WebElement AlertBox= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		Thread.sleep(2000);
		AlertBox.click();
		
		Alert alert=driver.switchTo().alert();
		String textAlert=alert.getText();
		if(textAlert.equals("I am an alert box!")) {
			System.out.println("text alert is valid :"+ textAlert);
			alert.accept();
		}
		
		WebElement promptText= driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		promptText.click();
		
		Alert alert1= driver.switchTo().alert();
		String textAlert1=alert.getText();
		if(textAlert1.equals("Please enter your name")) {
		      System.out.println("prompt butoon is selected"+textAlert1);
		      Thread.sleep(3000);
		      alert1.sendKeys("hichem");
		      Thread.sleep(3000);
		      alert1.accept();
		}
		Thread.sleep(10000);
		BaseClass.tearDown();
		
		

	}

}
