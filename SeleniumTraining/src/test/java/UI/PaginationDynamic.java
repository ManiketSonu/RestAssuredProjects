package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo3x.opencartreports.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"menu-customer\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse5\"]/li[1]/a")).click();
		
		String text = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]")).getText();
		
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("pages")-1));
		System.out.println("Total numnber of pages"+total_pages);
	}
	
}