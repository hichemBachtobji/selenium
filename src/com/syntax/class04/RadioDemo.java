package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static String url = "https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
//		WebElement maleRadioB = driver.findElement(By.xpath("//input[@id='sex-0']"));
//
//		System.out.println(maleRadioB.getAttribute("class"));
//		
//		System.out.println(maleRadioB.isDisplayed());// true
//		System.out.println(maleRadioB.isEnabled());// true
//		System.out.println("Radio Btn is Selected:: " + maleRadioB.isSelected());// false
//		System.out.println("**********");
//
//		// first way to click on a Radio Button
//		maleRadioB.click();
//		System.out.println("Radio Btn is Selected:: " + maleRadioB.isSelected());// true

		// second way to click on Radio buttons
		List<WebElement> proList = driver.findElements(By.xpath("//input[@name='gender']"));

		int listSize = proList.size();
		System.out.println("Size of CheckBoxes are:: " + listSize);

		String valueToBeSelected="Male";
		//driver.findElement(By.xpath("//input[@id='sex-0']")).getAttribute("value");
		for (WebElement pro : proList) {

			if(pro.isEnabled()) {//Checking if the check-box is enabled
				
				String value=pro.getAttribute("value");//get value of value attribute
				
				System.out.println(value);
				
				if(value.equals(valueToBeSelected)) {
					pro.click();
					break;
				}
				
			}
		}

	}

}
