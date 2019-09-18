package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class HomePage {
	public  WebDriver driver;

	

	@FindBy(how=How.CSS,using="[class*=' Enter-Zip-City-or New Error']")
	public WebElement errormsg;
	
	@FindAll(@FindBy(how=How.CSS,using="[class*='slick-active']"))
	public WebElement items;
	@FindBy(how=How.CSS,using="[class*='CitiesarrowNext']")
	public WebElement nexticon;
	@FindBy(how=How.CSS,using="[class*='nav navbar'] [title*='Advice & Planning']")
	public WebElement AdviceAndPlanning;
	@FindBy(how=How.XPATH, using="//*[@id='searchSRPLocation']" )
	public WebElement SearchValueRetrieve;
	
	
	/*
	 * public HomePage(WebDriver driver)
	 * 
	 * {
	 * 
	 * this.driver = driver;
	 * 
	 * 
	 * }
	 * 
	 * // This method will take two arguments ( Username nd Password)
	 * 
	 * public void colorChange() throws InterruptedException{
	 * 
	 * Thread.sleep(2000); HomePage homepage = PageFactory.initElements(driver,
	 * HomePage.class); if(homepage.highlight.isDisplayed()) {
	 * System.out.println("Test passed"); } else {
	 * System.out.println("Test Failed"); }
	 * 
	 * 
	 * }
	 * 
	 */

}



