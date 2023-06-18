package seleniumproject1;

import org.openqa.selenium.By;

public class TestCase2 extends TestCaseBase{
	public void verify_login_page_Visibility()
	{
		setup();
		
		boolean udisplay = driver.findElement(By.xpath("//input[@id='user-name']")).isDisplayed();
		boolean pdisplay = driver.findElement(By.xpath("//input[@id='password']")).isDisplayed();
		
		
		if (udisplay && pdisplay){
			System.out.println("Testcase is Passed");
		}else {
			System.out.println("Testcase is Failed");
		}
		//teardown();
		
	}
}
