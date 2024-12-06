package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
//		WebElement logo =  driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println(logo.isDisplayed());
		boolean logo =  driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(logo);
		
		WebElement searchbox =  driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(searchbox.isDisplayed());
		System.out.println(searchbox.isEnabled());
		
		WebElement male = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		
		//Before selection
		System.out.println("Before selection.........");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
		//after selection
		System.out.println("Before selection.........");
		male.click();
		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected()); 
		
	}

}
