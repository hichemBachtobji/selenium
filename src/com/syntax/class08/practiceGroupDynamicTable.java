package com.syntax.class08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.CommonMethods;

public class practiceGroupDynamicTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();

		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

		driver.get(url);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();

		boolean found = false;
		while (!found) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

			for (int i = 1; i <= rows.size(); i++) {
				
				String text = rows.get(i - 1).getText();
				if (text.contains("14203")) {
					found = true;
					Thread.sleep(2000);
					WebElement click = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]"));
					//CommonMethods.click(click);
					click.click();
					System.out.println(text);
					break;
				}
				
			}
			if(!found) {
				driver.findElement(By.xpath("//a[text()='Next']")).click();

			}
		}
		
	}

}
