package TestNGAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class2 {
	
	@Test
	void xyz()
	{
		System.out.println("this is from class2");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("this is n");
	}
}
