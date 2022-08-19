package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "Features",
		glue = "stepDefs",
		plugin = { "pretty", "html:target/cucumber-reports.html" },
		tags = "@smoke"
		
		
		)


public class TestRunner {

}
