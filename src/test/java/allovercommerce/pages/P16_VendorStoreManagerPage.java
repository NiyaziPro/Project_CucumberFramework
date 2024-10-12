package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P16_VendorStoreManagerPage {
    public P16_VendorStoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[contains(text(),'Coupons')]")
    public WebElement couponsLink;

    //locators for specific tabs visible for vendors in store managers
    @FindBy (xpath = "")
    public WebElement smInventory;

    @FindBy (xpath = "")
    public WebElement smShipping;

    @FindBy (xpath = "")
    public WebElement smAttributes;

    @FindBy (xpath = "")
    public WebElement smLinked;

    @FindBy (xpath = "")
    public WebElement smSEO;

    @FindBy (xpath = "")
    public WebElement smAdvanced;



}
