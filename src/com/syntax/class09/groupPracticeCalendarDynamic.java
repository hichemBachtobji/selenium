package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class groupPracticeCalendarDynamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.esky.com/airlines/al/ua/united-airlines";

		driver.get(url);
		
		//driver.findElement(By.xpath("//div[@class='_iaf _iEU _iam _iai']")).click();
		
		//div[@class='navItem nextMonth']
		
		//String monthYear = driver.findElement(By.xpath("//div[@class='monthDisplay']")).getText();
//		String monthYear = driver.findElement(By.linkText("December 2020")).getText();
//	
//		while(!monthYear.contains("April 2021")) {
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@aria-label='Next month']")).click();
//			//monthYear = driver.findElement(By.xpath("//div[@class='monthDisplay']")).getText();
//			monthYear = driver.findElement(By.linkText("December 2020")).getText();
//			
//		}
		
		driver.findElement(By.id("departureDateRoundtrip0")).click();
		
		String monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		while(!monthYear.equals("April 2021")) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		
		List<WebElement> Calendar = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	
		for (WebElement cal : Calendar) {
			String calText = cal.getText();
			if(calText.equals("17")) {
				Thread.sleep(2000);
				cal.click();
				break;
			}
		}
		
		driver.findElement(By.id("departureDateRoundtrip1")).click();
		
		
		String monthYearret = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		while(!monthYearret.equals("June 2021")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			monthYearret = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		
		List<WebElement> Calendarreturn = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		for (WebElement calRet : Calendarreturn) {
			String calText = calRet.getText();
			if(calText.equals("15")) {
				calRet.click();
				break;
			}
		}
	}

}
