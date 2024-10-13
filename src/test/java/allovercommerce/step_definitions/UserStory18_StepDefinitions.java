package allovercommerce.step_definitions;

import allovercommerce.pages.MainPage;
import allovercommerce.utilities.ActionsUtils;
import allovercommerce.utilities.BrowserUtils;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserStory18_StepDefinitions {
    MainPage mainPage = new MainPage();

    @When("click on Store Manager")
    public void clickOnStoreManager() {
        mainPage.myAccountPage.storeManagerLink.click();
    }

    @And("click on Coupons")
    public void clickOnCoupons() {
        mainPage.vendorStoreManagerPage.couponsLink.click();
    }

    @Then("click the Add New button")
    public void clickTheAddNewButton() {
        mainPage.vendorCouponsPage.addNewButton.click();
        ActionsUtils.scrollToElementUsingActions(mainPage.vendorCouponsPage.showOnStoreCheckBox);
    }

    String codeNameText;
    @And("enter a Coupon code in the Code box: {string}")
    public void enterACouponCodeInTheCodeBox(String codeName) {
        codeNameText=codeName;
        mainPage.vendorCouponsPage.codeBox.sendKeys(codeName, Keys.TAB);

    }

    @Then("verifies that can type a code in the Codebox.")
    public void verifiesThatCanTypeACodeInTheCodebox() {
        Assert.assertEquals(mainPage.vendorCouponsPage.codeBox.getAttribute("value"),codeNameText);
    }

    String descriptionText;
    @And("enter a description in the Description box: {string}")
    public void enterADescriptionInTheDescriptionBox(String description) {
        descriptionText=description;
        mainPage.vendorCouponsPage.descriptionBox.sendKeys(description, Keys.TAB);
    }

    @Then("verifies that can type description in the Descriptionbox.")
    public void verifiesThatCanTypeDescriptionInTheDescriptionbox() {
        Assert.assertEquals(mainPage.vendorCouponsPage.descriptionBox.getAttribute("value"),descriptionText);
    }

    @And("select Percentage discount in the Discount Type section")
    public void selectPercentageDiscountInTheDiscountTypeSection() {
        BrowserUtils.dropdownSelectByValue(mainPage.vendorCouponsPage.discountTypeDropDown,"percent");
    }

    @Then("verifies that can select Percentage discount.")
    public void verifiesThatCanSelectPercentageDiscount() {
        Assert.assertEquals(mainPage.vendorCouponsPage.discountTypeDropDown.getAttribute("value"),"percent");
    }

    @And("select Fixed Product Discount in the Discount Type section")
    public void selectFixedProductDiscountInTheDiscountTypeSection() {
        BrowserUtils.dropdownSelectByValue(mainPage.vendorCouponsPage.discountTypeDropDown,"fixed_product");
    }

    @Then("verifies that can select Fixed Product Discount.")
    public void verifiesThatCanSelectFixedProductDiscount() {
        Assert.assertEquals(mainPage.vendorCouponsPage.discountTypeDropDown.getAttribute("value"),"fixed_product");
    }

    String amountData;
    @And("enter a discount amount in the Coupon amount box: {string}")
    public void enterADiscountAmountInTheCouponAmountBox(String amount) {
        amountData=amount;
        mainPage.vendorCouponsPage.couponAmountBox.sendKeys(amount, Keys.TAB);
    }

    @Then("verifies that can entered discount amount in the Coupon Amount box.")
    public void verifiesThatCanEnteredDiscountAmountInTheCouponAmountBox() {
        Assert.assertEquals(mainPage.vendorCouponsPage.couponAmountBox.getAttribute("value"),amountData);
    }

    @Then("verifies letters cannot be entered in the Coupon Amount box.")
    public void verifiesThatCannotEnterLettersInTheCouponAmountBox() {
        Assert.assertEquals(mainPage.vendorCouponsPage.couponAmountBox.getAttribute("value"),"0");
        Assert.assertNotEquals(mainPage.vendorCouponsPage.couponAmountBox.getAttribute("value"),amountData);
    }

    @Then("verifies special characters cannot be entered in the Coupon Amount box.")
    public void verifiesSpecialCharactersCannotBeEnteredInTheCouponAmountBox() {
        Assert.assertEquals(mainPage.vendorCouponsPage.couponAmountBox.getAttribute("value"),"0");
        Assert.assertNotEquals(mainPage.vendorCouponsPage.couponAmountBox.getAttribute("value"),amountData);
    }

    @Then("verifies negative number cannot be entered in the Coupon Amount box.")
    public void verifiesNegativeNumberCannotBeEnteredInTheCouponAmountBox() {
        Assert.assertEquals(mainPage.vendorCouponsPage.couponAmountBox.getAttribute("value"),"0");
        Assert.assertNotEquals(mainPage.vendorCouponsPage.couponAmountBox.getAttribute("value"),amountData);

    }

    String dateText;
    @And("enter a data in the Coupon expiry date section: {string}")
    public void enterADataInTheCouponExpiryDateSection(String date) {
        dateText=date;
        mainPage.vendorCouponsPage.expiryDatetBox.sendKeys(date, Keys.TAB);
    }

    @Then("verifies that can be entered in the Coupon expiry date section.")
    public void verifiesThatCanBeEnteredInTheCouponExpiryDateSection() {
        Assert.assertEquals(mainPage.vendorCouponsPage.expiryDatetBox.getAttribute("value"),dateText);
    }

    @Then("verifies special characters-letters cannot be entered in the Coupon expiry date section")
    public void verifiesSpecialCharactersLettersCannotBeEnteredInTheCouponExpiryDateSection() {
        Assert.assertNotEquals(mainPage.vendorCouponsPage.expiryDatetBox.getAttribute("value"),dateText);
    }

    @And("click on the Allow free shipping checkbox")
    public void clickOnTheAllowFreeShippingCheckbox() {
        mainPage.vendorCouponsPage.allowFreeShippingCheckBox.click();
    }

    @And("click on the Show on store checkbox")
    public void clickOnTheShowOnStoreCheckbox() {
        mainPage.vendorCouponsPage.showOnStoreCheckBox.click();
    }


    @Then("verifies that the Allow free shipping box is checked")
    public void verifiesThatTheAllowFreeShippingBoxIsChecked() {
        Assert.assertTrue(mainPage.vendorCouponsPage.allowFreeShippingCheckBox.isSelected());
    }

    @Then("verifies that the Show on store box is checked")
    public void verifiesThatTheShowOnStoreBoxIsChecked() {
        Assert.assertTrue(mainPage.vendorCouponsPage.showOnStoreCheckBox.isSelected());
    }

    @And("click Submit button")
    public void clickSubmitButton() {
        ActionsUtils.scrollToElementUsingActions(mainPage.vendorCouponsPage.submitButton);
        mainPage.vendorCouponsPage.submitButton.click();
    }

    @Then("verifies that can create a Coupon as a Vendor.")
    public void verifiesThatCanCreateACouponAsAVendor() {
        ActionsUtils.scrollToElementUsingActions(mainPage.vendorStoreManagerPage.couponsLink);
        mainPage.vendorStoreManagerPage.couponsLink.click();
        Driver.getDriver().navigate().refresh();
        WaitUtils.waitFor(3);
        List<WebElement> coupons = mainPage.vendorCouponsPage.couponsList;
        for (int i = 0; i < coupons.size(); i++) {
            if (i==0){
                Assert.assertEquals(coupons.get(i).getText(),codeNameText);
            }
        }
    }

    @And("leave the Code box blank")
    public void leaveTheCodeBoxBlank() {
        mainPage.vendorCouponsPage.codeBox.clear();
    }

    @And("leave the Description box blank")
    public void leaveTheDescriptionBoxBlank() {
        mainPage.vendorCouponsPage.descriptionBox.clear();
    }

    @And("do not select a discount type in the Discount Type section")
    public void doNotSelectADiscountTypeInTheDiscountTypeSection() {

    }

    @And("leave the Coupon amount box blank")
    public void leaveTheCouponAmountBoxBlank() {
        mainPage.vendorCouponsPage.couponAmountBox.clear();
    }

    @And("leave the Coupon expiry date section blank")
    public void leaveTheCouponExpiryDateSectionBlank() {
        mainPage.vendorCouponsPage.expiryDatetBox.clear();
    }

    @And("don't click on the Allow free shipping checkbox")
    public void dOntClickOnTheAllowFreeShippingCheckbox() {
    }

    @And("don't click on the Show on store checkbox")
    public void dOntClickOnTheShowOnStoreCheckbox() {
    }

    @Then("verifies that cannot create Coupon by leaving the fields blank.")
    public void verifiesThatCannotCreateCouponByLeavingTheFieldsBlank() {
        Assert.assertTrue(mainPage.vendorCouponsPage.cancelledMessage.isDisplayed());
    }
}
