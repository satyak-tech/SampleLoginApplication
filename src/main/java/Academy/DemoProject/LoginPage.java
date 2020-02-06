package Academy.DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user_email']")
	WebElement email;
	@FindBy(xpath="//input[@id='user_password']")
	WebElement password;
	@FindBy(name="commit")
	WebElement go;
	
	public WebElement emailid()
	{
		return email;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement commit()
	{
		return go;
	}
	
}
	
	
