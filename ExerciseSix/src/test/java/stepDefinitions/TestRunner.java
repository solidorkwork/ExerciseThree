
package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinitions","utilities"}, monochrome = true, plugin = {"pretty","junit:target/JunitReports/report.xml"})

public class TestRunner {
	

}
