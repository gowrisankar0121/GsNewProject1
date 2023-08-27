package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome",
				"C:\\Users\\Gowrisankar\\eclipse-workspace\\CssSelector\\library\\selenium-server-4.10.0.jar");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.netflix.com/in/Login");
		
		WebElement user = driver.findElement(By.cssSelector("input#id_userLoginId"));
		user.sendKeys("gowrisankar0121@gmail.com");
		
		WebElement pass = driver.findElement(By.cssSelector("input#id_password"));
		pass.sendKeys("Gowri01@");
		
	}

}
