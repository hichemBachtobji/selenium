package com.practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAmazonFindElementS {
	
	public static String url="https://www.amazon.com/";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		List<WebElement> list= driver.findElements(By.tagName("a"));
		
		
		
//		int count=0;
//		for (WebElement allTexts : list) {
//			
//			String texts=allTexts.getText();
//			
//			if(!texts.isEmpty()) {
//				System.out.println(texts);
//				count++;
//			}
//	   }
//		
//		System.out.println("size is "+ list.size());
//		
//		System.out.println("All links with texts "+ count);
//		
	Iterator<WebElement> it= list.iterator();
		
		int count1=0;
		while(it.hasNext()) {
			String text=it.next().getText();
			if(!text.isEmpty()) {
				System.out.println(it);
				count1++;
			}
			
		}
		System.out.println(list.size());
		System.out.println(count1);

}
}
