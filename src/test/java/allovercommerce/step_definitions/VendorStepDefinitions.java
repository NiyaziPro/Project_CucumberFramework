package allovercommerce.step_definitions;

import allovercommerce.pages.MainPage;
import allovercommerce.utilities.ActionsUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class VendorStepDefinitions {
    MainPage mainPage = new MainPage();

    @Given("click the Sign out button")
    public void clickTheSignOutButton() {
        mainPage.homePage.signOutButton.click();
    }

    @When("click Addresses button")
    public void clickAddressesButton() {
        mainPage.myAccountPage.adressesLink.click();
    }

    @And("click Add-> link under the Billing Address")
    public void clickAddLinkUnderTheBillingAddress() {
        mainPage.vendorAddressesPage.billingAddressADDButton.click();

    }

    @Then("verifies that the email address has arrived automatically.")
    public void verifiesThatTheEmailAddressHasArrivedAutomatically() {
        ActionsUtils.scrollToElementUsingActions(mainPage.vendorAddressesPage.emailAddressBox);
        Assert.assertNotNull(mainPage.vendorAddressesPage.emailAddressBox.getAttribute("value"));
    }

    @Then("enter a valid data in the First name box: {string}")
    public void enterAValidDataInTheFirstNameBox(String firstName) {
        mainPage.vendorAddressesPage.firstNameBox.clear();
        mainPage.vendorAddressesPage.firstNameBox.sendKeys(firstName);

    }

    @And("enter a valid data in the Last name box: {string}")
    public void enterAValidDataInTheLastNameBox(String lastName) {
        mainPage.vendorAddressesPage.lastNameBox.clear();
        mainPage.vendorAddressesPage.lastNameBox.sendKeys(lastName);
    }

    @And("select a country in the Country-Region box: {string}")
    public void selectACountryInTheCountryRegionBox(String country) {
        mainPage.vendorAddressesPage.openCountryDropDown.click();
        mainPage.vendorAddressesPage.inputForDropDownBox.sendKeys(country, Keys.ENTER);
    }

    @And("enter a valid data in the Street address box: {string}")
    public void enterAValidDataInTheStreetAdressBox(String address) {
        mainPage.vendorAddressesPage.streetAddressBox.clear();
        mainPage.vendorAddressesPage.streetAddressBox.sendKeys(address);
    }

    @And("enter a valid data in the Town-City box: {string}")
    public void enterAValidDataInTheTownCityBox(String city) {
        mainPage.vendorAddressesPage.townCityBox.clear();
        mainPage.vendorAddressesPage.townCityBox.sendKeys(city);
    }

    @And("enter a valid data in the ZIP Code box: {string}")
    public void enterAValidDataInTheZIPCodeBox(String zipCode) {
        mainPage.vendorAddressesPage.postZipCodeBox.clear();
        mainPage.vendorAddressesPage.postZipCodeBox.sendKeys(zipCode);
    }

    @And("enter a valid data in the Phone box: {string}")
    public void enterAValidDataInThePhoneBox(String phoneNumber) {
        mainPage.vendorAddressesPage.phoneBox.clear();
        mainPage.vendorAddressesPage.phoneBox.sendKeys(phoneNumber);
    }

    @Then("verifies than Vendor Billing Address {string},{string},{string},{string},{string},{string},{string} can be entered.")
    public void verifiesThanVendorBillingAddressCanBeEntered(String firstName, String lastName, String country, String street, String city, String zipCode, String phone) {
        Assert.assertEquals(mainPage.vendorAddressesPage.firstNameBox.getAttribute("value"),firstName);
        Assert.assertEquals(mainPage.vendorAddressesPage.lastNameBox.getAttribute("value"),lastName);
        Assert.assertEquals(mainPage.vendorAddressesPage.countryRegionBox.getText(),country);
        Assert.assertEquals(mainPage.vendorAddressesPage.streetAddressBox.getAttribute("value"),street);
        Assert.assertEquals(mainPage.vendorAddressesPage.townCityBox.getAttribute("value"),city);
        Assert.assertEquals(mainPage.vendorAddressesPage.postZipCodeBox.getAttribute("value"),zipCode);
        Assert.assertEquals(mainPage.vendorAddressesPage.phoneBox.getAttribute("value"),phone);
    }

    @Then("leave the First name box blank")
    public void leaveTheFirstNameBoxBlank() {
        mainPage.vendorAddressesPage.firstNameBox.clear();
    }

    @And("leave the Last name box blank")
    public void leaveTheLastNameBoxBlank() {
        mainPage.vendorAddressesPage.lastNameBox.clear();
    }

    @And("leave a country in the Country-Region box blank")
    public void leaveACountryInTheCountryRegionBoxBlank() {

    }

    @And("leave the Street address box blank")
    public void leaveTheStreetAddressBoxBlank() {
        mainPage.vendorAddressesPage.streetAddressBox.clear();
    }

    @And("leave the Town-City box blank")
    public void leaveTheTownCityBoxBlank() {
        mainPage.vendorAddressesPage.townCityBox.clear();
    }

    @And("leave the ZIP Code box blank")
    public void leaveTheZIPCodeBoxBlank() {
        mainPage.vendorAddressesPage.postZipCodeBox.clear();
    }

    @And("leave the Phone box blank")
    public void leaveThePhoneBoxBlank() {
        mainPage.vendorAddressesPage.phoneBox.clear();
    }
    @And("click Save Address button")
    public void clickSaveAddressButton() {
        ActionsUtils.scrollToElementUsingActions(mainPage.vendorAddressesPage.saveAddressButton);
        mainPage.vendorAddressesPage.saveAddressButton.click();
    }

    @Then("verifies than required fields cannot be left blank.")
    public void verifiesThanRequiredFieldsCannotBeLeftBlank() {
        for (WebElement w : mainPage.vendorAddressesPage.alertMessageList){
            System.out.println("Alert : " + w.getText());
            Assert.assertTrue(w.isDisplayed());
        }
    }

    @Then("verifies that the Vendor Billing Address can be added.")
    public void verifiesThatTheVendorBillingAddressCanBeAdded() {
        Assert.assertTrue(mainPage.vendorAddressesPage.addressChangedSuccessfullyMsg.isDisplayed());
    }

    @And("click Edit your Billing Address-> link under the Billing Address")
    public void clickEditYourBillingAddressLinkUnderTheBillingAddress() {
        mainPage.vendorAddressesPage.editYourBillingAddress.click();
    }

    @Then("verifies that First name,Last name and Email address arrive automatically.")
    public void verifiesThatFirstNameLastNameAndEmailAddressArriveAutomatically() {
        Assert.assertNotNull(mainPage.vendorAddressesPage.firstNameBox.getAttribute("value"));
        Assert.assertNotNull(mainPage.vendorAddressesPage.lastNameBox.getAttribute("value"));
        Assert.assertNotNull(mainPage.vendorAddressesPage.emailAddressBox.getAttribute("value"));
    }

    @Then("verifies that the Vendor Billing Address can be updated.")
    public void verifiesThatTheVendorBillingAddressCanBeUpdated() {
        Assert.assertTrue(mainPage.vendorAddressesPage.addressChangedSuccessfullyMsg.isDisplayed());
    }

    @Then("enter a space in the First name box")
    public void enterASpaceInTheFirstNameBox() {
        mainPage.vendorAddressesPage.firstNameBox.clear();
        mainPage.vendorAddressesPage.firstNameBox.sendKeys(" ");
    }

    @And("enter a space in the Last name box")
    public void enterASpaceInTheLastNameBox() {
        mainPage.vendorAddressesPage.lastNameBox.clear();
        mainPage.vendorAddressesPage.lastNameBox.sendKeys(" ");
    }

    @And("do not select a country in the Country-Region box")
    public void doNotSelectACountryInTheCountryRegionBox() {
    }

    @And("enter a space in the Street address box")
    public void enterASpaceInTheStreetAddressBox() {
        mainPage.vendorAddressesPage.streetAddressBox.clear();
        mainPage.vendorAddressesPage.streetAddressBox.sendKeys(" ");
    }

    @And("enter a space in the Town-City box")
    public void enterASpaceInTheTownCityBox() {
        mainPage.vendorAddressesPage.townCityBox.clear();
        mainPage.vendorAddressesPage.townCityBox.sendKeys(" ");
    }

    @And("enter a space in the ZIP Code box")
    public void enterASpaceInTheZIPCodeBox() {
        mainPage.vendorAddressesPage.postZipCodeBox.clear();
        mainPage.vendorAddressesPage.postZipCodeBox.sendKeys(" ");
    }

    @And("enter a space in the Phone box")
    public void enterASpaceInThePhoneBox() {
        mainPage.vendorAddressesPage.phoneBox.clear();
        mainPage.vendorAddressesPage.phoneBox.sendKeys(" ");
    }

    @Then("verifies that the Vendor Billing Address cannot be added.")
    public void verifiesThatTheVendorBillingAddressCannotBeAdded() {
        for (WebElement w : mainPage.vendorAddressesPage.alertMessageList) {
            System.err.println("Alert : " + w.getText());
            Assert.assertTrue(w.isDisplayed());
        }
    }
}
