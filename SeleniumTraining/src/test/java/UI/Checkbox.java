package UI;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://materializecss.com/checkboxes.html");
		driver.manage().window().maximize();
		
		
//		driver.findElement(By.xpath("//*[@id=\"checkbox\"]/form/p[1]/label/span")).click();
		
		//total number if check box
		List<WebElement> checkboxes  = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total number of checkexes"+checkboxes.size());
		
		//select all the check boxes 
		for(int i=0;i<=checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}	
	} 
}


