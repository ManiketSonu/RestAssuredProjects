package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

//import java.lang.Object;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.util.List;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
		
		//driver setup
		ChromeDriver driver = new ChromeDriver();
	
		//open the application
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
//		driver.findElement(By.name("submit_search")).click();
		
		//link text..we need to send full portion of the value..
//		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		
//		partial link text.. we can pass some portion of the value and we will never use this..
//		driver.findElement(By.partialLinkText("Printed Chiffon")).click();
		
		//class name
		List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
		System.out.println("NUmber of sliders:"+sliders.size());
		
		//find total number of images on home pages..
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images are"+images.size());
		
		//find total number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are"+links.size());
		
		driver.quit();
//		driver.close();
	}

}
