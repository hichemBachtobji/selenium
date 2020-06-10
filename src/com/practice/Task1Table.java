package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.Constants;

public class Task1Table extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);

		WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
		sendText(userName, "Tester");

		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		sendText(password, "test");

		WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
		click(login);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/th"));

		String expectedName = "Susan McLaren";

		for (int i = 1; i < rows.size(); i++) {
			String rowText = rows.get(i - 1).getText();
			//System.out.println(rowText);
			if (rowText.contains(expectedName)) {
				System.out.println("Susan McLaren is present");
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + i + "]/td[13]")).click();
				break;
			}
		}
		WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		sendText(customerName, "Susan Bach");

		WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		sendText(cardNumber, "123456789");
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		
		List<WebElement> updatedRows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

		for (WebElement row : updatedRows) {
			String rowUpdate=row.getText();
			if(rowUpdate.contains("Susan Bach")) {
				
				System.out.println("name update "+rowUpdate);
			}if(rowUpdate.contains("123456789")) {
				System.out.println("card update "+rowUpdate);
				break;
			}
			
		}

		
	}

}
