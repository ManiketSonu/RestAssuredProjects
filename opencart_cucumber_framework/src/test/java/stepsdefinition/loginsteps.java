package stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		 System.out.println("user is entering username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		 System.out.println("user is clck on login button");
	}

	@Then("user navigate to the home page")
	public void user_navigate_to_the_home_page() {
		 System.out.println("user is on home page");
	}
}
