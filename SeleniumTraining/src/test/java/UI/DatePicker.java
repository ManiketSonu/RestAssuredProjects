package UI;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2022");
		
		String year="2024";
		String month="March";
		String date="25";
	
		while(true)
		{
			String mon =  driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //for month
			String yr =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();   //for year
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next button
		}
		
		List<WebElement> alldates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	

}
