package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	public static void main(String arg[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nopcommerce.com/en/register");
		driver.manage().window().maximize();
		
		WebElement drpeleCountry = driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
		
		Select dropCountry = new Select(drpeleCountry);
		
		//selecting an option from drop-down
		dropCountry.selectByVisibleText("India");
		
		//finding total number of options in drop-down
		List<WebElement> options = dropCountry.getOptions();
		System.out.println("total number of options: "+options.size());
		
		//print options in console
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
	}
}
