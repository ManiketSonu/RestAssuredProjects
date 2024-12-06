package WaysToCreatePOSTReq;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostRequest {
	//post request body using HashMap
	//post request body creation using Org.json
	//post request body creating using POJO class
	//post request using external JSON file data
	
	
	//post request body using HashMap
//	@Test(priority = 1)
	void testPostUsingHashMap()
	{
		HashMap data = new HashMap();
		data.put("name", "Sonu");
		data.put("email", "sinu@gmail.com");
		data.put("course", "RestAssuredApplication");
		
		given()
			.contentType("application/json")
			.body(data)
			
		.when()
			.post("http://localhost:3000/students")
		
		.then()
			.statusCode(201)
			.body("name", equalTo("Sonu"))
			.body("email", equalTo("sinu@gmail.com"))
			.body("course", equalTo("RestAssuredApplication"))
			.log().all();
			
	}
	
	//Deleting Student record
//	@Test(priority = 2)
	void deleteStudentRecord()
	{
		given()
		
		.when()
			.delete("http://localhost:3000/students/6")
			
		.then()
			.statusCode(200);
			
	}
	
	
	//post request body creation using Org.json
//	@Test(priority = 1)
	void testPostUsingOrgJSON()
	{
		JSONObject data = new JSONObject();
		
		data.put("name", "Sonu");
		data.put("email", "sinu@gmail.com");
		data.put("course", "RestAssuredApplication");
		
		given()
			.contentType("application/json")
			.body(data.toString())
			
		.when()
			.post("http://localhost:3000/students")
		
		.then()
			.statusCode(201)
			.body("name", equalTo("Sonu"))
			.body("email", equalTo("sinu@gmail.com"))
			.body("course", equalTo("RestAssuredApplication"))
			.log().all();
			
	}
	
//	@Test(priority = 2)
	void testDelete()
	{
		given()
		
		.when()
			.delete("http://localhost:3000/students/6")
			
		.then()
			.statusCode(404);
			
	}
	
	
	//post request body creation using POJO class
		@Test(priority = 1)
		void testPostUsingPojoClass()
		{
			PojoClass data = new PojoClass();
			data.setName("Sonu");
			data.setEmail("manikbhai@gmail.com");
			data.setCourse("Computer science engineering");
			
			given()
				.contentType("application/json")
				.body(data)
				
			.when()
				.post("http://localhost:3000/students")
			
			.then()
				.statusCode(201)
				.body("name", equalTo("Sonu"))
				.body("email", equalTo("manikbhai@gmail.com"))
				.body("course", equalTo("Computer science engineering"))
				.log().all();
				
		}
		
		@Test(priority = 2)
		void TestDelete()
		{
			given()
			
			.when()
				.delete("http://localhost:3000/students/6")
				
			.then()
				.statusCode(404);
				
		}
}
