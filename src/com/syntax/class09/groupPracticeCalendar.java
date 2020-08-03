package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class groupPracticeCalendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://jqueryui.com/datepicker/";

		driver.get(url);

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("datepicker")).click();

		String MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		while(!MonthYear.equals("April 2021")) {
			Thread.sleep(2000);
			driver.findElement(By.linkText("Next")).click();
			 MonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		

		List<WebElement> Calendar = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tr/td"));
		for (WebElement cal : Calendar) {
			String calendarText = cal.getText();
			if(calendarText.equals("17")) {
				Thread.sleep(2000);
				cal.click();
				break;
			}
		}
	}

}
