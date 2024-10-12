package allovercommerce.hooks;

import allovercommerce.pages.MainPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.WaitUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hook {
   /* @Before
    public void setUp(){
        MainPage mainPage = new MainPage();
        Driver.getDriver().get(ConfigReader.getProperties("allovercommerce"));
        mainPage.homePage.signIn.click();
        mainPage.loginPage.username.sendKeys(ConfigReader.getProperties("alloverUsername"));
        mainPage.loginPage.password.sendKeys(ConfigReader.getProperties("alloverPassword"));
        mainPage.loginPage.signInButton.click();
        WaitUtils.waitFor(2);
    }*/
    @Before("@US06")
    public void setUp(Scenario scenario) throws Exception{
        if (!scenario.getSourceTagNames().contains("@withoutSignIn")){
            MainPage mainPage = new MainPage();
            Driver.getDriver().get(ConfigReader.getProperties("allovercommerce"));
            mainPage.homePage.signIn.click();
            mainPage.loginPage.username.sendKeys(ConfigReader.getProperties("alloverUsername"));
            mainPage.loginPage.password.sendKeys(ConfigReader.getProperties("alloverPassword"));
            mainPage.loginPage.signInButton.click();
            WaitUtils.waitFor(2);
        }else {
            Driver.getDriver().get(ConfigReader.getProperties("allovercommerce"));
            WaitUtils.waitFor(2);
        }

    }
    @Before("@US12")
    public void setUp1(Scenario scenario) throws Exception{
        if (!scenario.getSourceTagNames().contains("@withoutSignIn")){
            MainPage mainPage = new MainPage();
            Driver.getDriver().get(ConfigReader.getProperties("allovercommerce"));
            mainPage.homePage.signIn.click();
            mainPage.loginPage.username.sendKeys(ConfigReader.getProperties("vendorTestUsername"));
            mainPage.loginPage.password.sendKeys(ConfigReader.getProperties("vendorTestPassword"));
            mainPage.loginPage.signInButton.click();
            WaitUtils.waitFor(2);
        }else {
            Driver.getDriver().get(ConfigReader.getProperties("allovercommerce"));
            WaitUtils.waitFor(2);
        }

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
