package UI;
 
//import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//Handle the drop-down
		
//		List<WebElement> options = driver.findElements(By.className("form-inline"));
		/*for(WebElement option:options)
		{
//			System.out.println(option.getText());
			if(option.getText().equals("Portland"))
			{
				option.click();
				break;
			}
		}*/
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
		
		driver.findElement(By.id("inputName")).sendKeys("James");
		driver.findElement(By.id("address")).sendKeys("123 Main st.");
		driver.findElement(By.id("city")).sendKeys("Anytown");
		driver.findElement(By.id("state")).sendKeys("State");
		driver.findElement(By.id("zipCode")).sendKeys("12345");
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234567890");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("2017");
		driver.findElement(By.id("nameOnCard")).sendKeys("John Smith");
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
	}

}
