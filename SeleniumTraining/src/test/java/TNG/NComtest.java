package TNG;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NComtest {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testLogin()
	{
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
	}
	
	@Test(priority=2)
	void testLogo()
	{
		try
		{
			boolean status = driver.findElement(By.xpath("/html/body/div[3]/aside/a/img[1]")).isDisplayed();
			Assert.assertEquals(status, true);
		}
		catch(NoSuchElementException e)
		{
			Assert.assertTrue(false);
		}
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
