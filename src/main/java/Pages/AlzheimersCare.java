package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlzheimersCare {
	public  WebDriver driver;
	
	@FindBy(how=How.CSS,using="[class*='nav navbar'] [title*='Alzheimer’s Care']")
	public static WebElement AlzheimerCare;

}
