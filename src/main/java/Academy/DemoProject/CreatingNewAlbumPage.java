package Academy.DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewAlbumPage {
	
	WebDriver driver;
	public CreatingNewAlbumPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//
//	@FindBy(xpath="//*[@id=\"fbTimelineHeadline\"]/div[3]/li[4]/a")
//	WebElement Album;
	@FindBy(xpath="//*[@class=\"clearfix\"]/div[1]/span/a")
	WebElement CreateAlbum;
	
	
//	public WebElement photo() {
//		return Album ;
//	}
	public WebElement createalbum() {
		return CreateAlbum ;
	}
	

}

