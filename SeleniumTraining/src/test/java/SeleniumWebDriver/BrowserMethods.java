package SeleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
//		driver.close();--->this will close the current browser window.
		driver.quit();//this will close all the active window
	}

}
