package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//declaring explicit wait
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-input"))).sendKeys("Admin");
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin123");
//		driver.findElement(By.className("oxd-input")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
	}

}