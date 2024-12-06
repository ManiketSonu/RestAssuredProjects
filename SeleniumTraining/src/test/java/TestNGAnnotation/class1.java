package TestNGAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {
	
	@Test
	void abc()
	{
		System.out.println("this is the abc from class 1");
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("this is m");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is before suite");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is after suite");
	}
}
