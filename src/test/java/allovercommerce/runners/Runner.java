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

                "pretty", // console'da senaryolarla ilgili ayrintili bilgiler verir - Provides detailed information about scenarios in the console

        },
        features = "src/test/resources/features",
        glue = {"allovercommerce/step_definitions","allovercommerce/hooks"},
        tags ="@TC007",
        dryRun = false

)

public class Runner {}
