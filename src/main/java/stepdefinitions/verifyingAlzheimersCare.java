package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import Pages.AlzheimersCare;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class verifyingAlzheimersCare {
	AlzheimersCare ac = PageFactory.initElements(Driver.driver, AlzheimersCare.class);
	
	@When("^clicks Alzheimers Care$")
	public void clickingOnAlzheimersCare() throws InterruptedException {
		AlzheimersCare.AlzheimerCare.click();
		Thread.sleep(2000);
		
	}
	
	@Then("^veriy Alzheimers page title$")
	public void verifyingAlzheimerpageTitle() {
		String title = Driver.driver.getTitle();
		if(title.equalsIgnoreCase("Alzheimer's Care | Dementia Memory Care | SeniorHousingNet")) {
			System.out.println("Title matches");
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
