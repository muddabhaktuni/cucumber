package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import Pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class verifyingAdviceAndPlanning {
	
	
	HomePage homepage = PageFactory.initElements(Driver.driver, HomePage.class);
	
	@When("^clicks on Advice and Planning$")
	public void clickingOnAdviceandPlanning() throws InterruptedException {
		homepage.AdviceAndPlanning.click();
		Thread.sleep(2000);
		
	}
	
	@Then("^veriy page title$")
	public void verifyingTitle() {
		String title = Driver.driver.getTitle();
		if(title.equalsIgnoreCase("Advice & Planning | Retirement Communities | Senior Housing")) {
			System.out.println("Title matches");
		}
		else {
			Assert.assertTrue(false);
		}
	}
}
