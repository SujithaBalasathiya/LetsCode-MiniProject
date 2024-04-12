package SeleniumWebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropandDrop {
	
	

	public void DropandDrop(WebDriver driver) {
		System.out.println("-------Drag and Drop--------");
		driver.findElement(By.linkText("AUI - 2")).click();
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, destination).perform();
		System.out.println("Perfromed Drop and Drop Successfully");
		driver.navigate().back();		
	}
	
	public void DropandDropwithlocation(WebDriver driver) {
		System.out.println("-------Drag and Drop with Locaition--------");
		driver.findElement(By.linkText("AUI - 1")).click();
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("sample-box"));
		action.dragAndDropBy(source, 1400, 1480).perform();
		System.out.println("Perfromed Drop and Drop Successfully");
		//driver.navigate().back();		
	}



	
}
