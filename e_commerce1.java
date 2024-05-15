package package3;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_commerce1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub  btn-info
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		
		//Adding thread 
		Thread t1 = new Thread(); 
		t1.start();
		

		
		//Logging in 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		t1.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		t1.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		
		
		
		//Add backpack to cart and Jacket to the cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		t1.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		t1.sleep(2000);
		
		//Check if Cart Count icon is displayed. boolean logoDisplayStatus =
		boolean logoDisplayStatus = driver.findElement(By.className("shopping_cart_badge")).isDisplayed();
		System.out.println(logoDisplayStatus); 
		
		//Opening the cart
		driver.findElement(By.className("shopping_cart_link")).click();
		t1.sleep(2000);
		//Removing a item and continue shopping
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();t1.sleep(2000);
		driver.findElement(By.id("checkout")).click();t1.sleep(2000);
		
		
		//Click on Continue Shopping. Fill form.
		driver.findElement(By.cssSelector("input[name = 'firstName']")).sendKeys("Testing");t1.sleep(2000);
		driver.findElement(By.cssSelector("input[name = 'lastName']")).sendKeys("Testing Lastname");t1.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("123456");t1.sleep(2000);
		driver.findElement(By.id("continue")).click();t1.sleep(2000);
		driver.findElement(By.id("finish")).click();t1.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();t1.sleep(2000);
		
		
		//Logging Out
		driver.findElement(By.id("react-burger-menu-btn")).click();t1.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();t1.sleep(2000);
		
		

	}

}
