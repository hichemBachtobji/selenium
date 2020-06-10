package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Sleeper;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class ScreenShotDemo extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		setUp();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.className("button")).click();
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sourceFile, new File("screenShots/HRMS/dashboard.png"));
		
		

	}

}
