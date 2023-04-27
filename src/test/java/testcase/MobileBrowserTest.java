package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BaseTest {
	// Sample Mobile Browser Automation
	@Test
	public void mobileBrowserTest() {
		// Direct Top Web Apps
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		System.out.println(driver.getTitle());
		
		// Automate Mobile Browser
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.findElement(By.cssSelector(".nav-link[routerlink='/products']")).click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", "");
		
		// Assertions Product
		String productTarget = driver.findElement(By.xpath("//a[normalize-space()='Devops']")).getText();
		Assert.assertEquals(productTarget, "Devops");
		driver.findElement(By.xpath("//a[normalize-space()='Devops']")).click();

	}
}
