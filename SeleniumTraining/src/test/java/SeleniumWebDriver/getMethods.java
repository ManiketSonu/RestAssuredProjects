package SeleniumWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 get(Url)
 getTitle()
 getCurrentUrl()
 getpageSource()
 getWindowhanles()
 getWindowhandle()
 */
public class getMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("title of the webpages"+driver.getTitle());
		System.out.println("current url "+driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
//		System.out.println(driver.getWindowHandle()); //CDAF555B8DD121C19EB3436AA449313B
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windosID =  driver.getWindowHandles();
		for(String winid:windosID) {
			System.out.println(winid);
//			162CACCFDB67D11DD1E19486FFC39247
//			6ADCBE37238B99263C20736F864152D0
		}
	}	

}
