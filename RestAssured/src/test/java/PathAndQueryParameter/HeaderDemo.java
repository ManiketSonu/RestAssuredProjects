package PathAndQueryParameter;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class HeaderDemo {
	
	@Test(priority = 1)
	void testHeaders()
	{
		given()
		
		.when()
			.get("https://www.google.com/")
			
		.then()
			.header("Content-Type",
					 "text/html; charset=ISO-8859-1")
			.header("Content-Encoding",
					"gzip")
			.header("Server", "gws");
	}
	
	@Test(priority = 2)
	void getHeader()
	{
		Response res = given()
				.when()
					.get("https://www.google.com/");
		
		String headersValue = res.getHeader("Content-Type");
		System.out.println(headersValue);
					
	}
}
