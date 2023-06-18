package seleniumproject1;

import pageobject.LoginPage;
import pageobject.ShowCart;
import seleniumproject1.Login;

public class TestCase4 extends TestCaseBase{
	Login l = new Login();
	public void showCart()
	{
		//l.login();
		/*driver.findElement(LoginPage.txt_username).sendKeys("standard_user");
		driver.findElement(LoginPage.txt_password).sendKeys("secret_sauce");
		driver.findElement(LoginPage.btn_login).click();*/
		driver.findElement(ShowCart.show_cart).click();
	}
}
