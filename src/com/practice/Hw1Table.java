package com.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.syntax.utils.CommonMethods;
public class Hw1Table extends CommonMethods {
	/*
	 * TC 1: Table headers and rows verification Open chrome browser Go to
	 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.
	 * aspx” Login to the application Verify customer “Susan McLaren” is present in
	 * the table Click on customer details Update customers last name and credit
	 * card info Verify updated customers name and credit card number is displayed
	 * in table Close browser
	 *
	 */
	public static void main(String[] args) {
		setUp();
		WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
		sendText(username, "Tester");
		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		sendText(password, "test");
		WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
		click(login);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		String expectedvalue = "Susan McLaren";
		for (int i = 0; i < rows.size(); i++) {
			String rowText = rows.get(i + 1).getText();
			if (rowText.contains(expectedvalue)) {
				System.out.println("Susan McLaren is present in the table ");
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + i + "]/td[13]"))
						.click();
				break;
			}
		}
		
		WebElement costomer = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		sendText(costomer, "Susan Sarha");
		WebElement cradInfo = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		sendText(cradInfo, "4555634353");
		WebElement update = driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
		click(update);
		List<WebElement> updateInfo = driver
				.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[4]"));
		for (WebElement updateing : updateInfo) {
			String updateText = updateing.getText();
			if (updateText.contains("Susan Sarha") && updateText.contains("4555634353")) {
				System.out.println("the Lastname and Card cardNumber is updated ");
			} else {
				System.out.println("Tast Case failed");
			}
		}

	}

}
