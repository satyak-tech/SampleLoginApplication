package Academy.DemoProject;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void basePageNavigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));

		LoginPage lp = new LoginPage(driver);

		lp.emailid().sendKeys("7789680700");
		lp.password().sendKeys("7787768459");
		lp.submit().click();
		Thread.sleep(5000);

		driver.manage().window().maximize();

		homepage hp = new homepage(driver);

		hp.profile().click();
		Thread.sleep(5000);

		ProfilePage p = new ProfilePage(driver);
		p.photo().click();

		Thread.sleep(5000);
		CreatingNewAlbumPage ca = new CreatingNewAlbumPage(driver);
		ca.createalbum().click();
		Thread.sleep(5000);

	}

}
