package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class HwDropDown extends BaseClass {

	public static void main(String[] args) {
		setUp();
		
		WebElement month=driver.findElement(By.id("month"));
		Select m=new Select(month);
		m.selectByValue("4");
		
		WebElement day=driver.findElement(By.id("day"));
		Select d= new Select(day);
		d.selectByValue("17");
		
		WebElement year=driver.findElement(By.id("year"));
		Select y= new Select(year);
		y.selectByValue("1989");
		
		tearDown();
		
		

	}

}
