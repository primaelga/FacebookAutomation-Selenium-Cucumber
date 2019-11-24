package stepdefs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/cucumberHtmlReport"},
		//pretty:target/cucumber-json-report.json
		features = "classpath:features",
		glue="classpath:stepdefs", //the path of the step definition files
		tags = {"@C857","~@ProfileDashboard"},
		dryRun = false,
		strict = true,
		monochrome = true
)

public class RunCukeTest {
}
