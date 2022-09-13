package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
	private WebElement login_click;
	private WebElement user_name;
	private WebElement password;
	private WebElement login_button;
	
	public Login_page(WebDriver driver)
	{
		login_click = driver.findElement(By.id("login2"));
		user_name = driver.findElement(By.id("loginusername"));
		password = driver.findElement(By.id("loginpassword"));
		login_button = driver.findElement(By.xpath("//button[text()='Log in']"));
		
	}
	
	public void Click_on_login() throws Throwable
	{
		login_click.click();
		Thread.sleep(4000);
	}
   public void Send_username() throws Throwable
{
	user_name.sendKeys("group4");
	Thread.sleep(2000);
}
public void Password() throws Throwable
{
	password.sendKeys("123456789");
	Thread.sleep(2000);
}
public void Click_login_button()
{
	login_button.click();
	System.out.println("Hi santosh");
}
}
