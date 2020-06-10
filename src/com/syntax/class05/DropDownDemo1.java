package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement weekDD=driver.findElement(By.id("select-demo"));
		
		Select select = new Select(weekDD);
		
		/*
		 * Selenium provides three different ways to select a value from a DD. 1.
		 * 1. byIndex();
		 * 2. ByVisibleText(String str);
		 * 3. ByValue();
		 */
		
		List<WebElement> option=select.getOptions();
		
		System.out.println("number of options in the drop down is "+option.size());
		
		//select.selectByIndex(3);
		
		
		for(int i=0;i<option.size();i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		select.selectByVisibleText("Friday");//can select an option by Visible text.
		//In the parameter provide the text Visible on UI.
		
		Thread.sleep(2000);
		tearDown();

	}

}
