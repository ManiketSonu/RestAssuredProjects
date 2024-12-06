package TestNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeoendentMethods {
	
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	void Search()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4)
	void adSearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=5)
	void logout()
	{
		Assert.assertTrue(true);
	}
}	
