package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepStatement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.className("oxd-input")).sendKeys("Admin");
	}

}
