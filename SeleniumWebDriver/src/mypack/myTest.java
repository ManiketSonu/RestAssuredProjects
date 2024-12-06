package mypack;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class myTest {
	public static void main(String arg[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/v3/index.php");
	}
}
