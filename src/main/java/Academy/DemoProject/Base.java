package Academy.DemoProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\kaush\\eclipse-workspace\\satya\\DemoProject\\src\\main\\java\\config\\data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaush\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver= new ChromeDriver();
		//execute in chrome driver
	
}

return driver;
}
}
