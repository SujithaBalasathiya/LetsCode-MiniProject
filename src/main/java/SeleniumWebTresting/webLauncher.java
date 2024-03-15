package SeleniumWebTresting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class webLauncher extends LoginPage{

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("-------Web Launched Successfully---------");
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		System.out.println("Page Title -"+driver.getTitle());
	//	System.out.println("Page Source -"+driver.getPageSource());
		driver.manage().window().maximize();
		System.out.println("Web Launched Successfully");
		
		LoginPage Lp = new LoginPage();
		Lp.LoginPage(driver);
	
		TextBoxinteractions Edit = new TextBoxinteractions();
		Edit.TextBoxinteractions(driver);
		
		ButtonsandWindowHandles WindowHandles = new ButtonsandWindowHandles();
		WindowHandles.ButtonsandWindowHandles(driver);
		}

}
