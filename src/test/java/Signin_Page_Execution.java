import org.openqa.selenium.WebDriver;

import Pages.Signin_Page;

public class Signin_Page_Execution extends Signin_Page{
	WebDriver driver;
	public void signin()
	{
		driver = lunchUrl();
		login(driver, "admin@gmail.com", "123456");
	}

}
