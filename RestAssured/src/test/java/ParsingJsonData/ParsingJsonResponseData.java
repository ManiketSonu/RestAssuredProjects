package ParsingJsonData;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ParsingJsonResponseData {
	
	@Test(priority=1)
	void testJsonRespose()
	{
		//Approach-1
		given()
			.contentType("ContentType.json")
			
		.when()
			.get("http://localhost:3000/store")
		
		.then()
			.statusCode(200)
			.header("Content-Type", "application/json; charset=utf-8")
			.body("book[0].title", equalTo("Lord Of the Rings"))
			.body("book[1].title", equalTo("Vikings"))
			.body("book[2].title", equalTo("tree seher me"))
			.body("book[3].title", equalTo("Conor vs Khabib"))
			.body("book[4].title", equalTo("Goa wale"))
			.body("book[5].title", equalTo("Marwa ke manegi"));
			
	}
	
	@Test(priority = 2)
	void testJsonResponse()
	{
		Response res = given()
			.contentType("ContentType.json")
			
		.when()
			.get("http://localhost:3000/store");
			
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");
		
		String bookname = res.jsonPath().get("book[0].title").toString();
		Assert.assertEquals(bookname, "Lord Of the Rings");
		
		
		String bookname1 = res.jsonPath().get("book[1].title").toString();
		Assert.assertEquals(bookname1, "Vikings");
		
		String bookname2 = res.jsonPath().get("book[2].title").toString();
		Assert.assertEquals(bookname2, "tree seher me");
		
		String bookname3 = res.jsonPath().get("book[3].title").toString();
		Assert.assertEquals(bookname3, "Conor vs Khabib");
		
		String authorName = res.jsonPath().get("book[0].author").toString();
		Assert.assertEquals(authorName,"Maniket");
		
		String authorName1 = res.jsonPath().get("book[1].author").toString();
		Assert.assertEquals(authorName1,"Sonu");
		
		String authorName2 = res.jsonPath().get("book[2].author").toString();
		Assert.assertEquals(authorName2,"Monu");
		
	}
	
	@Test(priority = 3)
	void testJsonObject()
	{
		Response res = given()
				.contentType("ContentType.json")
				
			.when()
				.get("http://localhost:3000/store");
		
		String responseBody = res.getBody().asString();
		
		JSONObject jo = new JSONObject(responseBody);
		
		JSONArray books = jo.getJSONArray("book");
		
		for(int i=0;i<books.length();i++)
		{
			String bookTitle = books.getJSONObject(i).getString("title");
			System.out.println(bookTitle);
		}
	}
}
