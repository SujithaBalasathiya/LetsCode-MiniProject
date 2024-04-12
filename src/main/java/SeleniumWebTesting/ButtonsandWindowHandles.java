package SeleniumWebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;

public class ButtonsandWindowHandles {
	public void ButtonsandWindowHandles(WebDriver driver) {
		System.out.println("----------Buttons and WindowHandles--------");
		driver.findElement(By.linkText("Click")).click();
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("Location : " + location);
		String BtnColor = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("BtnColor : " + BtnColor);
		Rectangle BtnDimension = driver.findElement(By.id("property")).getRect();
		System.out.println("Height : "+BtnDimension.getHeight());
		System.out.println("Width : "+BtnDimension.getWidth());
	//	System.out.println("BtnDimension : " + BtnDimension);
		Dimension BtnDimensionwithsize = driver.findElement(By.id("property")).getSize();
		System.out.println("BtnDimensionwithsize :" + BtnDimensionwithsize);
		Boolean IsEnabled = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println("Is Button Enabled :"+IsEnabled);
		
	}
}
