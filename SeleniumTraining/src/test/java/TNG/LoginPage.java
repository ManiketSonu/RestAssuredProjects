package TNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By logo_img_loc = By.xpath("img[alt='company-branding']");
	By txt_username_loc = By.xpath("//input[@placeholder='username']");
	By txt_password_loc = By.xpath("//input[@placeholder='password']");
	By login_btn_loc = By.xpath("button[type='submit']']");
	
	//Actions
	public void setUserName(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	public void setPassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);
	}
	public void clickSubmit()
	{
		driver.findElement(login_btn_loc).click();
	}
	public boolean checkLogoPresence()
	{
		boolean status = driver.findElement(logo_img_loc).isDisplayed();
		return status;
	}
}
