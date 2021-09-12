package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public ChromeDriver driver;

	@Given("Open the Chrome Browser")
	public void open_the_chrome_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("Load the application url {string}")
	public void load_the_application_url(String url) {
		driver.get(url);
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		boolean status = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (status)
			System.out.println("Home page displayed");
		else
			System.out.println("No Homepage");
	}

	@But("Error message should be displayed")
	public void errorMessage() {
		System.out.println("Error message");
	}

}
