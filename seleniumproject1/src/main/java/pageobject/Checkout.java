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


//driver.findElement(By.xpath("//button[@id='checkout']")).click();
//driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Testf");
//driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Testl");
//driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");
//driver.findElement(By.xpath("//input[@id='continue']")).click();
//driver.findElement(By.xpath("//button[@id='finish']")).click();
