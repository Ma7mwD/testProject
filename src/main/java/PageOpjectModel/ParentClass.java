package PageOpjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ParentClass 
{
	static WebDriver driver;
	@BeforeTest
	public void loadWebPage()
	{
		// Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
	}
	
	//we can call the static methods using the class name.
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	
	

}
