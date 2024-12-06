package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommand {
	public static void main(String arg[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register");
		driver.manage().window().maximize();
		
		WebElement logo =  driver.findElement(By.xpath("//*[@id=\"register-page\"]/body/div[7]/header/nav/div[2]/a/img"));
		System.out.println("logo displayed"+logo.isDisplayed());
		
		WebElement firstnameSe =  driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div/div/div/div[2]/form/div/div[1]/div[2]/div[1]/input"));
		System.out.println("DisplayStatus"+ firstnameSe.isDisplayed());
		System.out.println("Enabledstatus"+ firstnameSe.isEnabled());
	}
}


