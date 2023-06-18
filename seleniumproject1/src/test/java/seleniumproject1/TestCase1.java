package seleniumproject1;

import java.time.Duration;
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
		public void verify_login_functionality()
		{
			
			setup();
			
			//TestCase 1 Login
			driver.findElement(LoginPage.txt_username).sendKeys("standard_user");
			driver.findElement(LoginPage.txt_password).sendKeys("secret_sauce");
			driver.findElement(LoginPage.btn_login).click();
			
			
			//TestCase 2 Visibility
			
			//TestCase 3 Select Item and Add to Cart
			driver.findElement(SelectItem.img_link).click();
			driver.findElement(SelectItem.add_to_cart).click();
			
			//TestCase 4 Go to Cart to show Item
			driver.findElement(ShowCart.show_cart).click();
			
			//TestCase 5 Checkout
			driver.findElement(Checkout.click_checkout).click();
			driver.findElement(Checkout.enter_firstname).sendKeys("Testf");
			driver.findElement(Checkout.enter_lastname).sendKeys("Testl");
			driver.findElement(Checkout.enter_postalcode).sendKeys("123456");
			driver.findElement(Checkout.coninue).click();
			driver.findElement(Checkout.finish).click();
			
			
			//TestCase 6 Back To Home & Logout
			driver.findElement(BackHome.back_products).click();
			driver.findElement(BackHome.click_burger_menu).click();
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
			TestCase3 t3 =new TestCase3();
			TestCase4 t4 = new TestCase4();
			//t1.verify_login_functionality();
			Login log = new Login();
			log.login();
			t3.selectItem();
			//t4.showCart();
			//t2.verify_login_page_Visibility();
			
		}

}
