package seleniumproject1;

import org.openqa.selenium.By;
import seleniumproject1.Login;
import seleniumproject1.TestCase4;

import pageobject.LoginPage;
import pageobject.SelectItem;

public class TestCase3 extends TestCaseBase{
	Login l = new Login();
	TestCase4 t4 =new TestCase4();
	public void selectItem()
	{
		
		
		/*driver.findElement(LoginPage.txt_username).sendKeys("standard_user");
		driver.findElement(LoginPage.txt_password).sendKeys("secret_sauce");
		driver.findElement(LoginPage.btn_login).click();*/
		l.login();
		driver.findElement(SelectItem.img_link).click();
		driver.findElement(SelectItem.add_to_cart).click();
		t4.showCart();
		
		//teardown();
		
	}
}
