package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/#");
		driver.manage().window().maximize();
	}
//	@AfterClass
//	void tearDown()
//	{
//		driver.quit();
//	}
	
	public String randomeString()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}
	
}
