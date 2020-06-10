package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo3 extends BaseClass{

	public static void main(String[] args) {
		
		setUp();//In properties file, uncomment demoqa.com URL (code written for demoqa.com).
		
		WebElement continents = driver.findElement(By.id("continents"));
		
		Select select =new Select(continents);
		
		boolean isMultiple=select.isMultiple();
		System.out.println("continents is multiple "+isMultiple);
		
		select.selectByValue("AUS");//AUS is the value of Value attribute in the DOM
		
		List<WebElement> options=select.getOptions();//returns list of all options
		
		Iterator<WebElement> it =options.iterator();//Storing it in Iterator
		
		while(it.hasNext()) {//If there is next value, get the text of it
			it.next().click();
			it.next().getText();
			
		}
		
		tearDown();
		
	}

}
