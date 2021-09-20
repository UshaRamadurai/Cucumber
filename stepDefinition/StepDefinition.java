package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	String leadId;

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
		Assert.assertTrue(status);
		System.out.println("Home page displayed");
	}
	@When("Click the {string} link")
	public void clickLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}

	@Then("{string} page should be displayed")
	public void verifyPage(String pgName) {
		boolean display = driver.findElement(By.xpath("//div[text()='" + pgName + "']")).isDisplayed();
		Assert.assertTrue(display);
		System.out.println(pgName + " displayed");
	}

	@Given("Enter the {string} as {string}")
	public void inputs(String name, String inputValue) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_" + name + "']")).sendKeys(inputValue);
	}

	@When("Click {string} button")
	public void submit(String button) {
		driver.findElement(By.xpath("//input[@value='" + button + "']")).click();
	}

	@Given("Enter the Phone number as {string}")
	public void phoneNo(String value) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(value);
	}

	@When("Click Find Leads button")
	public void click_findLeads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Click on the first result")
	public void click_firstResult() throws InterruptedException {
		Thread.sleep(3000);
		WebElement searchLink = driver
				.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a"));
		leadId = searchLink.getText();
		System.out.println("The leadId is :" + leadId);
		searchLink.click();
	}

	@Then("Verify the deleted record")
	public void verify_delete() {
		driver.findElement(By.name("id")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		boolean displayed = driver.findElement(By.xpath("//div[text() = 'No records to display']")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("TEst pass!! Delete lead successful");

	}
}
