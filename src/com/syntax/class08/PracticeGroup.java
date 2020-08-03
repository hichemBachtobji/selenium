package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class PracticeGroup {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
	
	WebDriver driver =new ChromeDriver();
	
	String url = "http://166.62.36.207/syntaxpractice/index.html";
	
	driver.get(url);
	
	List<WebElement> DDTable = driver.findElements(By.className("dropdown-toggle"));
	
	for (WebElement Table : DDTable) {
		String textTable = Table.getText();
		if(textTable.equals("Table")) {
			Table.click();
			break;
		}
	}
	
	driver.findElement(By.linkText("Table Sort & Search")).click();
	
	List<WebElement> TableRows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
	
	for(int i =1; i<=TableRows.size();i++) {
		
	String textRow = TableRows.get(i-1).getText();
	
	if(textRow.contains("A. Ramos")) {
		WebElement ramos = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]"));
		
		System.out.println(ramos.getText());
		System.out.println(textRow);
		break;
	}
	}
	
	String exp = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[2]/td[3]")).getText();
	System.out.println(exp);
		
	}

}
