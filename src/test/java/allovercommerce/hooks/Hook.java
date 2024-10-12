package allovercommerce.hooks;

import allovercommerce.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hook {
    @Before
    public void setUp() throws Exception{

    }




    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png", scenario.getName());
            Driver.closeDriver();
        }
        Driver.closeDriver();
    }


}
