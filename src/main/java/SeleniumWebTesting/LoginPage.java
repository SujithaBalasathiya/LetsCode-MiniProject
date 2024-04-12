package SeleniumWebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{


	public void LoginPage(WebDriver driver) {
		System.out.println("----------Login Page--------");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter registered email']")).sendKeys("sujithabalasathiya21@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Sabasu@2109");
		driver.findElement(By.xpath("//button")).click();
		driver.navigate().refresh();
		driver.findElement(By.linkText("Work-Space")).click();
		
	}}
