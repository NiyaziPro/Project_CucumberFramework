package allovercommerce.step_definitions;

import allovercommerce.pages.MainPage;
import allovercommerce.utilities.ActionsUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class UserStory20_StepDefinitions {
    MainPage mainPage = new MainPage();

    @And("click the Orders button")
    public void clickTheOrdersButton() {
        mainPage.myAccountPage.ordersLink.click();
    }

    @And("click the Go Shop button")
    public void clickTheGoShopButton() {
        ActionsUtils.scrollToElementUsingActions(mainPage.ordersPage.goShopButton);
        mainPage.ordersPage.goShopButton.click();
    }

    @Then("verifies that selected product has been added to the cart.")
    public void verifiesThatSelectedProductHasBeenAddedToTheCart() {
        WebElement addedMsg = mainPage.shoppingPage.hasBeenAddedToCartMsg;
        WaitUtils.waitForVisibility(addedMsg,5);
        Assert.assertTrue(addedMsg.isDisplayed());
    }

    @Then("verifies added product is visible in the Cart.")
    public void verifiesAddedProductIsVisibleInTheCart() {
        Assert.assertTrue(mainPage.checkOutPage.productList.stream().anyMatch(t->t.getText().contains("bag")));
    }

    @Then("verifies that Billing details come automatically.")
    public void verifiesThatBillingDetailsComeAutomatically() {
        Assert.assertFalse(mainPage.checkOutPage.billingDetailsList.stream().allMatch(t->t.getAttribute("value").isEmpty()));
    }

    @Then("verifies that the total amount to be paid is visible.")
    public void verifiesThatTheTotalAmountToBePaidIsVisible() {
        Assert.assertTrue(mainPage.checkOutPage.orderTotal.isDisplayed());
    }

    @And("click the Wire transfer-EFT radio button")
    public void clickTheWireTransferEFTRadioButton() {
        WebElement wireTransferEft = mainPage.checkOutPage.wireTransferEftRadioButton;
        ActionsUtils.scrollToElementUsingActions(wireTransferEft);
        if (!wireTransferEft.isSelected()){
            wireTransferEft.click();
        }
    }

    @Then("verifies that can select the Wire transfer-EFT options.")
    public void verifiesThatCanSelectTheWireTransferEFTOptions() {
        Assert.assertTrue(mainPage.checkOutPage.wireTransferEftRadioButton.isSelected());
    }

    @And("click the Pay at the door radio button")
    public void clickThePayAtTheDoorRadioButton() {
        WebElement payAtTheDoor = mainPage.checkOutPage.payAtTheDoorRadioButton;
        ActionsUtils.scrollToElementUsingActions(payAtTheDoor);
        if (!payAtTheDoor.isSelected()){
            payAtTheDoor.click();
        }
    }

    @Then("verifies that can select the Pay at the door options.")
    public void verifiesThatCanSelectThePayAtTheDoorOptions() {
        Assert.assertTrue(mainPage.checkOutPage.payAtTheDoorRadioButton.isSelected());
    }

    @And("click the Place Order button")
    public void clickThePlaceOrderButton() {
        ActionsUtils.scrollToElementUsingActions(mainPage.checkOutPage.placeOrderButton);
        mainPage.checkOutPage.placeOrderButton.click();
    }

    @Then("verifies that the purchase is complete.")
    public void verifiesThatThePurchaseIsComplete() {
        WaitUtils.waitForVisibility(mainPage.orderCompletePage.orderCompletedMsg,25);
        Assert.assertTrue(mainPage.orderCompletePage.orderCompletedMsg.isDisplayed());
    }

    @Then("wait until the page loaded")
    public void waitUntilThePageLoaded() {
        WaitUtils.waitForPageToLoad(25);
    }

    @Then("verifies that the details of the purchase made can be seen.")
    public void verifiesThatTheDetailsOfThePurchaseMadeCanBeSeen() {
        List<WebElement> orders =  mainPage.ordersPage.ordersList;

        for (int i = 0; i < orders.size(); i++) {
            if (i==0){
                orders.get(i).click();
            }
        }
        WaitUtils.waitFor(2);
        Assert.assertTrue(mainPage.ordersPage.orderDetails.isDisplayed());
    }

    @And("click the Enter Your Code link")
    public void clickTheEnterYourCodeLink() {
        mainPage.checkOutPage.enterYourCouponCode.click();
    }

    @Then("enter a generated Coupon code in the opened box : {string}")
    public void enterAGeneratedCouponCodeInTheOpenedBox(String couponCode) {
        mainPage.checkOutPage.inputCouponCode.sendKeys(couponCode);
    }

    @And("click the Apply Coupon button")
    public void clickTheApplyCouponButton() {
        mainPage.checkOutPage.applyCouponButton.click();
    }

    @Then("verifies that can shop as a Vendor with the created Coupon.")
    public void verifiesThatCanShopAsAVendorWithTheCreatedCoupon() {
        Assert.assertTrue(mainPage.checkOutPage.alertCouponMsg.isDisplayed());
    }
}
