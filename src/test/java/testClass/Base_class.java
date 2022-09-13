package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageClass.Login_page;

public class Base_class {
	 static WebDriver driver;
	 public Login_page LP;
	@BeforeSuite
	public void URL_login()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("start-maximized");
		op.addArguments("disable-notifications");
		driver = new ChromeDriver(op);
		driver.get("https://www.demoblaze.com/");
	}
	@BeforeClass
	public void Object_creation()
	{
		LP = new Login_page(driver);
	}

}
