package allovercommerce.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:test-output/failed_scenario.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:output/directory",
        },
        features = "src/test/resources/features",
        glue = {"allovercommerce/step_definitions", "allovercommerce/hooks"},
        tags = "@US20a",
        dryRun = false

)

public class Runner {
}
