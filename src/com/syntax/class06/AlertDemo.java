package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BaseClass.setUp();
		
		driver.findElement(By.xpath("//button[@id='alert']"));
		
		Alert simpleAlert=driver.switchTo().alert();
		Thread.sleep(1000);
		
		String simpleAText=simpleAlert.getText();
		System.out.println("the simple alert text is "+simpleAText);
		Thread.sleep(1000);
		
		simpleAlert.accept();
		Thread.sleep(1000);
		
		//handling confirmation alert 
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert= driver.switchTo().alert();
		Thread.sleep(1000);
		
		String confirmAText=confirmAlert.getText();
	    System.out.println("confirm alert text is "+confirmAText);
	    
	    Thread.sleep(1000);
	    confirmAlert.dismiss();
	    Thread.sleep(1000);
	    
	    
	    //handling Prompt alerts/confirmation alert by providing some confirmation message 
	    
	    String name ="Alex";
	    driver.findElement(By.id("promt")).click();
	    Alert promptAlert = driver.switchTo().alert();
		System.out.println("this is a prompt alert text "+ promptAlert);
		promptAlert.sendKeys(name);
		promptAlert.accept();
		
		String text =driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println("text added to alert box : "+text);
		
		if(text.contains(name)) {
			System.out.println("text "+name+" was successfully added");
		}else {
			System.err.println("text "+name+ " was not added ");
		}
		
		BaseClass.tearDown();

	}

}
