package seleniumproject1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestCaseBase {
	static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	    this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	public void teardown() {
		driver.close();
	}
	
	public static void beforesuite()
	{
		System.out.println("This is running and setting up environment");
	}
	
	public static void aftersuite()
	{
		System.out.println("This is running and setting up after environment");
	}
	
}
