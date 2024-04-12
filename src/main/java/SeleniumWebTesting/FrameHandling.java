package SeleniumWebTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHandling {

	


	public void FrameHandling(WebDriver driver){
		System.out.println("--------Frame Handling---------");
		driver.findElement(By.linkText("Inner HTML")).click();
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Sujitha");
		driver.findElement(By.name("lname")).sendKeys("S");
		String name = driver.findElement(By.xpath("//p[@class='title has-text-info']")).getText();
		System.out.println("Entered Name - "+name);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("email")).sendKeys("Suji@gmail.com");
		String email = driver.findElement(By.name("email")).getText();
		System.out.println("Email "+email);
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("Sathiyan");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Watch tutorial")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		
		
	}

	

	

}
