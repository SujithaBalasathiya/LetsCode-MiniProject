package SeleniumWebTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webLauncher extends LoginPage {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("-------Web Launched Successfully---------");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		System.out.println("Page Title -" + driver.getTitle());
		// System.out.println("Page Source -"+driver.getPageSource());
		driver.manage().window().maximize();
		System.out.println("Web Launched Successfully");

		LoginPage Lp = new LoginPage();
		Lp.LoginPage(driver);

	/*	TextBoxinteractions Edit = new TextBoxinteractions();
		Edit.TextBoxinteractions(driver);

		ButtonsandWindowHandles WindowHandles = new ButtonsandWindowHandles();
		WindowHandles.ButtonsandWindowHandles(driver);

		ScreenShot SS = new ScreenShot();
		SS.ScreenShot(driver);
		SS.ScreenShotEle(driver);
		SS.ScreenShotSection(driver);

		AlertHandling Alert = new AlertHandling();
		Alert.AlertHandling(driver);*/

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		//FrameHandling Frame = new FrameHandling();
	//	Frame.FrameHandling(driver);

		js.executeScript("window.scrollBy(0,500)", "");

		DropandDrop draganddrop = new DropandDrop();
		draganddrop.DropandDrop(driver);
		js.executeScript("window.scrollBy(0,500)", "");
		draganddrop.DropandDropwithlocation(driver);
	}

	
}
