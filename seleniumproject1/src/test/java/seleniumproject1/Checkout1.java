package seleniumproject1;

import pageobject.Checkout;
import pageobject.SelectItem;

public class Checkout1 extends TestCaseBase{
	public void check()
	{
		driver.findElement(Checkout1.click_checkout).click();
		driver.findElement(Checkout1.enter_firstname).sendKeys("Testf");
		driver.findElement(Checkout1.enter_lastname).sendKeys("Testl");
		driver.findElement(Checkout1.enter_postalcode).sendKeys("123456");
		driver.findElement(Checkout1.coninue).click();
		driver.findElement(Checkout1.finish).click();
		
	}
}
