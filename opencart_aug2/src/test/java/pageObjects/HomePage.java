package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement linkMyaccount;
	
	@FindBy(linkText="Register")
	WebElement linkRegister;
	
	//Action method
	public void clickMyAccount()
	{
		linkMyaccount.click();
	}
	public void clickRegister()
	{
		linkRegister.click();
	}
}
