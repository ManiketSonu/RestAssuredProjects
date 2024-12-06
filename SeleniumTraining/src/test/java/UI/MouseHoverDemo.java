package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desk =  driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Mac =  driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		//Mouse Hover actions
//		act.moveToElement(desk).moveToElement(Mac).click().build().perform(); create action then perform
		act.moveToElement(desk).moveToElement(Mac).click().perform();  //directly perform action
		

	}

}
