package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Browser;

public class Signin_Page extends Browser{
	 public By Username =By.xpath("//input[@id='passwordinput']");
	public By Password=By.xpath("//input[@id='passwordinput']");
	public By Login=By.xpath("//button[@type='submit']");
	
	public void login(WebDriver driver, String user, String pass) {
		driver.findElement(User);
	}

	}
