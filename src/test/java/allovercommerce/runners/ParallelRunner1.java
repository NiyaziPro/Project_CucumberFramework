package allovercommerce.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-reports/cucumber1.xml",
                "rerun:test-output/failed_scenario1.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:output/directory",

                "pretty",


        },
        features = "src/test/resources/features",
        glue = {"allovercommerce/step_definitions","allovercommerce/hooks"},
        tags ="@US20a",
        dryRun = false

)

public class ParallelRunner1 {

}
