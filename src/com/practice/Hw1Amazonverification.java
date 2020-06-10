package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

/*
 * 1: Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department 
Select Computers
Quit browser

 */

public class Hw1Amazonverification extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement searchDD=driver.findElement(By.id("searchDropdownBox"));
		
		
		Select select=new Select(searchDD);
		
		List<WebElement> options=select.getOptions();
		
		int count=0;
		for (WebElement option : options) {
			String texts=option.getText();
			if(option.isEnabled()) {
				count++;
				System.out.println(texts);
			}
			
			select.selectByVisibleText("Computers");
			
//			if(texts.equals("Computers")) {
//				Thread.sleep(2000);
//				option.click();
//				System.out.println(texts+" is selected");
//			}
		
		}
		int size =options.size();
		System.out.println("number of option department is "+size);
		System.out.println("number of option department with count "+count);
		
		//tearDown();
	
	}

}
