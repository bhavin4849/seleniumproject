package seleniumproject1;

import pageobject.Checkout;
import pageobject.SelectItem;

public class Checkout1 extends TestCaseBase{
	public void check()
	{
		driver.findElement(Checkout.click_checkout).click();
		driver.findElement(Checkout.enter_firstname).sendKeys("Testf");
		driver.findElement(Checkout.enter_lastname).sendKeys("Testl");
		driver.findElement(Checkout.enter_postalcode).sendKeys("123456");
		driver.findElement(Checkout.coninue).click();
		driver.findElement(Checkout.finish).click();
		
	}
}
