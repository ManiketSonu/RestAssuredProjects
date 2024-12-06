package TNG;

import org.testng.annotations.Test;
//import org.testng.annotations.Test;

/*
loginByEmail - sanity & regression
loginByfacebook - sanity
loginBytwitter - sanity

signupbyemail - sanity & regression
signupbyfacebook - regression
signupbytwitter - regression

paymentinruppes - sanity & regression
paymentindollor - sanity
paymentreturnbybank - regression
*/
public class Grouping {
	@Test(priority=1, groups= {"sanity" , "regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	@Test(priority=2, groups= {"sanity"})
	void loginByfacebook()
	{
		System.out.println("this is login by facebook");
	}
	@Test(priority=3, groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println("this is login by twitter");
	}
	@Test(priority=4, groups= {"sanity" , "regression"})
	void signupbyemail()
	{
		System.out.println("signup by email");
	}
	@Test(priority=5, groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("signup by facebook");
	}
	@Test(priority=6, groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("signup by twitter");
	}
	@Test(priority=7, groups= {"sanity" , "regression"})
	void paymentindollor()
	{
		System.out.println("payment by dollor");
	}
	@Test(priority=8, groups= {"sanity"})
	void paymentinruppes()
	{
		System.out.println("payment by ruppes");
	}
	@Test(priority=9, groups= {"regression"})
	void paymentreturnbybank()
	{
		System.out.println("payment return by bank");
	}
}
