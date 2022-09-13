package testClass;

import org.testng.annotations.Test;

public class Login_test extends Base_class{
	@Test
	public void Testcases_execution() throws Throwable
	{
		LP.Click_on_login();
		LP.Send_username();
		LP.Password();
		LP.Click_login_button();
		System.out.println("Hi Amol");
		int r = 30-20;
		System.out.println(r);
		System.out.println("hello");
	}
	

}
