package allovercommerce.step_definitions;

import allovercommerce.pages.MainPage;
import allovercommerce.utilities.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertFalse;

public class AlloverCommerceStepDefinitions {
    MainPage mainPage = new MainPage();


    @When("click on the search box")
    public void clickOnTheSearchBox() {
        mainPage.homePage.searchbox.click();

    }

    @But("wait {int} seconds")
    public void userWaitsSeconds(int seconds) {
        WaitUtils.waitFor(seconds);
    }

    @And("enter a {string}")
    public void enterA(String productName) {
        mainPage.homePage.searchbox.sendKeys(productName);
    }

    @And("click on the Search 🔍 icon")
    public void clickOnTheSearchIcon() {
        mainPage.homePage.searchboxButton.click();
    }

    @Then("confirms that you can search for any product you want from the search box")
    public void confirmsThatYouCanSearchForAnyProductYouWantFromTheSearchBox() {
        Assert.assertTrue(mainPage.shoppingPage.searchResultsFor.isDisplayed());
    }

    @And("close the page.")
    public void closeThePage() {
        Driver.closeDriver();
    }

    @And("click the Enter ⏎ button")
    public void clickTheEnterButton() {
        mainPage.homePage.searchboxButton.sendKeys(Keys.ENTER);
    }

    @Then("confirms that it sees a message that the product cannot be found")
    public void confirmsThatItSeesAMessageThatTheProductCannotBeFound() {
        Assert.assertTrue(mainPage.shoppingPage.noProductWereFoundMsg.isDisplayed());
    }

    @And("verifies that can make calls.")
    public void verifiesThatYouCanMakeCalls() {
        Assert.assertTrue(mainPage.shoppingPage.searchResultsFor.isDisplayed());
    }

    @And("leave the searchbox blank")
    public void leaveTheSearchboxBlank() {
        mainPage.homePage.searchbox.sendKeys("");
    }

    @Then("verifies that cannot make calls.")
    public void verifiesThatCannotMakeCalls() {
        String inputText = mainPage.homePage.searchbox.getAttribute("value");
        Assert.assertTrue(inputText.isBlank());

    }

    int cartCount;
    String productText;

    @Then("click on the desired product among the products - product number : {int}")
    public void clickOnTheDesiredProductAmongTheProducts(int productNumber) {
        WebElement product = mainPage.shoppingPage.selectedProduct(productNumber - 1);
        cartCount = Integer.parseInt(mainPage.cartPage.cartCount.getText());
        productText = product.getText();
        product.click();
    }

    @And("click Add To Cart button on the product detail page")
    public void clicksTheADDTOCARTButtonOnTheProductDetailPage() {
        mainPage.productPage.addToCartButton.click();
    }

    @Then("verifies that the product has been added to the cart.")
    public void verifiesThatTheProductHasBeenAddedToTheCart() {
        int updateCartCount = Integer.parseInt(mainPage.cartPage.cartCount.getText());
        Assert.assertEquals(updateCartCount, cartCount + 1);
        Assert.assertTrue(updateCartCount > cartCount);
    }

    @Then("goes to the selected product with number : {int}")
    public void goesToTheSearchedProduct(int productNumber) {
        WebElement product = mainPage.shoppingPage.selectedProduct(productNumber - 1);
        productText = product.getText();
        ActionsUtils.hoverOverAndWait(product, 10);
    }

    @And("wait until the Bag icon 👜 appears")
    public void waitUntilTheBagIconAppears() {
        WaitUtils.waitForVisibility(mainPage.shoppingPage.bagIcon(), 10);
    }

    @And("click on the bag 👜icon")
    public void clickOnTheBagIcon() {
        mainPage.shoppingPage.bagIcon().click();
    }

    @Then("verifies if the product has been added to the cart.")
    public void verifiesIfTheProductHasBeenAddedToTheCart() {
        WaitUtils.waitForVisibility(mainPage.shoppingPage.hasBeenAddedToCartMsg, 5);
        Assert.assertTrue(mainPage.shoppingPage.hasBeenAddedToCartMsg.isDisplayed());
    }

    @Then("click on the product that is not in stock - product number : {int}")
    public void clickOnTheProductThatIsNotInStockProductNumber(int productNumber) {
        mainPage.shoppingPage.selectedProduct(productNumber - 1).click();
    }

    @Then("verifies that the 'Add To Cart' button is not visible on the product detail page")
    public void verifiesThatTheADDTOCARTButtonIsNotVisibleOnTheProductDetailPage() {
        Assert.assertFalse(mainPage.productPage.isAddToCartButtonVisible());
    }

    @And("click on the Cart icon")
    public void clickOnTheCartIcon() {
        mainPage.homePage.cart.click();
    }

    @And("click View Cart button in opened tab")
    public void clickViewCartButtonInOpenedTab() {
        JSUtils.JSclickWithTimeout(mainPage.cartPage.viewCartButton);
    }

    @Then("verifies if can see the product in the cart.")
    public void verifiesIfCanSeeTheProductInTheCart() {
        Assert.assertTrue(mainPage.cartPage.doesListContainText(productText));
        Assert.assertFalse(mainPage.cartPage.cartProductsList.isEmpty());
    }

    @Then("verifies that can see the product in the cart.")
    public void verifiesThatCanSeeTheProductInTheCart() {
        Assert.assertTrue(mainPage.cartPage.doesListContainText(productText));
    }

    int quantity;
    int updateQuantity;
    @Then("click the plus ➕ button in the Quantity section")
    public void clickThePlusButtonInTheQuantitySection() {
        quantity = Integer.parseInt(mainPage.cartPage.quantityNumber().getAttribute("value"));
        ActionsUtils.scrollToElementUsingActions(mainPage.cartPage.updateCartButton);
        mainPage.cartPage.quantityPlusButton().click();
    }

    @And("click Update Cart button")
    public void clickUpdateCartButton() {
        ActionsUtils.scrollToElementUsingActions(mainPage.cartPage.updateCartButton);
        mainPage.cartPage.updateCartButton.click();
    }

    @Then("verifies that the quantity of the product has increased.")
    public void verifiesThatTheQuantityOfTheProductHasIncreased() {
        updateQuantity = Integer.parseInt(mainPage.cartPage.quantityNumber().getAttribute("value"));
        Assert.assertEquals(updateQuantity, quantity + 1);
    }

    @And("enter the desired amount in the Quantity section : {string}")
    public void enterTheDesiredAmountInTheQuantitySection(String textOrNumber) {

        mainPage.cartPage.quantityNumber().clear();
        mainPage.cartPage.quantityNumber().sendKeys(textOrNumber);
    }

    @Then("verifies that the quantity of the product has increased with as much as the number entered.")
    public void verifiesThatTheQuantityOfTheProductHasIncreasedWithAsMuchAsTheNumberEntered() {
        int quantity = Integer.parseInt(mainPage.cartPage.quantityNumber().getAttribute("value"));
        Assert.assertEquals(quantity, 10);
    }

    @And("enter the product quantity on the product detail page : {int}")
    public void enterTheProductQuantityOnTheProductDetailPage(int number) {
        mainPage.cartPage.quantityNumber().clear();
        mainPage.cartPage.quantityNumber().sendKeys("5");

    }

    @Then("click the minus ➖ button in the Quantity section")
    public void clickTheMinusButtonInTheQuantitySection() {
        ActionsUtils.scrollToElementUsingActions(mainPage.cartPage.quantityMinusButton());
        quantity = Integer.parseInt(mainPage.cartPage.quantityNumber().getAttribute("value"));
        mainPage.cartPage.quantityMinusButton().click();
    }

    @Then("verifies that the quantity of the product has decreased.")
    public void verifiesThatTheQuantityOfTheProductHasDecreased() {
        updateQuantity = Integer.parseInt(mainPage.cartPage.quantityNumber().getAttribute("value"));
        Assert.assertEquals(updateQuantity, quantity - 1);
    }

    @Then("verifies that cannot enter a negative number.")
    public void verifiesThatCannotEnterANegativeNumber() {
        Assert.assertTrue(mainPage.cartPage.updateCartButton.isEnabled());
        int quantity = Integer.parseInt(mainPage.cartPage.quantityNumber().getAttribute("min"));
        Assert.assertTrue(quantity > 0);
    }

    @And("click Checkout button in the opened tab")
    public void clickCheckoutButtonInTheOpenedTab() {
        JSUtils.JSclickWithTimeout(mainPage.cartPage.checkoutButton);
    }

    @Then("verifies if Billings details are visible.")
    public void verifiesIfBillingsDetailsAreVisible() {
        Assert.assertTrue(areAllElementsDisplayed(mainPage.checkOutPage.billingDetailsList));

    }
    public static boolean areAllElementsDisplayed(List<WebElement> elements) {
        for (WebElement element : elements) {
            if (!element.isDisplayed()) {
                return false;  // Eğer bir element görünmüyorsa false döner
            }
        }
        return true;  // Tüm elementler görünürse true döner
    }

    @Then("verifies that Payment options are visible.")
    public void verifiesThatPaymentOptionsAreVisible() {
        ActionsUtils.scrollToElementUsingActions(mainPage.checkOutPage.placeOrderButton);
        BrowserUtils.verifyElementDisplayed(mainPage.checkOutPage.wireTransferEftRadioButton);
        BrowserUtils.verifyElementDisplayed(mainPage.checkOutPage.payAtTheDoorRadioButton);
    }

    @And("select Wire transfer EFT from Payment Methods")
    public void selectWireTransferEFTFromPaymentMethods() {
        ActionsUtils.scrollToElementUsingActions(mainPage.checkOutPage.wireTransferEftRadioButton);
        if (!mainPage.checkOutPage.wireTransferEftRadioButton.isSelected()){
            mainPage.checkOutPage.wireTransferEftRadioButton.click();
        }
    }

    @Then("verifies that can select Wire transfer EFT.")
    public void verifiesThatCanSelectWireTransferEFT() {
        Assert.assertTrue(mainPage.checkOutPage.wireTransferEftRadioButton.isSelected());
    }

    @And("select Pay at the door from Payment Methods")
    public void selectPayAtTheDoorFromPaymentMethods() {
        ActionsUtils.scrollToElementUsingActions(mainPage.checkOutPage.payAtTheDoorRadioButton);
        if (!mainPage.checkOutPage.payAtTheDoorRadioButton.isSelected()){
            mainPage.checkOutPage.payAtTheDoorRadioButton.click();
        }
    }

    @Then("verifies that can select Pay at the door.")
    public void verifiesThatCanSelectPayAtTheDoor() {
        Assert.assertTrue(mainPage.checkOutPage.payAtTheDoorRadioButton.isSelected());
    }

    @Then("verifies that cannot select Payment Methods all at once.")
    public void verifiesThatCannotSelectPaymentMethodsAllAtOnce() {
        WebElement payAtTheDoor = mainPage.checkOutPage.payAtTheDoorRadioButton;
        WebElement wireTransferEft = mainPage.checkOutPage.wireTransferEftRadioButton;
        ActionsUtils.scrollToElementUsingActions(payAtTheDoor);
        if (!payAtTheDoor.isSelected()){
            payAtTheDoor.click();
        }
        Assert.assertTrue(payAtTheDoor.isSelected());
        Assert.assertFalse(wireTransferEft.isSelected());
        ActionsUtils.waitForElementToBeVisibleAndClick(wireTransferEft,10);
        Assert.assertFalse(payAtTheDoor.isSelected());
        Assert.assertTrue(wireTransferEft.isSelected());
    }

    @And("click Place Order button")
    public void clickPlaceOrderButton() {
        ActionsUtils.scrollToElementUsingActions(mainPage.checkOutPage.placeOrderButton);
        mainPage.checkOutPage.placeOrderButton.click();
    }

    @Then("verifies that can complete the purchase.")
    public void verifiesThatCanCompleteThePurchase() {
        Assert.assertTrue(mainPage.orderCompletePage.orderCompletedMsg.isDisplayed());
    }


}
