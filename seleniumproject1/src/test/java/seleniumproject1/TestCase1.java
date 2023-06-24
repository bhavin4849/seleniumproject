package seleniumproject1;

import java.time.Duration;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import pageobject.BackHome;
import pageobject.Checkout;
import pageobject.DashboardPageObject;
import pageobject.LoginPage;
import pageobject.SelectItem;
import pageobject.ShowCart;

public class TestCase1 extends TestCaseBase{
	
		@Test
		public void verify_login_functionality() throws InterruptedException
		{
			
			//setup();
			
			//TestCase 1 Login
			
			driver.findElement(LoginPage.txt_username).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(LoginPage.txt_password).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(LoginPage.btn_login).click();
			Thread.sleep(3000);
			
			
			//TestCase 2 Visibility
			
			//TestCase 3 Select Item and Add to Cart
			driver.findElement(SelectItem.img_link).click();
			Thread.sleep(3000);
			driver.findElement(SelectItem.add_to_cart).click();
			Thread.sleep(5000);
			
			//TestCase 4 Go to Cart to show Item
			driver.findElement(ShowCart.show_cart).click();
			Thread.sleep(5000);
			
			//TestCase 5 Checkout
			driver.findElement(Checkout.click_checkout).click();
			Thread.sleep(4000);
			driver.findElement(Checkout.enter_firstname).sendKeys("Testf");
			Thread.sleep(2000);
			driver.findElement(Checkout.enter_lastname).sendKeys("Testl");
			Thread.sleep(2000);
			driver.findElement(Checkout.enter_postalcode).sendKeys("123456");
			Thread.sleep(2000);
			driver.findElement(Checkout.coninue).click();
			Thread.sleep(3000);
			driver.findElement(Checkout.finish).click();
			Thread.sleep(2000);
			
			
			//TestCase 6 Back To Home & Logout
			driver.findElement(BackHome.back_products).click();
			Thread.sleep(1000);
			driver.findElement(BackHome.click_burger_menu).click();
			Thread.sleep(2000);
			driver.findElement(BackHome.logout).click();
			
			
			boolean isDisplayed = driver.findElement(DashboardPageObject.lbl_product).isDisplayed();
			
			if (isDisplayed){
				System.out.println("Testcase is Passed");
			}else {
				System.out.println("Testcase is Failed");
			}
			
			//teardown();
		}	
		
		public static void main(String[] args) {
			//TestCase1 t1 =new TestCase1();
			//TestCase2 t2 =new TestCase2();
			//t1.verify_login_functionality();
			//t4.showCart();
			//t2.verify_login_page_Visibility();
			
			/*TestCase3 t3 =new TestCase3();
			TestCase4 t4 = new TestCase4();
			Checkout1 chk = new Checkout1();
			
			
			
			Login log = new Login();
			log.login();
			t3.selectItem();
			chk.check();*/
			
		}

}
