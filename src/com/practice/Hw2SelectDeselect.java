package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

/*
 * TC 2: Select and Deselect values
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Select Dropdown List” links
Select value from “Select List Demo” section
Verify value has been selected
Select 4 options from “Multi Select List Demo”
Deselect 1 of the option from the dd
Quit browser

 */

public class Hw2SelectDeselect extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		

		setUp();
		
		WebElement inputForm=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		
		inputForm.click();
		WebElement SelectDropDownList=driver.findElement(By.linkText("Select Dropdown List"));
		SelectDropDownList.click();
		
		WebElement SelectListDemo = driver.findElement(By.id("select-demo"));
		
		Select select =new Select(SelectListDemo);
		
		List<WebElement> options=select.getOptions();
		
		for (WebElement option : options) {
			//option.getText();
			select.selectByVisibleText("Tuesday");
			Thread.sleep(2000);
			option.click();
			
			boolean mondaySelected=option.isSelected();
			if(mondaySelected) {
				System.out.println("Tuesday is selected "+mondaySelected);
				break;
			}
		
		}
		
		WebElement multiSelectDemo= driver.findElement(By.id("multi-select"));
		
		Select select1= new Select(multiSelectDemo);
		
		List<WebElement> options1=select1.getOptions();
		
		for (WebElement option1 : options1) {
			
			select1.selectByVisibleText("California");
			//option1.click();
			select1.selectByVisibleText("Ohio");
			//option1.click();
			select1.selectByValue("Texas");
			//option1.click();
			select1.selectByVisibleText("New York");
			option1.click();
			
			break;
		}
		select1.deselectByVisibleText("California");
		System.out.println();
	}

}
