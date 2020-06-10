package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//C 3: Syntax Demo input boxes count: 
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Input Forms” links
//Click on “Simple Form Demo” links
//Get all input boxes from the page
//Enter “Hello” to each text box
//Close browser
public class Hw3InputBoxes {
	
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		
		List<WebElement> boxes= driver.findElements(By.tagName("input"));
		System.out.println(boxes.size());
		for (WebElement webElement : boxes) {
			
			webElement.sendKeys("hello");
			
		}
	Thread.sleep(1000);
	driver.close();
	}
	
}
