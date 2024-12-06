package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		//title verification..
		/*
		String act_title = driver.getTitle();
		String exp_title = "OrangeHRM";
		if(act_title.equals(exp_title))
		{
			System.out.println("TestPassed");
		}  
		else
		{
			System.out.println("TestFailed");
		}*/
		
		//label validation..
		String act_level = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		String exp_level="Dashboard";
		if(act_level.equals(exp_level))
		{
			System.out.println("TestPassed");
		} 
		else
		{  
			System.out.println("TestFailed");
		}
//		driver.close();
	}  
}