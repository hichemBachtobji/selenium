package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class Task2TableDelete extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		sendText(userName, ConfigsReader.getProperty("userName"));
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.linkText("Add Employee")).click();
		String name="hichem";
		String lastName="Bach";
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.id("firstName"));
		sendText(firstName, name);
		Thread.sleep(2000);
		WebElement LName = driver.findElement(By.id("lastName"));
		sendText(LName, lastName);
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		
		WebElement profilePic = driver.findElement(By.id("profile-pic"));
		String ProfilePicText=profilePic.getText();
		if(ProfilePicText.equals(name+" "+lastName)) {
			System.out.println("new emp is added");
		}
		Thread.sleep(2000);
		WebElement empList = driver.findElement(By.linkText("Employee List"));
		click(empList);
		Thread.sleep(2000);
		List<WebElement> TableList = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		//boolean found=false;
		String expectedValue= "Hichem Bach";
		//while(!found) {
			for(int i=1;i<TableList.size();i++) {
				Thread.sleep(2000);
				String listText=TableList.get(i-1).getText();
				if(listText.contains(expectedValue)) {
					Thread.sleep(2000);
					//found=true;
					 driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.id("btnDelete")).click();;
					 System.out.println(expectedValue+" is deleted");
					 break;
				
				}
			}
			
		
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Next']"));
		Thread.sleep(2000);
		

	}

}
