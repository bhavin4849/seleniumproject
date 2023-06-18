package pageobject;

import org.openqa.selenium.By;

public class BackHome {
	public static By back_products = By.xpath("//button[@id='back-to-products']");
	public static By click_burger_menu = By.xpath("//button[@id='react-burger-menu-btn']");
	public static By logout = By.xpath("//a[@id='logout_sidebar_link']");
}
//driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
//driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
//driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
