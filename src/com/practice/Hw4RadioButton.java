package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

//TC 4: Radio Buttons Practice  
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Input Forms” links
//Click on “Radio Buttons Demo” links
//Click on any radio button in “Radio Button Demo” section.
//Verify correct radio is clicked
//Click on any radio button in “Group Radio Buttons Demo” section.
//Verify correct checkbox is clicked
//Quit browser

public class Hw4RadioButton extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).click();
		List<WebElement> option= driver.findElements(By.xpath("//input[@type='radio']"));
		
		String male="Male";
		String age="15 - 50";
		
		for (WebElement button : option) {
			
			Thread.sleep(2000);
			
			if(button.getAttribute("value").equals(male)) {
				button.click();
				System.out.println("male button is selected");
			}
			if (button.getAttribute("value").equals(age)) {
				button.click();
				System.out.println("age 15-50 is selected");
				break;
			}
			
		}
		//tearDown();
		
	}
	
	
	
}













//public class Hw4RadioButton {
//	
//	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
//	
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//		
//		WebDriver driver= new ChromeDriver();
//		
//		driver.get(url);
//		
//		driver.findElement(By.linkText("Input Forms")).click();
//		driver.findElement(By.linkText("Radio Buttons Demo")).click();
//		driver.findElement(By.xpath("//div[text()='Radio Button Demo']")).click();
//		List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
//		
//		String malebutton="Male";
//		String agebutton="5 to 15";
//		
//		for (WebElement webElement : radio) {
//			
//			if(webElement.getAttribute("value").equals(malebutton)) {
//				webElement.click();
//				System.out.println("male buttons are clicked");
//			}
//			if(webElement.getAttribute("value").equals(agebutton));
//			webElement.click();
//			System.out.println("age 5 to 15 is clicked");
//			break;
//		}
//	 
////		for (WebElement button : radio) {
////			button.click();
////			if(button.isSelected()) {
////				System.out.println("buttons are clicked");
////			}else {
////				System.out.println("buttons are NOT clicked");
////			}
////		}
////		Thread.sleep(2000);
////		driver.close();
//	}
//
//}
