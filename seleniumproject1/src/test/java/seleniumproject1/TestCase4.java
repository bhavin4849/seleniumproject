package seleniumproject1;

import pageobject.ShowCart;

public class TestCase4 extends TestCaseBase{
	public void showCart()
	{
		setup();
		driver.findElement(ShowCart.show_cart).click();
	}
}
