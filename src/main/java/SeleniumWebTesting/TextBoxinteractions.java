package SeleniumWebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TextBoxinteractions {
	
	public void TextBoxinteractions(WebDriver driver) {
		System.out.println("----------Text Box interactions--------");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("fullName")).sendKeys("Sujitha Balasathiya");
		driver.findElement(By.id("join")).sendKeys("Human",Keys.TAB);
		String Value = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println("Getme value : " + Value);
		driver.findElement(By.id("clearMe")).clear();
		boolean isDisplayed = driver.findElement(By.id("noEdit")).isDisplayed();
		System.out.println("Is Disabled : " + isDisplayed);
		String isReadonly = driver.findElement(By.id("dontwrite")).getAttribute("Value");
		System.out.println("isReadonly" + isReadonly);
		driver.navigate().back();		
	}

}
