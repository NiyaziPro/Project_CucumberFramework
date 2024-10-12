package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P08_ProductPage {
    public P08_ProductPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(css = ".compare-popup-overlay")
    public WebElement pageWrapper;

    @FindBy (css = "li.product-wrap:nth-of-type(1)")
    public WebElement firstProduct;

    @FindBy (css = "li.product-wrap:nth-of-type(1) a.compare")
    public WebElement compareFirstProduct;

    @FindBy (css = "li.product-wrap:nth-of-type(2)")
    public WebElement secondProduct;

    @FindBy (css = "li.product-wrap:nth-of-type(2) a.compare")
    public WebElement compareSecondProduct;

    @FindBy (css = "li.product-wrap:nth-of-type(3)")
    public WebElement thirdProduct;

    @FindBy (css = "li.product-wrap:nth-of-type(3) a.compare")
    public WebElement compareThirdProduct;

    @FindBy (css = "li.product-wrap:nth-of-type(4)")
    public WebElement fourthProduct;

    @FindBy (css = "li.product-wrap:nth-of-type(4) a.compare")
    public WebElement compareFourthProduct;

    @FindBy (css = ".compare-popup .btn-dark")
    public WebElement startCompare;

    public boolean isAddToCartButtonVisible() {
        try {
            return addToCartButton.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;

        }
    }






}
