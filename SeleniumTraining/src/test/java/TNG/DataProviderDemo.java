package TNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	ChromeDriver driver;
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
	}
	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd)
	{
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		String exp_title = "nopCommerce";
		String act_title = driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
	}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	@DataProvider(name="dp")
	String [][] loginData()
	{
		String data[][] = {
				{"admin@yourstore.com","admin"},
				{"abc@gmail.com","test@123"}
		};
		return data;
	}
}
