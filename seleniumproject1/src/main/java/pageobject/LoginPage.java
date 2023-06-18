package pageobject;

import org.openqa.selenium.By;

public class LoginPage {
	public static By txt_username = By.xpath("//input[@id='user-name']");
	public static By txt_password = By.xpath("//input[@id='password']");
	public static By btn_login = By.xpath("//input[@id='login-button']");
}
