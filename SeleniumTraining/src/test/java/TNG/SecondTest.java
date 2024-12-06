package TNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {
	ChromeDriver driver;
	@BeforeClass
	@Test(priority=1)
  void openApp()
  {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
	@Test(priority=2)
  void login()
  {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
	@AfterClass
	@Test(priority=3)
  void close()
  {
	  driver.quit();
  }
}
