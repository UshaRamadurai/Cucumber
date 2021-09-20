package stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefn extends BaseClass {

	String firstText;
	Set<String> allWindows;
	List<String> allhandles;
	String leadID;

	@Then("Verify the update")
	public void verify_update() {
		boolean displayed = driver.findElement(By.xpath("//span[contains(text(),'Feathers')]")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("TEst pass!! Updation successful");
	}

	@Then("Edit the Company name as {string}")
	public void update_coName(String comName) {
		WebElement coName = driver.findElement(By.id("updateLeadForm_companyName"));
		coName.clear();
		coName.sendKeys(comName);
	}

	@Given("Click the Email tab")
	public void clickEmail() {
		driver.findElement(By.xpath("//span[text() = 'Email']")).click();
	}

	@Given("Enter the email as {string}")
	public void inputEmail(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@Then("Click on the first resulting first name")
	public void first_fname() throws InterruptedException {
		Thread.sleep(3000);
		WebElement firstLead = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a"));
		firstText = firstLead.getText();
		firstLead.click();
	}

	@Then("Verify the Duplicate")
	public void verify_dup() {
		String dupText = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(firstText, dupText);
		System.out.println("Test Pass !! Duplicate created");
	}

	@When("Click the Lookup {string}")
	public void lookup(String number) {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[" + number + "]")).click();
		 allWindows = driver.getWindowHandles();
		 allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}

	@When ("Search and select for the first name {string}")
	public void select_fname(String fname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
	
	}
	
		@Then("Click the Merge button")
	public void merge() {
			leadID = driver.findElement(By.id("ComboBox_partyIdFrom")).getAttribute("valuenow");
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}
	
	@Then ("Verify the merge")
	public void verify_merge() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Merge Successful");
		} else {
			System.out.println("Merge not Successful ");
		}
		
	}
}
