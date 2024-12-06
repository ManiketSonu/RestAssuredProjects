package UI;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("title of the web pages" +driver.getTitle());
		
		System.out.println("Current URL validating"+ driver.getCurrentUrl());
		
//		System.out.println("Page source of this web"+ driver.getPageSource());
		System.out.println("ID is " +driver.getWindowHandle());  //9BC06C72E6A8D6FDE2FFE50DAA633310
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> ids =  driver.getWindowHandles();
		
		for(String winid:ids)
		{
			System.out.println(winid);
		}
	}

}
