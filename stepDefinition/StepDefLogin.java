package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLogin extends BaseHooks {
	
	@Given("Enter the Login username as {string}")
	public void enter_the_username_as_demosalesmanager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the Login password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on the Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Login Homepage should be displayed")
	public void homepage_should_be_displayed() {
		boolean status = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(status);
		System.out.println("Home page displayed");
	}

	@But("Error message should be displayed")
	public void errorMessage() {
		System.out.println("Error message");
	}


}
