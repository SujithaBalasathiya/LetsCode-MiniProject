package SeleniumWebTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
public class AlertHandling {



	public void AlertHandling(WebDriver driver) {
		driver.findElement(By.linkText("Dialog")).click();
		System.out.println("----------Alert Page----------");
		//Simple Alert
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();	
		driver.findElement(By.id("accept")).click();
		String Alerttext =driver.switchTo().alert().getText();	
		System.out.println(Alerttext);
		driver.switchTo().alert().dismiss();
		System.out.println("Simple alert handled");
		//Confirm Alert
		driver.findElement(By.id("confirm")).click();
		driver.switchTo().alert().accept();	
		System.out.println("Confirm alert handled");
		//Prompt Alert
		driver.findElement(By.id("prompt")).click();
		String AlertName = driver.switchTo().alert().getText();
		System.out.println(AlertName);
		driver.switchTo().alert().sendKeys("Sujitha");
		driver.switchTo().alert().accept();
		String SendName = driver.findElement(By.id("myName")).getText();
		System.out.println(SendName);
		System.out.println("Prompt alert handled");
	//	driver.switchTo().alert().accept();	
		driver.navigate().back();
		
	}

}
