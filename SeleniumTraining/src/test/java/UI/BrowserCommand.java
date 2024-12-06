package UI;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
//		driver.close();
		driver.quit();
	}

}

