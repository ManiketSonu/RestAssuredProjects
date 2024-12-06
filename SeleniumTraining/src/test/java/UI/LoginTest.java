package UI;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		
		//Launch the browser..
		ChromeDriver driver = new ChromeDriver();
		
		//Open URL on browser...
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//maximize the page..
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//provide the Unamee..
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//provide the password..
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000);
		
		//click on Login button
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//verify the title of the dboard..
//		String abc = driver.getTitle();
//		String acd = "OrangeHRM";
//		
//		if(abc.equals(acd))
//		{
//			System.out.println("Test Passed");
//		}
//		else
//		{
//			System.out.println("Test Failed");
//		}
		
		//Label validation..
		
		String act_label = "";
		try
		{
			act_label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(NoSuchElementException e)
		{
//			act_label="";
		}
		String exp_label = "Dashboard";
		
		if(act_label.equals(exp_label))
		{
			System.out.println("Test-Passed");
		}
		else
		{
			System.out.println("Test-failed");
		}
		
		driver.close();
		
		
	}
	

}
