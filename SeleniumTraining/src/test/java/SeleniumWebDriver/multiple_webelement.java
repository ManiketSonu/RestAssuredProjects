package SeleniumWebDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		//find total number of sliders
		List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders: " +sliders.size());
		
		//find total number of images
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Numbers of images: " +images.size());
		
		//find total numbers of link
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Numbers of links: "+ links.size());
		
		driver.quit();
	}

}
