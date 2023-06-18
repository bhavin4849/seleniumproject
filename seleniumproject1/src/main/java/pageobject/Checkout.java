package pageobject;

import org.openqa.selenium.By;

public class Checkout {
	public static By click_checkout = By.xpath("//button[@id='checkout']");
	public static By enter_firstname = By.xpath("//input[@id='first-name']");
	public static By enter_lastname = By.xpath("//input[@id='last-name']");
	public static By enter_postalcode = By.xpath("//input[@id='postal-code']");
	public static By coninue = By.xpath("//input[@id='continue']");
	public static By finish = By.xpath("//button[@id='finish']");
}


