package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;
import com.syntax.utils.CommonMethods;

public class Hw2ScreenShot extends CommonMethods {
/*
 * TC 2: Upload file and Take Screenshot
Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
Upload file
Verify file got successfully uploaded and take screenshot
 */
	public static void main(String[] args) throws IOException, InterruptedException {
		
		setUp();
		
		WebElement choose = driver.findElement(By.id("gwt-debug-cwFileUpload"));
		Thread.sleep(2000);
		choose.sendKeys("C:\\Users\\bacht\\OneDrive\\Desktop");
		WebElement upload= driver.findElement(By.className("gwt-Button"));
		upload.click();
		
		Alert alert = driver.switchTo().alert();
		//getWaitObject().until(ExpectedConditions.alertIsPresent());
		String alertText=alert.getText();
		System.out.println("alert text "+alertText+" is displayed");
		alert.accept();
		
		TakesScreenshot sShot=(TakesScreenshot) driver;
		File sourceFile=sShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("screenShots/HRMS/Showcase.png"));

	}

}
