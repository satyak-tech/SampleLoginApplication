package Academy.DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	
	WebDriver driver;
	public ProfilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@id=\"fbProfileCover\"]/div[2]/div[3]/ul/li[4]/a")
	WebElement photos;
	
	public WebElement photo() {
		return photos;
}
}
