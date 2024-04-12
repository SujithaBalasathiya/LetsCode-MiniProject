package SeleniumWebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

public class ScreenShot {

	public void SS(File Src, File Desc) throws IOException {
		FileHandler.copy(Src, Desc);
	}

	public void ScreenShot(WebDriver driver) throws IOException {
		File FullSS = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File FullSSlocation = new File(".\\Snaps\\FullScreen.png");
		SS(FullSS, FullSSlocation);
		System.out.println("Full SS added");
		// FileHandler.copy("FullSS","FullSSlocation");

	}

	public void ScreenShotEle(WebDriver driver) throws IOException {
		WebElement Ele = driver.findElement(By.id("home"));
		File EleSS = ((TakesScreenshot) Ele).getScreenshotAs(OutputType.FILE);
		File EleSSlocation = new File(".\\Snaps\\Element.png");
		SS(EleSS, EleSSlocation);
		System.out.println("Element SS added");
		// FileHandler.copy("FullSS","FullSSlocation");
		// FileHandler.copy(EleSS, EleSSlocation);
	}

	public void ScreenShotSection(WebDriver driver) throws IOException {
		WebElement Section = driver.findElement(By.xpath("//div[@class='content']"));
		File SectionSS = ((TakesScreenshot) Section).getScreenshotAs(OutputType.FILE);
		File SectionSSlocation = new File(".\\Snaps\\Section.png");
		SS(SectionSS, SectionSSlocation);
		System.out.println("Section SS added");
		// FileHandler.copy("FullSS","FullSSlocation");
		// FileHandler.copy(EleSS, EleSSlocation);
		driver.navigate().back();
	}
}
