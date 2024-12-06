package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driverSetup
		ChromeDriver driver = new ChromeDriver();
		
		
		//open the application
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		
		//Tag with the ID combination
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("T-shirts");
		
		//Tag class
		//driver.findElement(By.cssSelector("input.search_query")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search_query")).sendKeys("T-shirts");
		
		//Tag attribute
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("T-shirts");
		
		//Tag class and attribute
		driver.findElement(By.cssSelector("")).sendKeys("T-shirts");
	}

}
