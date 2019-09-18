package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Muddabhaktuni\\eclipse-workspace\\Cucumber\\src\\main\\java\\features",
		glue= {"stepdefinitions"},
		plugin= {"pretty","html:text-outOut","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true,
		dryRun=false
		)

public class TestRunner {

}
