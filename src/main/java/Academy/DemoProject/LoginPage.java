package Academy.DemoProject;

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
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	@FindBy(xpath="//input[@value='Log In']")
	WebElement go;
	
	public WebElement emailid()
	{
		return email;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement submit()
	{
		return go;
	}
	
}
	
	
