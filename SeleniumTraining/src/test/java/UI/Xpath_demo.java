package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String productname = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[1]/a/img")).getText();
		System.out.println(productname);
		
	}

}

