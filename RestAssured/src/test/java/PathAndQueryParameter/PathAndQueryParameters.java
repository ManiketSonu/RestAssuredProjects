package PathAndQueryParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PathAndQueryParameters {
	
	
	// https://reqres.in/api/users?page=2&id=5
	@Test
	void testQueryAndPathParameters()
	{
		given()
			.pathParam("mypath1", "api") //path parameter
			.pathParam("mypath2", "users") //path parameter
			.queryParam("page", "2") //query parameter
			.queryParam("id", "5") //query parameter
			
		.when()
			.get("https://reqres.in/{mypath1}/{mypath2}")
			
		.then()
			.statusCode(200)
			.log().all();
	}
}
