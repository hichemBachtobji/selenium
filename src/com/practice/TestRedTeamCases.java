package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRedTeamCases {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();

		String url = "http://18.232.148.34/humanresources/symfony/web/index.php/pim";

		driver.get(url);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		 System.out.println("------JOB TITLES--------");
		    String EmployeeID="9400A";
		    boolean flag=false;
		    while(!flag) {
		    	 List<WebElement> tableRow = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
				    for (int i = 1; i < tableRow.size(); i++) {
						String tableText = tableRow.get(i-1).getText();
						if(tableText.contains(EmployeeID)) {
							flag=true;
							WebElement Employee = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[2]"));
							Thread.sleep(2000);
							Employee.click();
							break;
						}
					}
				    if(!flag) {
						driver.findElement(By.xpath("//a[text()='Next']")).click();

					}
		    }
		   
		    
		    WebElement jTitle = driver.findElement(By.linkText("Job"));
		    Thread.sleep(2000);
		    jTitle.click();
		    
		    WebElement edit = driver.findElement(By.xpath("//input[@value='Edit'][1]"));
		    Thread.sleep(2000);
		    edit.click();
		    
		    WebElement jobTitle = driver.findElement(By.xpath("//select[@id='job_job_title']"));
		    Select select = new Select(jobTitle);
			List<WebElement> options = select.getOptions();
			for (WebElement option : options) {
				String optionText = option.getText();
				System.out.println(optionText);
			}
	
}
}
