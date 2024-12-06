package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		driver.findElement(By.name("submit_search")).click();
		
		driver.findElement(By.linkText("Blouse")).click();//---> here we need to pass the complete text of the element.
		
//		driver.findElement(By.partialLinkText("Printed Summer Dress")).click(); --> here we can pass the some portion of the text.
	}

}