package stepsdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("browser is open");
//	    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    System.out.println("user is on search page");
	    driver.navigate().to("https://google.com");
	    driver.findElement(By.name("q")).sendKeys("selenium");
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
	    System.out.println("enter text in text are");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@And("hits enter")
	public void hits_enter() {
	    System.out.println("hits enter");
	}

	@Then("user navigated to search results")
	public void user_navigated_to_search_results() {
	    System.out.println("navigate to search box");
	}
}
