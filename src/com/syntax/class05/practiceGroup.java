package com.syntax.class05;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class practiceGroup {

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		
//		WebElement DD = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		
//		Select select = new Select(DD);
//		
//		select.selectByVisibleText("Option3");
//		
//		WebElement IFrame = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
//		
//		driver.switchTo().frame(IFrame);
//		
//		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
//		
//			
//			
//		driver.manage().window().fullscreen();
//		
//		for (WebElement link : Alllinks) {
//			String linkText = link.getText();
//			if(linkText.equals("Courses")) {
//				Thread.sleep(2000);
//			link.click();
//			break;
//			}
//		}
		
		driver.findElement(By.id("openwindow")).click();
		String parentWindow = driver.getWindowHandle();
		
		Set<String> childWindows = driver.getWindowHandles();
		
		
		
		
		Iterator<String> it = childWindows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!childWindow.equals(parentWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
	}

}
