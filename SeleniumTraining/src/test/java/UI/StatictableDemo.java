package UI;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatictableDemo {
	public static void main(String arg[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find total number of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("number of rows"+rows);
		
		//find total number of columns
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("number of col"+col);
	
		//read row and columns data
//		String value =  driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
//		System.out.println(value);
		
		//read data from all row and columns
//		for(int r=2;r<=rows;r++)
//		{
//			for(int c=1;c<=col;c++)
//			{
//				String value =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(value+" ");
//			}
//			System.out.println();
//		}
		
		//print books name whose author is Amit
//		for(int r=2;r<=rows;r++)
//		{
//			String author =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
//			System.out.println(author);
//			if(author.equals("Amit"))
//			{
//				String bookname =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
//				System.out.println(bookname);
//			}
//		}
		
		//find sum of prices for all tables
		int sum=0;
		for(int r=2;r<=rows;r++)
		{
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
//			System.out.println(price);
			sum=sum+Integer.parseInt(price);
		}
		System.out.println("Total price of books now is:"+sum);
		
	}
}
