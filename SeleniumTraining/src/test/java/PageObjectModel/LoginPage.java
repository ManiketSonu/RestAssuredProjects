package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By logo_img  = By.xpath("img[alt='company-branding']");
	By txt_username_loc  = By.xpath("//input[@placeholder='Username']]");
	By txt_password_loc  = By.xpath("//input[@placeholder='Password']");
	By btn_submit  = By.xpath("//button[normalize-space()='Login']");
	
	//actions methods
	public void setUsername(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	public void setPassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);
	}
	public void clickSubmit()
	{
		driver.findElement(btn_submit).click();
	}
	public boolean checkLogoPresence()
	{
		boolean status = driver.findElement(logo_img).isDisplayed();
		return status;
	}
}
