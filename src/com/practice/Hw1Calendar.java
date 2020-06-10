package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class Hw1Calendar extends CommonMethods {
	/*
	 * Open chrome browser Go to “https://www.aa.com/homePage.do” Enter From and To
	 * Select departure as July 14 of 2020 Select arrival as November 8 of 2020
	 * Close browser
	 */

	public static void main(String[] args) throws InterruptedException {

		setUp();
		WebElement from = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		sendText(from, "IAD");

		WebElement to = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		sendText(to, "DCA");

		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		
		String dMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']")).getText();
		
		while (!dMonth.equals("July 2020")) {
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
			dMonth=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']")).getText();
		}
		List<WebElement> daysTable = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
		for (WebElement day : daysTable) {
			String dDayText = day.getText();
			if (dDayText.equals("14")) {
				day.click();
				break;
			}
		}
		
	
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		
		String rMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();
		
		
		while(!rMonth.equals("November 2020")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
	       rMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")).getText();
		
		}
		List<WebElement> rDays = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td"));
		for (WebElement rday : rDays) {
			String rdayText=rday.getText();
			if(rdayText.equals("8")) {
				rday.click();
				break;
			}
		}

	}

}
