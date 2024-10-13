package allovercommerce.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-reports/cucumber2.xml",
                "rerun:testOutput/failed_scenario2.txt",

                "pretty",


        },
        features = "src/test/resources/features",
        glue = {"allovercommerce/step_definitions","allovercommerce/hooks"},
        tags ="@US18 or @US20",
        dryRun = false

)

public class ParallelRunner2 {

}
