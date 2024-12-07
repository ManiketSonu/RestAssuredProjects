package PathAndQueryParameter;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo {
	
//	@Test(priority = 1)
	void testCookies()
	{
		given()
		
		.when()
			.get("https://www.google.com/")
			
		.then()
			.log().all();
	}
	
	@Test(priority = 2)
	void getCookiesInfo() 
	{
		Response res = given()
		
		.when()
			.get("https://www.google.com/");
			
//		String cookie_value = res.getCookie("AEC");
//		System.out.print("Value of cookie:" +cookie_value);
		
		//get all cookies information
		Map<String, String> cookies_value = res.getCookies();
//		System.out.println(cookies_value.keySet());
		
		for(String k:cookies_value.keySet())
		{
			System.out.println(k+"  "+cookies_value);
		}
	}
	
	
}
