package Academy.DemoProject;

import java.awt.List;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
	public homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"u_0_a\"]/div[1]/div[1]/div")
//	WebElement profileicon1= (WebElement) driver.findElements(By.tagName("li"));
	WebElement profileicon;
	
	public WebElement profile() {
		return profileicon;
	}
}



