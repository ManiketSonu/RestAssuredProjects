package DigiCAssignment;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HTTPREQ {
	
	
	// Get request...
	@Test(priority = 1)
	void getUsers()
	{
		baseURI = "https://dummy.restapiexample.com/api/v1";
		
		Response response = given()
	            .relaxedHTTPSValidation()
	            .when()
	                .get("/employees");
		
//		 given()
//				.relaxedHTTPSValidation()
//				.when()
//					.get("/employees")
//				
//				.then()
//					.statusCode(409)
//					.extract()
//					.response();
		
		System.out.println("Response body: " + response.getBody().asString());
		
		response.then().statusCode(409);
		
		 
		JsonPath jsonPath = response.jsonPath();
		System.out.println("First employee name:" + jsonPath.getString("data[0].employee_name"));
				
	}
	
	// Post request
	@Test(priority = 2)
	void postUserDetails()
	{
		baseURI = "https://restful-booker.herokuapp.com";
		
		Map<String, Object> bookingDetails = new HashMap<String, Object>();
        bookingDetails.put("firstname", "Jim");
        bookingDetails.put("lastname", "Brown");
        bookingDetails.put("totalprice", 111);
        bookingDetails.put("depositpaid", true);
        
        Map<String, String> bookingDates = new HashMap<String, String>();
        bookingDates.put("checkin", "2021-07-01");
        bookingDates.put("checkout", "2021-07-02");
        bookingDetails.put("bookingdates", bookingDates);
        bookingDetails.put("additionalneeds", "Breakfast");
        
        Response response = given()
                .contentType(ContentType.JSON)
                .body(bookingDetails)
                .when()
                .post("/booking")
                .then()
                .statusCode(200)
                .extract()
                .response();

            JsonPath jsonPath = response.jsonPath();
            System.out.println("Booking ID: " + jsonPath.getInt("bookingid"));
	}
	
	@Test(priority = 3)
	void PutRequest()
	{
		baseURI = "https://jsonplaceholder.typicode.com";

        Map<String, Object> updateDetails = new HashMap<String, Object>();
        updateDetails.put("title", "foo");
        updateDetails.put("body", "bar");
        updateDetails.put("userId", 1);
        
        Response response = given()
                .contentType(ContentType.JSON)
                .body(updateDetails)
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)
                .extract()
                .response();

            JsonPath jsonPath = response.jsonPath();
            
            System.out.println("Updated User Details: " + response.getBody().asString());

            // Print specific fields from the response to confirm the update
            System.out.println("Updated Title: " + jsonPath.getString("title"));
            System.out.println("Updated Body: " + jsonPath.getString("body"));
            System.out.println("Updated User ID: " + jsonPath.getString("userId"));
            
            /*
             
             *-- Find the minimum and maximum salary from the employees table.
			SELECT MIN(salary) AS MinSalary, MAX(salary) AS MaxSalary
			FROM employees;

             *Group By clause
             *-- Find the total salary of employees in each department
			SELECT department_id, SUM(salary) AS TotalSalary
			FROM employees
			GROUP BY department_id;

             *Inner Join
             *-- Fetch employee names and their department names by joining employees and departments tables
			SELECT e.employee_name, d.department_name
			FROM employees e
			INNER JOIN departments d
			ON e.department_id = d.department_id;

             *Left Join
             *-- Fetch all employees and their departments (even if they don't belong to a department)
			SELECT e.employee_name, d.department_name
			FROM employees e
			LEFT JOIN departments d
			ON e.department_id = d.department_id;

             *Right Join
             *-- Fetch all departments and the employees assigned to them
			SELECT e.employee_name, d.department_name
			FROM employees e
			RIGHT JOIN departments d
			ON e.department_id = d.department_id;

             *CROSS Join
             *-- Get the Cartesian product of employees and departments
			SELECT e.employee_name, d.department_name
			FROM employees e
			CROSS JOIN departments d;
			
			Top five salary
			SELECT salary
			FROM employees
			ORDER BY salary DESC
			LIMIT 5;

             */
	}
}
