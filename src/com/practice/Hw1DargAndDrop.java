package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class Hw1DargAndDrop extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop =driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		//action.click(drag);
		action.clickAndHold(drag).moveToElement(drop).release().perform();
		//action.dragAndDrop(drag, drop).perform();
		
		Thread.sleep(10000);
		driver.quit();
		
		

	}

}
