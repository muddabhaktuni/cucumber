package stepdefinitions;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;


@RunWith(Cucumber.class)
public class verifyingsearchresultspage {
	//WebDriver driver;
	

	/*
	 * @FindBy(how=How.CSS,using="[class*='New Error']") WebElement highlight;
	 * 
	 * @FindBy(how=How.CSS,using="[class*=' Enter-Zip-City-or New Error']")
	 * WebElement errormsg;
	 */
	/*
	 * HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	 */

	@Given("^User Already in HomePage$")
	public void already_in_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver.exe");
		Driver.driver=new ChromeDriver();
		Driver.driver.manage().window().maximize();
		Driver.driver.get("https://www.seniorhousingnet.com/");

	}

	@When("^title of Home page is Senior Housing Senior Living Senior Apartments$")
	public void title_of_home_page_is_senior_housing_net() throws Throwable {
		String title=Driver.driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Senior Housing | Senior Living | Senior Apartments", title);

	}



	@Then("^enter \"(.*)\" and city name$") public void ss(String statename){
		Driver.driver.findElement(By.id("searchHomeLocation")).sendKeys(statename);
		Driver.driver.findElement(By.id("SeniorLivingOption")).click(); 
		List<WebElement> elements=Driver.driver.findElements(By.className("hp_fslInput")); int
		size=elements.size(); int randomNumber =
		ThreadLocalRandom.current().nextInt(0, size);
		elements.get(randomNumber).click();


	}

	@Then("^user clicks on Search Button$") public void user_clicks_on_srp_button()
			throws InterruptedException {
		Driver.driver.findElement(By.className("See-Homes")).click(); Thread.sleep(5000);

	}

	@And("^user is on particular city page$") public void
	user_is_on_particular_city_page() throws Throwable { 
	HomePage homepage = PageFactory.initElements(Driver.driver, HomePage.class);
	String name =homepage.SearchValueRetrieve.getAttribute("value"); 
	String[] spl=name.split(","); 
	WebElement cityElement=Driver.driver.findElement(By.xpath("//*[@id=\"divBreadcrumb\"]/div[4]/a")); 
	String br = cityElement.getText(); String[] citysplit=br.split("\\s");
	System.out.println("City name is: "+citysplit[0]);
	Assert.assertEquals(spl[0], citysplit[0]);



	}

	@Then("^Search box highlighted with warning$") public void
	search_box_highlighted_with_warning() throws InterruptedException{
		HomePage homepage = PageFactory.initElements(Driver.driver, HomePage.class);
		if(homepage.errormsg.isDisplayed()) 
		{ 
			System.out.println("Test passed");   
		}
		else 
		{ 
			System.out.println("Test Failed"); 
		}



		// homepage.colorChange();


	} 
}

