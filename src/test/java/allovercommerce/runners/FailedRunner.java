package allovercommerce.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:testOutput/failed_scenario.txt",

                "pretty",


        },
        features = "@testOutput/failed_scenario.txt",
        glue = {"allovercommerce/step_definitions","allovercommerce/hooks"},
        dryRun = false

)

public class FailedRunner {

}
