package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class HwReview extends BaseClass{

	public static void main(String[] args) {


		setUp();
		
		WebElement searchDD=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select books=new Select(searchDD);
		
		List<WebElement> options=books.getOptions();
		
		for (WebElement option : options) {
			String optionText=option.getText();
			if(optionText.equals("Books")) {
				option.click();
			}
			
		}
		
		WebElement SearchTextBox= driver.findElement(By.id("twotabsearchtextbox"));
		SearchTextBox.sendKeys("Harry Potter");
		

	}

}
