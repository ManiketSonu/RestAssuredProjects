package UI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick_addeventlistener");
		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0)
		WebElement button =  driver.findElement(By.id("demo"));
		Actions act = new Actions(driver);
		
		act.doubleClick(button).perform();
	}

}