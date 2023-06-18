package seleniumproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseBase {
	static WebDriver driver;
	
	public void setup()
	{
	    this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	public void teardown() {
		driver.close();
	}

}
