package seleniumproject1;

import pageobject.LoginPage;

public class Login extends TestCaseBase{
	
	public void login()
	{
		setup();
		driver.findElement(LoginPage.txt_username).sendKeys("standard_user");
		driver.findElement(LoginPage.txt_password).sendKeys("secret_sauce");
		driver.findElement(LoginPage.btn_login).click();
	
	}
}
