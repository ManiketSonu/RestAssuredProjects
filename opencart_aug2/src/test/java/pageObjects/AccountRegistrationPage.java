package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(name="firstname")
	WebElement txtFirstname;
	
	@FindBy(name="lastname")
	WebElement txtLastname;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement btnContinue;
	
	public void setFirstname(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void setLastname(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
}
